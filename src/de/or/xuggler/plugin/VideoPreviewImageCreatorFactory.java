/**
 * 
 */
package de.or.xuggler.plugin;

import de.or.plugin.core.VideoPreviewImageCreator;

import java.awt.image.BufferedImage;

/**
 * @author till.woitendorf
 *
 */
public class VideoPreviewImageCreatorFactory implements VideoPreviewImageCreator {

    public BufferedImage createVideoPreviewImage(String videoFilename)
    {
        try
        {
            return new PreviewImageCreator(videoFilename).createVideoPreviewImage(10);
        } catch (Exception ex)
        {
            throw new RuntimeException(ex);
        }
    }

}
