package de.or.xuggler.plugin;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;

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

public class PreviewImageCreator {

    private IStreamCoder videoCoder = null;

    private IContainer container = IContainer.make();

    private long currentTimestamp = 0;

    private IVideoPicture picture = null;

    private IPacket packet = null;

    private String videoFilename = "";

    private static final Logger LOGGER = Logger.getLogger(PreviewImageCreator.class);

    private IConverter converter;

    public static void main(String[] args) throws Exception
    {
        for (String string : args)
        {
            final PreviewImageCreator creator = new PreviewImageCreator(string, 10);
            creator.startPlayback();
            try
            {
                final File tempFile = File.createTempFile("image-" + creator.currentTimestamp + "-", ".jpg");
                FileOutputStream fos = new FileOutputStream(tempFile);
                ImageIO.write(creator.previewImage, "jpg", fos);
                fos.flush();
                fos.close();
            } catch (IOException ex)
            {
                LOGGER.warn("", ex);
            }

        }
    }

    int frameNrToSave = -1;

    public PreviewImageCreator(String videoFilename, int frameNrToSave)
    {
        this.videoFilename = videoFilename;
        this.frameNrToSave = frameNrToSave;
    }

    public PreviewImageCreator(String videoFilename)
    {
        this.videoFilename = videoFilename;
    }

    private int framesDecoded = 0;

    private boolean saveImage(IVideoPicture newPic)
    {
        if (converter == null)
        {
            BufferedImage javaImage = new BufferedImage(videoCoder.getWidth(), videoCoder.getHeight(),
                    BufferedImage.TYPE_3BYTE_BGR);
            converter = ConverterFactory.createConverter(javaImage, IPixelFormat.Type.BGR24);
        }
        previewImage = converter.toImage(newPic);
        framesDecoded++;
        return framesDecoded == frameNrToSave;
    }

    protected void startPlayback() throws Exception
    {
        if (!IVideoResampler.isSupported(IVideoResampler.Feature.FEATURE_COLORSPACECONVERSION))
            throw new RuntimeException("cannot decode video" + videoFilename);

        if (container.open(videoFilename, IContainer.Type.READ, null) < 0)
            throw new IllegalArgumentException("could not open file: " + videoFilename);

        int numStreams = container.getNumStreams();

        int videoStreamId = -1;
        for (int i = 0; i < numStreams; i++)
        {
            IStream stream = container.getStream(i);
            IStreamCoder coder = stream.getStreamCoder();

            if (coder.getCodecType() == ICodec.Type.CODEC_TYPE_VIDEO)
            {
                videoStreamId = i;
                videoCoder = coder;
            }
        }

        if (videoStreamId == -1)
            throw new RuntimeException("could not find video stream in container: " + videoFilename);

        if (videoCoder.open() < 0)
            throw new RuntimeException("could not open video decoder for container: " + videoFilename);

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
            while (videoCoder != null && container != null && container.readNextPacket(packet) >= 0)
                if (packet.getStreamIndex() == videoStreamId)
                    try
                    {
                        handleVideoPacket(resampler);
                    } catch (Exception e)
                    {
                        LOGGER.warn("", e);

                    }
    }

    protected void handleVideoPacket(IVideoResampler resampler)
    {
        picture = IVideoPicture.make(videoCoder.getPixelType(), videoCoder.getWidth(),
                videoCoder.getHeight());
        int offset = 0;
        while (offset < packet.getSize())
        {
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
                if (saveImage(newPic))
                    dispose();
            }
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

    protected BufferedImage previewImage;

    public BufferedImage createVideoPreviewImage(int frameNr) throws Exception
    {
        frameNrToSave = frameNr;
        startPlayback();
        return previewImage;
    }

}
