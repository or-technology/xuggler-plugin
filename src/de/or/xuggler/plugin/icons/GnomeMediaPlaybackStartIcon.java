package de.or.xuggler.plugin.icons;

import static java.awt.Color.WHITE;
import static java.awt.MultipleGradientPaint.ColorSpaceType.SRGB;
import static java.awt.MultipleGradientPaint.CycleMethod.NO_CYCLE;

import de.or.utils.icons.FlamingoSvgJavaIcon;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

/**
 * This class has been automatically generated using <a href="https://flamingo.dev.java.net">Flamingo SVG
 * transcoder</a>.
 */
public class GnomeMediaPlaybackStartIcon extends FlamingoSvgJavaIcon {

    /**
     * Creates a new transcoded SVG image.
     */
    public GnomeMediaPlaybackStartIcon()
    {
        this(26, 31);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public GnomeMediaPlaybackStartIcon(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public synchronized void paintIcon(Component c, Graphics g, int x, int y)
    {
        if (image == null)
        {
            image = new BufferedImage(getIconWidth(), getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            double coef = Math.min((double) width / (double) 26, (double) height / (double) 31);

            Graphics2D g2d = image.createGraphics();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.scale(coef, coef);
            paint(g2d);
            g2d.dispose();
        }

        g.drawImage(image, x, y, null);
    }

    /**
     * Paints the transcoded SVG image on the specified graphics context.
     * 
     * @param g
     *            Graphics context.
     */
    private static void paint(Graphics2D g)
    {
        Shape shape = null;

        float origAlpha = 1.0f;

        java.util.LinkedList<AffineTransform> transformations = new java.util.LinkedList<AffineTransform>();

        //

        // _0

        // _0_0
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 200, 0));

        // _0_0_0
        g.setComposite(AlphaComposite.getInstance(3, 0.4f * origAlpha));

        // _0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-186.59375, 9.0);
        ((GeneralPath) shape).curveTo(-187.38474, 9.0508995, -188.00018, 9.707384, -188.0, 10.5);
        ((GeneralPath) shape).lineTo(-188.0, 37.5);
        ((GeneralPath) shape).curveTo(-187.99205, 38.031998, -187.70338, 38.520138, -187.24104, 38.78342);
        ((GeneralPath) shape).curveTo(-186.77869, 39.046703, -186.21158, 39.045876, -185.75, 38.78125);
        ((GeneralPath) shape).lineTo(-162.75, 25.28125);
        ((GeneralPath) shape).curveTo(-162.30424, 25.008049, -162.03253, 24.522812, -162.03253, 24.0);
        ((GeneralPath) shape).curveTo(-162.03253, 23.477188, -162.30424, 22.991951, -162.75, 22.71875);
        ((GeneralPath) shape).lineTo(-185.75, 9.21875);
        ((GeneralPath) shape).curveTo(-186.00346, 9.064076, -186.29707, 8.987957, -186.59375, 9.0);
        ((GeneralPath) shape).lineTo(-186.59375, 9.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(-177.2776641845703, 9.203917503356934), new Point2D.Double(-172.8285675048828, 25.80816078186035), new float[] {
            0, 1 }, new Color[] {
            new Color(0x50000000, true), WHITE }, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));

        // _0_0_0_1

        // _0_0_0_1_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-186.5, 37.5);
        ((GeneralPath) shape).lineTo(-186.5, 10.500456);
        ((GeneralPath) shape).lineTo(-163.5, 24.012459);
        ((GeneralPath) shape).lineTo(-186.5, 37.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(36.126338958740234, 18.02047348022461), 13.55237f, new Point2D.Double(36.126338958740234, 18.02047348022461), new float[] {
            0, 1 }, new Color[] {
            new Color(0xEEEEEC), new Color(0x92948F) }, NO_CYCLE, SRGB, new AffineTransform(2.7391665f, 0, 0, 2.2478597f, -274.85736f, -10.683483f)));
        g.fill(shape);
        g.setPaint(new Color(0x555753));
        g.setStroke(new BasicStroke(1, 2, 0, 4));
        g.draw(shape);

        // _0_0_0_1_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-185.5, 35.750027);
        ((GeneralPath) shape).lineTo(-185.5, 12.250428);
        ((GeneralPath) shape).lineTo(-165.5, 24.010872);
        ((GeneralPath) shape).lineTo(-185.5, 35.750027);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.draw(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.15f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, -1, -200, 48));

        // _0_0_0_1_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.0, 11.375);
        ((GeneralPath) shape).curveTo(14.0, 19.791552, 14.0, 28.208448, 14.0, 36.625);
        ((GeneralPath) shape).curveTo(21.167154, 32.42134, 28.332237, 28.204016, 35.5, 24.0);
        ((GeneralPath) shape).curveTo(28.332834, 19.790152, 21.16775, 15.585191, 14.0, 11.375);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(-0.11694507300853729, 10.146530151367188), new Point2D.Double(48.025962829589844, 37.94185256958008), new float[] {
            0, 0.20971029f, 0.34936365f, 0.42850056f, 0.5213405f, 0.55746967f, 0.7100152f, 0.7439496f, 1 }, new Color[] {
            WHITE, new Color(0xFFFFFF, true), new Color(0xCFFFFFFF, true), new Color(0xFFFFFF, true), WHITE, new Color(0xFFFFFF, true), new Color(0x91FFFFFF, true), new Color(0xFFFFFF, true), new Color(0xFFFFFF, true) }, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0_1_2

        g.setTransform(transformations.poll()); // _0_0_0

    }
}
