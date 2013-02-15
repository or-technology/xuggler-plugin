package de.or.xuggler.plugin;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;

import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.MediaListenerAdapter;
import com.xuggle.mediatool.ToolFactory;
import com.xuggle.mediatool.event.IVideoPictureEvent;
import com.xuggle.xuggler.Global;

public class DecodeAndCaptureFrames extends MediaListenerAdapter {

    public static void main(String[] args)
    {
        if (args.length == 1)
        {
            new DecodeAndCaptureFrames(args[0]);
        }
    }

    protected static final Logger logger = Logger.getLogger(DecodeAndCaptureFrames.class);

    // die Zeit die zwischen den einzelnen Aufnahmen liegen
    public static final double SECONDS_BETWEEN_FRAMES = 1;

    public static final long MICRO_SECONDS_BETWEEN_FRAMES = (long) (Global.DEFAULT_PTS_PER_SECOND * SECONDS_BETWEEN_FRAMES);

    private static long mLastPtsWrite = Global.NO_PTS;

    private int mVideoStreamIndex = -1;

    public DecodeAndCaptureFrames(String file)
    {
        IMediaReader mediaReader = ToolFactory.makeReader(file);
        mediaReader.setBufferedImageTypeToGenerate(BufferedImage.TYPE_3BYTE_BGR);
        mediaReader.addListener(this);

        while (mediaReader.readPacket() == null)
            // Auslesen der Pakete aus dem VideoStream
            ;
    }

    int count = 0;

    @Override
    public void onVideoPicture(IVideoPictureEvent event)
    {
        try
        {
            if (event.getStreamIndex().intValue() != mVideoStreamIndex)
            {
                if (-1 == mVideoStreamIndex)
                    mVideoStreamIndex = event.getStreamIndex().intValue();
                else
                    return;
            }
            if (mLastPtsWrite == Global.NO_PTS)
                mLastPtsWrite = event.getTimeStamp().longValue() - MICRO_SECONDS_BETWEEN_FRAMES;
            if (event.getTimeStamp().longValue() - mLastPtsWrite >= MICRO_SECONDS_BETWEEN_FRAMES)
            {
                File file = new File("frame-" + (count++) + ".png");
                ImageIO.write(event.getImage(), ".jpg", file);

                // datei wird geschrieben
                System.out.println("Bild wurde aufgenommen: " + file.getAbsolutePath());
                mLastPtsWrite += MICRO_SECONDS_BETWEEN_FRAMES;
            }
        } catch (Exception e)
        {
            logger.warn("", e);
        }
    }

}
