package de.or.xuggler.plugin;

import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class VideoPanel extends JPanel {

    private final ImageComponent imageComponent;

    int videoWidth = getWidth();

    int videoHeight = getHeight();

    private BufferedImage currentImage = null;

    private boolean videoStarted = false;

    public VideoPanel()
    {
        super();

        this.setBackground(Color.BLACK);
        this.setOpaque(true);

        imageComponent = new ImageComponent(this);

        this.setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        this.add(imageComponent);
        this.setVisible(true);

        this.addComponentListener(new java.awt.event.ComponentAdapter() {

            @Override
            public void componentResized(java.awt.event.ComponentEvent evt)
            {
                resize();
            }
        });
    }

    void resize()
    {
        if (currentImage == null)
            return;
        double imgW = currentImage.getWidth(this);
        double imgH = currentImage.getHeight(this);

        double ratio1 = getWidth() / imgW;
        double ratio2 = getHeight() / imgH;

        double scaleFactor = Math.min(ratio1, ratio2);

        videoWidth = (int) (currentImage.getWidth(this) * scaleFactor);
        videoHeight = (int) (currentImage.getHeight(this) * scaleFactor);
    }

    public void setImage(final BufferedImage aImage)
    {
        currentImage = aImage;

        if (videoStarted == false)
        {
            resize();
            videoStarted = true;
        }

        imageComponent.setImage(aImage);
    }
}
