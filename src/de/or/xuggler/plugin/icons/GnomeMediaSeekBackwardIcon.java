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
public class GnomeMediaSeekBackwardIcon extends FlamingoSvgJavaIcon {

    /**
     * Creates a new transcoded SVG image.
     */
    public GnomeMediaSeekBackwardIcon()
    {
        this(40, 26);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public GnomeMediaSeekBackwardIcon(int width, int height)
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
            double coef = Math.min((double) width / (double) 40, (double) height / (double) 26);

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
        g.transform(new AffineTransform(1, 0, 0, 1, 250, 0));

        // _0_0_0
        g.setComposite(AlphaComposite.getInstance(3, 0.4f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(-1, 0, 0, 1, -351.01532f, 0));

        // _0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-143.75, 11.53125);
        ((GeneralPath) shape).curveTo(-144.47125, 11.646642, -145.0014, 12.269567, -145.0, 13.0);
        ((GeneralPath) shape).lineTo(-145.0, 35.0);
        ((GeneralPath) shape).curveTo(-145.00337, 35.536846, -144.71663, 36.033688, -144.2501, 36.299347);
        ((GeneralPath) shape).curveTo(-143.78358, 36.565006, -143.20998, 36.558086, -142.75, 36.28125);
        ((GeneralPath) shape).lineTo(-127.0, 26.9375);
        ((GeneralPath) shape).lineTo(-127.0, 35.0);
        ((GeneralPath) shape).curveTo(-127.00337, 35.536846, -126.71663, 36.033688, -126.25011, 36.299347);
        ((GeneralPath) shape).curveTo(-125.78358, 36.565006, -125.20998, 36.558086, -124.75, 36.28125);
        ((GeneralPath) shape).lineTo(-106.25, 25.28125);
        ((GeneralPath) shape).curveTo(-105.79494, 25.014944, -105.51528, 24.527252, -105.51528, 24.0);
        ((GeneralPath) shape).curveTo(-105.51528, 23.472748, -105.79494, 22.985056, -106.25, 22.71875);
        ((GeneralPath) shape).lineTo(-124.75, 11.71875);
        ((GeneralPath) shape).curveTo(-125.20998, 11.441915, -125.78358, 11.434995, -126.25011, 11.700653);
        ((GeneralPath) shape).curveTo(-126.71663, 11.966312, -127.00337, 12.463152, -127.0, 13.0);
        ((GeneralPath) shape).lineTo(-127.0, 21.0625);
        ((GeneralPath) shape).lineTo(-142.75, 11.71875);
        ((GeneralPath) shape).curveTo(-143.05084, 11.540409, -143.40498, 11.474007, -143.75, 11.53125);
        ((GeneralPath) shape).lineTo(-143.75, 11.53125);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(-127.01692199707031, 12.838128089904785), new Point2D.Double(-123.49838256835938, 25.969480514526367), new float[] {
            0, 1 }, new Color[] {
            new Color(0x50000000, true), WHITE }, NO_CYCLE, SRGB, new AffineTransform(-1, 0, 0, 1, -250.5153f, 0)));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));

        // _0_0_0_1
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, -132, 0));

        // _0_0_0_1_0
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(-1, 0, 0, 1, -54, 0));

        // _0_0_0_1_0_0

        // _0_0_0_1_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.5, 35.0);
        ((GeneralPath) shape).lineTo(21.5, 13.000461);
        ((GeneralPath) shape).lineTo(39.995766, 24.010195);
        ((GeneralPath) shape).lineTo(21.5, 35.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(38.40032958984375, 17.83346176147461), 13.55237f, new Point2D.Double(38.40032958984375, 17.83346176147461), new float[] {
            0, 1 }, new Color[] {
            new Color(0xEEEEEC), new Color(0x92948F) }, NO_CYCLE, SRGB, new AffineTransform(-1.9143326f, 0, 0, 1.5917714f, 100.35131f, 0.016193442f)));
        g.fill(shape);
        g.setPaint(new Color(0x555753));
        g.setStroke(new BasicStroke(1, 2, 0, 4));
        g.draw(shape);

        // _0_0_0_1_0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.5, 14.78125);
        ((GeneralPath) shape).lineTo(22.5, 33.21875);
        ((GeneralPath) shape).lineTo(38.03125, 24.0);
        ((GeneralPath) shape).lineTo(22.5, 14.78125);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_0_1_0_0
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(-1, 0, 0, 1, -72, 0));

        // _0_0_0_1_0_1

        // _0_0_0_1_0_1_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.5, 35.0);
        ((GeneralPath) shape).lineTo(21.5, 13.000461);
        ((GeneralPath) shape).lineTo(39.995766, 24.010195);
        ((GeneralPath) shape).lineTo(21.5, 35.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(38.40032958984375, 17.83346176147461), 13.55237f, new Point2D.Double(38.40032958984375, 17.83346176147461), new float[] {
            0, 1 }, new Color[] {
            new Color(0xEEEEEC), new Color(0x92948F) }, NO_CYCLE, SRGB, new AffineTransform(-1.9143326f, 0, 0, 1.5917714f, 100.35131f, 0.016193442f)));
        g.fill(shape);
        g.setPaint(new Color(0x555753));
        g.draw(shape);

        // _0_0_0_1_0_1_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.5, 14.78125);
        ((GeneralPath) shape).lineTo(22.5, 33.21875);
        ((GeneralPath) shape).lineTo(38.03125, 24.0);
        ((GeneralPath) shape).lineTo(22.5, 14.78125);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_0_1_0_1

        g.setTransform(transformations.poll()); // _0_0_0_1_0
        g.setComposite(AlphaComposite.getInstance(3, 0.15f * origAlpha));

        // _0_0_0_1_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-226.0, 34.125);
        ((GeneralPath) shape).lineTo(-243.03125, 24.0);
        ((GeneralPath) shape).lineTo(-226.0, 13.875);
        ((GeneralPath) shape).lineTo(-226.0, 23.6875);
        ((GeneralPath) shape).curveTo(-225.99615, 23.80308, -225.95193, 23.913654, -225.875, 24.0);
        ((GeneralPath) shape).curveTo(-225.95193, 24.086346, -225.99615, 24.19692, -226.0, 24.3125);
        ((GeneralPath) shape).lineTo(-226.0, 34.125);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(-208.0, 34.125);
        ((GeneralPath) shape).lineTo(-225.03125, 24.0);
        ((GeneralPath) shape).lineTo(-208.0, 13.875);
        ((GeneralPath) shape).lineTo(-208.0, 34.125);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(52.33195114135742, 10.440893173217773), new Point2D.Double(100.16806030273438, 38.059085845947266), new float[] {
            0, 0.20971029f, 0.34936365f, 0.42850056f, 0.5213405f, 0.55746967f, 0.7100152f, 0.7439496f, 1 }, new Color[] {
            WHITE, new Color(0xFFFFFF, true), new Color(0xCFFFFFFF, true), new Color(0xFFFFFF, true), WHITE, new Color(0xFFFFFF, true), new Color(0x91FFFFFF, true), new Color(0xFFFFFF, true), new Color(0xFFFFFF, true) }, NO_CYCLE, SRGB, new AffineTransform(1, 0, 0, -1, -302, 48)));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0

    }
}
