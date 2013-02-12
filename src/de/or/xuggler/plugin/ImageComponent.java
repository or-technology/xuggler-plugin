package de.or.xuggler.plugin;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class ImageComponent extends JComponent {

    /**
     * 
     */
    private final VideoPanel videoPanel;

    /**
     * @param videoPanel
     */
    ImageComponent(VideoPanel videoPanel)
    {
        this.videoPanel = videoPanel;
    }

    Image image;

    public void setImage(Image image)
    {
        SwingUtilities.invokeLater(new ImageRunnable(image));
    }

    private class ImageRunnable implements Runnable {

        private final Image newImage;

        public ImageRunnable(Image newImage)
        {
            super();
            this.newImage = newImage;
        }

        public void run()
        {
            image = newImage;
            repaint();
        }
    }

    @Override
    public synchronized void paint(Graphics g)
    {
        if (image != null)
        {
            g.drawImage(image, (getWidth() - this.videoPanel.videoWidth) / 2,
                    (getHeight() - this.videoPanel.videoHeight) / 2, this.videoPanel.videoWidth,
                    this.videoPanel.videoHeight, this);
        }
    }
}