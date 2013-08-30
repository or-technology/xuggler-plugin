package de.or.xuggler.plugin.icons;

import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;
import static java.awt.MultipleGradientPaint.ColorSpaceType.SRGB;
import static java.awt.MultipleGradientPaint.CycleMethod.NO_CYCLE;

import de.or.utils.icons.FlamingoSvgJavaIcon;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

/**
 * This class has been automatically generated using <a href="https://flamingo.dev.java.net">Flamingo SVG
 * transcoder</a>.
 */
public class UbuntuStudioIconsVideoProductionIcon extends FlamingoSvgJavaIcon {

    /**
     * Creates a new transcoded SVG image.
     */
    public UbuntuStudioIconsVideoProductionIcon()
    {
        this(689, 847);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public UbuntuStudioIconsVideoProductionIcon(int width, int height)
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
            double coef = Math.min((double) width / (double) 689, (double) height / (double) 847);

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

        java.util.LinkedList<AffineTransform> transformations = new java.util.LinkedList<AffineTransform>();

        //
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -44));

        // _0

        // _0_0

        // _0_0_0
        Shape shape = new RoundRectangle2D.Double(20.724782943725586, 63.12323760986328, 687.5572509765625,
                845.59912109375, 232.65138244628906, 232.65138244628906);
        g.setPaint(new LinearGradientPaint(new Point2D.Double(-520.5130004882812, 1023.7913208007812),
                new Point2D.Double(-1383.43896484375, -16.327667236328125), new float[] {
                    0, 1 }, new Color[] {
                    BLACK, new Color(0xA8A8A8) }, NO_CYCLE, SRGB, new AffineTransform(0.8563884f, 0, 0,
                        0.78296137f, 962.752f, -31.563095f)));
        g.fill(shape);
        g.setPaint(new Color(0xBDB683));
        g.setStroke(new BasicStroke(0.81885225f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new RoundRectangle2D.Double(162.1052703857422, 100.4816665649414, 403.39093017578125,
                331.080810546875, 143.17007446289062, 143.17007446289062);
        g.setPaint(new Color(0xE4E4E4));
        g.fill(shape);
        g.setPaint(new Color(0xBDB683));
        g.setStroke(new BasicStroke(0.74719626f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new RoundRectangle2D.Double(162.1052703857422, 524.623046875, 403.39093017578125,
                331.080810546875, 143.17007446289062, 143.17007446289062);
        g.setPaint(new Color(0xE4E4E4));
        g.fill(shape);
        g.setPaint(new Color(0xBDB683));
        g.draw(shape);

        // _0_0_3
        shape = new RoundRectangle2D.Double(47.79286193847656, 140.74827575683594, 86.08804321289062,
                107.36080932617188, 47.438499450683594, 47.438499450683594);
        g.setPaint(WHITE);
        g.fill(shape);

        // _0_0_4
        shape = new RoundRectangle2D.Double(47.79286193847656, 280.5669860839844, 86.08804321289062,
                107.36080932617188, 47.438499450683594, 47.438499450683594);
        g.fill(shape);

        // _0_0_5
        shape = new RoundRectangle2D.Double(47.79286193847656, 422.8824462890625, 86.08804321289062,
                107.36080932617188, 47.438499450683594, 47.438499450683594);
        g.fill(shape);

        // _0_0_6
        shape = new RoundRectangle2D.Double(47.79286193847656, 562.7011108398438, 86.08804321289062,
                107.36080932617188, 47.438499450683594, 47.438499450683594);
        g.fill(shape);

        // _0_0_7
        shape = new RoundRectangle2D.Double(47.79286193847656, 700.0230712890625, 86.08804321289062,
                107.36080932617188, 47.438499450683594, 47.438499450683594);
        g.fill(shape);

        // _0_0_8
        shape = new RoundRectangle2D.Double(47.79286193847656, 700.0230712890625, 86.08804321289062,
                107.36080932617188, 47.438499450683594, 47.438499450683594);
        g.fill(shape);

        // _0_0_9
        shape = new RoundRectangle2D.Double(593.6287841796875, 140.74827575683594, 86.08804321289062,
                107.36080932617188, 47.438499450683594, 47.438499450683594);
        g.fill(shape);

        // _0_0_10
        shape = new RoundRectangle2D.Double(593.6287841796875, 280.5669860839844, 86.08804321289062,
                107.36080932617188, 47.438499450683594, 47.438499450683594);
        g.fill(shape);

        // _0_0_11
        shape = new RoundRectangle2D.Double(593.6287841796875, 422.8824462890625, 86.08804321289062,
                107.36080932617188, 47.438499450683594, 47.438499450683594);
        g.fill(shape);

        // _0_0_12
        shape = new RoundRectangle2D.Double(593.6287841796875, 562.7011108398438, 86.08804321289062,
                107.36080932617188, 47.438499450683594, 47.438499450683594);
        g.fill(shape);

        // _0_0_13
        shape = new RoundRectangle2D.Double(593.6287841796875, 700.0230712890625, 86.08804321289062,
                107.36080932617188, 47.438499450683594, 47.438499450683594);
        g.fill(shape);

        // _0_0_14
        shape = new RoundRectangle2D.Double(593.6287841796875, 700.0230712890625, 86.08804321289062,
                107.36080932617188, 47.438499450683594, 47.438499450683594);
        g.fill(shape);

        // _0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(565.49615, 166.53033);
        ((GeneralPath) shape).lineTo(565.49615, 359.97748);
        ((GeneralPath) shape).curveTo(565.49615, 399.63556, 533.5692, 431.5625, 493.91113, 431.5625);
        ((GeneralPath) shape).lineTo(233.69028, 431.5625);
        ((GeneralPath) shape).curveTo(194.03218, 431.5625, 162.10526, 399.63556, 162.10526, 359.97748);
        ((GeneralPath) shape).lineTo(162.10526, 338.66943);
        ((GeneralPath) shape).curveTo(286.89618, 345.87646, 485.89932, 287.9263, 565.4962, 166.53035);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xC2C2C2));
        g.fill(shape);

        // _0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(565.49615, 590.506);
        ((GeneralPath) shape).lineTo(565.49615, 783.95306);
        ((GeneralPath) shape).curveTo(565.49615, 823.6112, 533.5692, 855.5381, 493.91113, 855.5381);
        ((GeneralPath) shape).lineTo(233.69028, 855.5381);
        ((GeneralPath) shape).curveTo(194.03218, 855.5381, 162.10526, 823.6112, 162.10526, 783.953);
        ((GeneralPath) shape).lineTo(162.10526, 762.645);
        ((GeneralPath) shape).curveTo(286.89618, 769.852, 485.89932, 711.90186, 565.4962, 590.5059);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.poll()); // _0

    }
}
