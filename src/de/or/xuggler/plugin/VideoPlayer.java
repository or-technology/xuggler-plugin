package de.or.xuggler.plugin;

import de.or.guiUtils.control.ProgressStatusBarModel;

import java.awt.image.BufferedImage;

import javax.sound.sampled.LineUnavailableException;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.apache.log4j.Logger;

import com.xuggle.xuggler.Global;
import com.xuggle.xuggler.IAudioSamples;
import com.xuggle.xuggler.ICodec;
import com.xuggle.xuggler.IContainer;
import com.xuggle.xuggler.IPacket;
import com.xuggle.xuggler.IPixelFormat;
import com.xuggle.xuggler.IStream;
import com.xuggle.xuggler.IStreamCoder;
import com.xuggle.xuggler.IVideoPicture;
import com.xuggle.xuggler.IVideoResampler;
import com.xuggle.xuggler.video.ConverterFactory;
import com.xuggle.xuggler.video.IConverter;

public class VideoPlayer {

    private IStreamCoder videoCoder = null;

    private IStreamCoder audioCoder = null;

    private IContainer container = IContainer.make();

    private long currentTimestamp = 0;

    private long firstTimestampInStream = Global.NO_PTS;

    private long startTime = 0;

    private IVideoPicture picture = null;

    private IPacket packet = null;

    SoundPlayer soundPlayer = new SoundPlayer();

    private String videoFilename = "";

    private VideoPanel screen = null;

    private boolean paused = false;

    private boolean isMute = false;

    ProgressStatusBarModel timeModel = new ProgressStatusBarModel(0, 1, 0, 100);

    public ProgressStatusBarModel getTimeModel()
    {
        return timeModel;
    }

    DefaultBoundedRangeModel volumeModel = new DefaultBoundedRangeModel(50, 1, 0, 100);

    private static final Logger LOGGER = Logger.getLogger(VideoPlayer.class);

    private IConverter converter;

    public VideoPlayer(String videoFilename, VideoPanel screen)
    {
        this.videoFilename = videoFilename;
        this.screen = screen;
        volumeModel.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e)
            {
                int value = volumeModel.getValue();
                if (soundPlayer != null)
                    soundPlayer.setVolume(value);
            }
        });
    }

    public DefaultBoundedRangeModel getVolumeModel()
    {
        return volumeModel;
    }

    public void setPaused(boolean pause)
    {
        paused = pause;
        if (!pause)
        {
            firstTimestampInStream = currentTimestamp;
            startTime = System.currentTimeMillis();
        }
    }

    public boolean isPaused()
    {
        return paused;
    }

    public void setMute(boolean isMute)
    {
        this.isMute = isMute;
    }

    public void setVolume(int volume)
    {
        soundPlayer.setVolume(volume);
    }

    public void seekTo(int percent)
    {
        if (container == null)
            return;

        long seekByte = container.getFileSize() * percent / 100;
        long seekTime = container.getDuration() / videoCoder.getFrameRate().getNumerator() * percent / 100;
        LOGGER.info("jump to " + percent + "% byte=" + seekByte + " time=" + seekTime);

        for (int i = 0; i < container.getNumStreams(); i++)
            container.seekKeyFrame(i, seekTime, IContainer.SEEK_FLAG_BYTE);
        currentTimestamp = seekTime;
        firstTimestampInStream = Global.NO_PTS;
    }

    public void resetDelay()
    {
        firstTimestampInStream = Global.NO_PTS;
        seekTo(0);
    }

    public void updateTimeModel()
    {
        if (picture != null && container != null)
        {
            long currentTime = picture.getTimeStamp();
            long duration = container.getDuration();
            timeModel.setString(picture.getFormattedTimeStamp());
            if (duration > 0)
            {
                int currentProgressValue = (int) (100 * currentTime / duration);
                timeModel.setValue(currentProgressValue);
            }
        }
    }

    private void updatePanel(IVideoPicture newPic)
    {
        if (converter == null)
        {
            BufferedImage javaImage = new BufferedImage(videoCoder.getWidth(), videoCoder.getHeight(),
                    BufferedImage.TYPE_3BYTE_BGR);
            converter = ConverterFactory.createConverter(javaImage, IPixelFormat.Type.BGR24);
        }
        BufferedImage image = converter.toImage(newPic);
        screen.setImage(image);
    }

    public void startPlayback() throws Exception
    {
        if (!IVideoResampler.isSupported(IVideoResampler.Feature.FEATURE_COLORSPACECONVERSION))
            throw new RuntimeException("cannot decode video" + videoFilename);

        if (container.open(videoFilename, IContainer.Type.READ, null) < 0)
            throw new IllegalArgumentException("could not open file: " + videoFilename);

        int numStreams = container.getNumStreams();

        int videoStreamId = -1;
        int audioStreamId = -1;

        for (int i = 0; i < numStreams; i++)
        {
            IStream stream = container.getStream(i);
            IStreamCoder coder = stream.getStreamCoder();

            if (coder.getCodecType() == ICodec.Type.CODEC_TYPE_VIDEO)
            {
                videoStreamId = i;
                videoCoder = coder;
            }
            if (coder.getCodecType() == ICodec.Type.CODEC_TYPE_AUDIO)
            {
                audioStreamId = i;
                audioCoder = coder;
            }
        }

        if (videoStreamId == -1 && audioStreamId == -1)
            throw new RuntimeException("could not find audio or video stream in container: " + videoFilename);

        if (videoCoder.open() < 0)
            throw new RuntimeException("could not open video decoder for container: " + videoFilename);

        if (audioCoder != null)
        {
            if (audioCoder.open() < 0)
                throw new RuntimeException("could not open audio decoder for container: " + videoFilename);

            try
            {
                soundPlayer = new SoundPlayer();
                soundPlayer.openJavaSound(audioCoder, volumeModel.getValue());
            } catch (LineUnavailableException reason)
            {
                throw new RuntimeException(
                        "unable to open sound device on your system when playing back container: "
                                + videoFilename);
            }
        }

        logVideoInfo();

        IVideoResampler resampler = null;
        if (videoCoder.getPixelType() != IPixelFormat.Type.BGR24)
        {
            resampler = IVideoResampler.make(videoCoder.getWidth(), videoCoder.getHeight(),
                    IPixelFormat.Type.BGR24, videoCoder.getWidth(), videoCoder.getHeight(),
                    videoCoder.getPixelType());
            if (resampler == null)
                throw new RuntimeException("could not create color space resampler for: " + videoFilename);
        }

        packet = IPacket.make();

        while (videoCoder != null)
        {
            while (videoCoder != null && container != null && container.readNextPacket(packet) >= 0)
            {
                while (paused)
                    Thread.sleep(100);
                if (packet.getStreamIndex() == audioStreamId)
                    try
                    {
                        handleAudioPacket();
                    } catch (Exception e)
                    {
                        LOGGER.warn("", e);
                    }
                else if (packet.getStreamIndex() == videoStreamId)
                    try
                    {
                        handleVideoPacket(resampler);
                    } catch (Exception e)
                    {
                        LOGGER.warn("", e);

                    }
            }
            if (container != null)
            {
                startTime = System.currentTimeMillis();
                seekTo(0);
            }
        }
    }

    protected void logVideoInfo()
    {
        int numStreams = container.getNumStreams();
        LOGGER.info("file streams : " + numStreams + " stream" + (numStreams == 1 ? "" : "s"));
        for (int i = 0; i < numStreams; i++)
        {
            IStream stream = container.getStream(i);
            IStreamCoder coder = stream.getStreamCoder();

            LOGGER.info("stream    : " + (i + 1) + ", type      : " + coder.getCodecType() + ", codec     : "
                    + coder.getCodecID() + ", frames    : " + (stream.getDuration() == Global.NO_PTS
                            ? "unknown" : "" + stream.getDuration()) + ", start time: "
                    + (container.getStartTime() == Global.NO_PTS ? "unknown" : "" + stream.getStartTime())
                    + ", language  : " + (stream.getLanguage() == null ? "unknown" : stream.getLanguage())
                    + ", timebase  : " + stream.getTimeBase().getNumerator() + "/"
                    + stream.getTimeBase().getDenominator() + ", coder tb  : "
                    + coder.getTimeBase().getNumerator() + "/" + coder.getTimeBase().getDenominator());

            if (coder.getCodecType() == ICodec.Type.CODEC_TYPE_AUDIO)
                LOGGER.info("Audio sample rate: " + coder.getSampleRate() + ", Audio channels   : "
                        + coder.getChannels() + ", Audio format     : " + coder.getSampleFormat());
            else if (coder.getCodecType() == ICodec.Type.CODEC_TYPE_VIDEO)
                LOGGER.info("Video width     : " + coder.getWidth() + ", Video height    : "
                        + coder.getHeight() + ", Video format    : " + coder.getPixelType()
                        + ", Video frame-rate: " + coder.getFrameRate().getDouble());
        }
        LOGGER.info("Video duration (ms)    : " + (container.getDuration() == Global.NO_PTS ? "unknown"
                : "" + container.getDuration() / 1000) + ", Video start time (ms)  : "
                + (container.getStartTime() == Global.NO_PTS ? "unknown"
                        : "" + container.getStartTime() / 1000) + ", Video file size (bytes): "
                + container.getFileSize() + ", Video bit rate         : " + container.getBitRate());

        LOGGER.info("VIDEO CODER INFO: " + ", Video timebase  : " + videoCoder.getTimeBase()
                + ", Video tolerance : " + videoCoder.getBitRateTolerance() + ", Video channels  : "
                + videoCoder.getChannels() + ", Video codec     : " + videoCoder.getCodec().getName()
                + ", Video bitrate   : " + videoCoder.getBitRate() + ", Video samplerate: "
                + videoCoder.getSampleRate() + ", Video framerate : " + videoCoder.getFrameRate());
    }

    protected void handleVideoPacket(IVideoResampler resampler)
    {
        picture = IVideoPicture.make(videoCoder.getPixelType(), videoCoder.getWidth(),
                videoCoder.getHeight());
        int offset = 0;
        while (offset < packet.getSize())
        {
            if (paused)
                break;
            int bytesDecoded = videoCoder.decodeVideo(picture, packet, offset);
            if (bytesDecoded < 0)
                break;
            offset += bytesDecoded;
            if (picture.isComplete())
            {
                IVideoPicture newPic = picture;
                if (resampler != null)
                {
                    // we must resample
                    newPic = IVideoPicture.make(resampler.getOutputPixelFormat(), picture.getWidth(),
                            picture.getHeight());
                    if (resampler.resample(newPic, picture) < 0)
                        throw new RuntimeException("could not resample video from: " + videoFilename);
                }
                if (newPic.getPixelType() != IPixelFormat.Type.BGR24)
                    throw new RuntimeException("could not decode video as BGR 24 bit data in: "
                            + videoFilename);
                currentTimestamp = picture.getTimeStamp();
                delay();
                updatePanel(newPic);
                updateTimeModel();
            }
        }
    }

    protected void handleAudioPacket()
    {
        IAudioSamples samples = IAudioSamples.make(1024, audioCoder.getChannels());
        int offset = 0;
        while (offset < packet.getSize())
        {
            if (paused)
                break;
            int bytesDecoded = audioCoder.decodeAudio(samples, packet, offset);
            if (bytesDecoded < 0)
                throw new RuntimeException("got error decoding audio in: " + videoFilename);
            offset += bytesDecoded;
            if (samples.isComplete() && isMute == false)
                soundPlayer.playJavaSound(samples);
        }
    }

    protected void dispose()
    {
        if (videoCoder != null)
        {
            videoCoder.close();
            videoCoder = null;
        }
        if (container != null)
        {
            container.close();
            container = null;
        }
    }

    private void delay()
    {
        if (firstTimestampInStream == Global.NO_PTS)
        {
            firstTimestampInStream = currentTimestamp;
            startTime = System.currentTimeMillis();
        } else
        {
            long currentTime = System.currentTimeMillis();
            long msClockTimeSinceStartOfVideo = currentTime - startTime;
            long msStreamTimeSinceStartOfVideo = (currentTimestamp - firstTimestampInStream) / 1000;
            long millisecondsTolerance = 50;
            long millisecondsToSleep = msStreamTimeSinceStartOfVideo - msClockTimeSinceStartOfVideo
                    + millisecondsTolerance;

            if (millisecondsToSleep > 0)
                try
                {
                    final long millis = millisecondsToSleep / playbackMultiplier;
                    System.out.println("sleep: " + millis);
                    Thread.sleep(millis);
                } catch (InterruptedException reason)
                {
                    return;
                }
        }
    }

    int playbackMultiplier = 1;

    public int getPlaybackMultiplier()
    {
        return playbackMultiplier;
    }

    public void setPlaybackMultiplier(int i)
    {
        playbackMultiplier = i;
    }
}
