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
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

/**
 * This class has been automatically generated using <a href="https://flamingo.dev.java.net">Flamingo SVG
 * transcoder</a>.
 */
public class GnomeMediaPlaybackPauseIcon extends FlamingoSvgJavaIcon {

    /**
     * Creates a new transcoded SVG image.
     */
    public GnomeMediaPlaybackPauseIcon()
    {
        this(26, 26);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public GnomeMediaPlaybackPauseIcon(int width, int height)
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
            double coef = Math.min((double) width / (double) 26, (double) height / (double) 26);

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
        g.transform(new AffineTransform(1, 0, 0, 1, 50, 0));

        // _0_0_0
        g.setComposite(AlphaComposite.getInstance(3, 0.4f * origAlpha));

        // _0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-37.03125, 11.03125);
        ((GeneralPath) shape).curveTo(-38.047935, 11.03125, -38.96875, 11.952065, -38.96875, 12.96875);
        ((GeneralPath) shape).lineTo(-38.96875, 35.03125);
        ((GeneralPath) shape).curveTo(-38.96875, 36.04794, -38.04795, 36.968758, -37.03125, 36.96875);
        ((GeneralPath) shape).lineTo(-29.96875, 36.96875);
        ((GeneralPath) shape).curveTo(-28.952068, 36.96875, -28.031246, 36.04794, -28.03125, 35.03125);
        ((GeneralPath) shape).lineTo(-28.03125, 12.96875);
        ((GeneralPath) shape).curveTo(-28.03125, 11.952065, -28.952065, 11.03125, -29.96875, 11.03125);
        ((GeneralPath) shape).lineTo(-37.03125, 11.03125);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(-22.03125, 11.03125);
        ((GeneralPath) shape).curveTo(-23.047935, 11.03125, -23.96875, 11.952065, -23.96875, 12.96875);
        ((GeneralPath) shape).lineTo(-23.96875, 35.03125);
        ((GeneralPath) shape).curveTo(-23.96875, 36.04794, -23.04795, 36.968758, -22.03125, 36.96875);
        ((GeneralPath) shape).lineTo(-14.96875, 36.96875);
        ((GeneralPath) shape).curveTo(-13.952068, 36.96875, -13.03125, 36.047935, -13.03125, 35.03125);
        ((GeneralPath) shape).lineTo(-13.03125, 12.96875);
        ((GeneralPath) shape).curveTo(-13.03125, 11.952065, -13.952065, 11.03125, -14.96875, 11.03125);
        ((GeneralPath) shape).lineTo(-22.03125, 11.03125);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(-27.66901206970215, 13.129915237426758), new Point2D.Double(-24.33098793029785, 25.587594985961914), new float[] {
            0, 1 }, new Color[] {
            new Color(0x50000000, true), WHITE }, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));

        // _0_0_0_1

        // _0_0_0_1_0
        shape = new RoundRectangle2D.Double(-37.5, 12.5, 7.998013496398926, 23.000001907348633, 0.9539660215377808, 0.9539660215377808);
        g.setPaint(new RadialGradientPaint(new Point2D.Double(28.541149139404297, 31.67877197265625), 12, new Point2D.Double(28.541149139404297, 31.67877197265625), new float[] {
            0, 1 }, new Color[] {
            new Color(0xEEEEEC), new Color(0x92948F) }, NO_CYCLE, SRGB, new AffineTransform(5.3995166f, 0, 0, 2.3034327f, -176.14731f, -41.851944f)));
        g.fill(shape);
        g.setPaint(new Color(0x555753));
        g.setStroke(new BasicStroke(1, 1, 1, 4));
        g.draw(shape);

        // _0_0_0_1_1
        shape = new RoundRectangle2D.Double(-22.5, 12.5, 7.998013496398926, 23.000001907348633, 0.9539660215377808, 0.9539660215377808);
        g.setPaint(new RadialGradientPaint(new Point2D.Double(28.541149139404297, 31.67877197265625), 12, new Point2D.Double(28.541149139404297, 31.67877197265625), new float[] {
            0, 1 }, new Color[] {
            new Color(0xEEEEEC), new Color(0x92948F) }, NO_CYCLE, SRGB, new AffineTransform(5.3995166f, 0, 0, 2.3034327f, -176.14731f, -41.851944f)));
        g.fill(shape);
        g.setPaint(new Color(0x555753));
        g.draw(shape);

        // _0_0_0_1_2
        shape = new Rectangle2D.Double(-36.5, 13.500001907348633, 5.999970436096191, 20.999998092651367);
        g.setPaint(WHITE);
        g.setStroke(new BasicStroke(1, 1, 0, 4));
        g.draw(shape);

        // _0_0_0_1_3
        shape = new Rectangle2D.Double(-21.5, 13.500001907348633, 5.999970436096191, 20.999998092651367);
        g.draw(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.15f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, -1, -50, 48));

        // _0_0_0_1_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.0, 13.0);
        ((GeneralPath) shape).lineTo(13.0, 35.0);
        ((GeneralPath) shape).lineTo(20.0, 35.0);
        ((GeneralPath) shape).lineTo(20.0, 13.0);
        ((GeneralPath) shape).lineTo(13.0, 13.0);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(28.0, 13.0);
        ((GeneralPath) shape).lineTo(28.0, 35.0);
        ((GeneralPath) shape).lineTo(35.0, 35.0);
        ((GeneralPath) shape).lineTo(35.0, 13.0);
        ((GeneralPath) shape).lineTo(28.0, 13.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(-0.13080163300037384, 10.068081855773926), new Point2D.Double(48.13079833984375, 37.93193054199219), new float[] {
            0, 0.20971029f, 0.34936365f, 0.42850056f, 0.5213405f, 0.55746967f, 0.7100152f, 0.7439496f, 1 }, new Color[] {
            WHITE, new Color(0xFFFFFF, true), new Color(0xCFFFFFFF, true), new Color(0xFFFFFF, true), WHITE, new Color(0xFFFFFF, true), new Color(0x91FFFFFF, true), new Color(0xFFFFFF, true), new Color(0xFFFFFF, true) }, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0_1_4

        g.setTransform(transformations.poll()); // _0_0_0

    }
}
