package de.or.xuggler.plugin.icons;

import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;
import static java.awt.MultipleGradientPaint.ColorSpaceType.SRGB;
import static java.awt.MultipleGradientPaint.CycleMethod.NO_CYCLE;

import de.or.guiUtils.icons.FlamingoSvgJavaIcon;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.RadialGradientPaint;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;

/**
 * This class has been automatically generated using <a href="https://flamingo.dev.java.net">Flamingo SVG
 * transcoder</a>.
 */
public class GnomeCameraPhotoIcon extends FlamingoSvgJavaIcon {

    /**
     * Creates a new transcoded SVG image.
     */
    public GnomeCameraPhotoIcon()
    {
        this(48, 34);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public GnomeCameraPhotoIcon(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    @Override
    protected int getOrigWidth()
    {
        return 48;
    }

    @Override
    protected int getOrigHeight()
    {
        return 34;
    }

    /**
     * Paints the transcoded SVG image on the specified graphics context.
     * 
     * @param g
     *            Graphics context.
     */
    @Override
    protected void paint(Graphics2D g)
    {
        Shape shape = null;

        float origAlpha = 1.0f;

        java.util.LinkedList<AffineTransform> transformations = new java.util.LinkedList<AffineTransform>();

        //

        // _0

        // _0_0
        g.setComposite(AlphaComposite.getInstance(3, 0.24117647f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 3.875f, 0.5f));

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.875, 35.875);
        ((GeneralPath) shape).curveTo(18.875, 39.050636, 13.7262745, 41.625, 7.375, 41.625);
        ((GeneralPath) shape).curveTo(1.0237254, 41.625, -4.125, 39.050636, -4.125, 35.875);
        ((GeneralPath) shape).curveTo(-4.125, 32.699364, 1.0237254, 30.125, 7.375, 30.125);
        ((GeneralPath) shape).curveTo(13.7262745, 30.125, 18.875, 32.699364, 18.875, 35.875);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(7.375, 35.875), 11.5f, new Point2D.Double(
                7.375, 35.875), new float[] {
            0, 1 }, new Color[] {
            BLACK, new Color(0x0, true) }, NO_CYCLE, SRGB, new AffineTransform(1, 0, 0, 0.5f, 0, 17.9375f)));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0
        g.setComposite(AlphaComposite.getInstance(3, 0.34705883f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.9766246f, 0, 0, 1, 0.035063148f, 0));

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.25, 30.5);
        ((GeneralPath) shape).curveTo(7.823898, 30.5, 6.496757, 30.783497, 5.375, 31.25);
        ((GeneralPath) shape).lineTo(4.75, 31.25);
        ((GeneralPath) shape).curveTo(2.9495, 31.25, 1.5, 32.6995, 1.5, 34.5);
        ((GeneralPath) shape).curveTo(1.5, 35.319225, 1.8158092, 36.05458, 2.3125, 36.625);
        ((GeneralPath) shape).curveTo(2.3168879, 36.634445, 2.3080246, 36.64683, 2.3125, 36.65625);
        ((GeneralPath) shape).curveTo(3.2308853, 38.589436, 5.998375, 40.0, 9.25, 40.0);
        ((GeneralPath) shape).curveTo(11.85114, 40.0, 14.12695, 39.099285, 15.40625, 37.75);
        ((GeneralPath) shape).lineTo(43.625, 37.75);
        ((GeneralPath) shape).curveTo(45.4255, 37.75, 46.875, 36.3005, 46.875, 34.5);
        ((GeneralPath) shape).curveTo(46.875, 32.6995, 45.4255, 31.25, 43.625, 31.25);
        ((GeneralPath) shape).lineTo(13.125, 31.25);
        ((GeneralPath) shape).curveTo(12.003243, 30.783497, 10.676102, 30.5, 9.25, 30.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_1
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.2073174, 9.5);
        ((GeneralPath) shape).curveTo(4.255661, 9.5, 3.5000002, 10.260522, 3.5000002, 11.1875);
        ((GeneralPath) shape).lineTo(3.5000002, 15.71875);
        ((GeneralPath) shape).lineTo(3.5000002, 35.0625);
        ((GeneralPath) shape).lineTo(3.5000002, 35.28125);
        ((GeneralPath) shape).curveTo(3.5000002, 37.62061, 6.110732, 39.5, 9.353659, 39.5);
        ((GeneralPath) shape).curveTo(11.880769, 39.5, 14.018446, 38.17441, 14.841464, 36.5625);
        ((GeneralPath) shape).lineTo(41.792686, 36.5625);
        ((GeneralPath) shape).curveTo(42.744343, 36.5625, 43.500004, 35.80198, 43.500004, 34.875);
        ((GeneralPath) shape).lineTo(43.500004, 11.1875);
        ((GeneralPath) shape).curveTo(43.500004, 10.260522, 42.74434, 9.5, 41.792686, 9.5);
        ((GeneralPath) shape).lineTo(5.2073174, 9.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(6.005203723907471, 7.110019683837891),
                new Point2D.Double(37.57537841796875, 44), new float[] {
                    0, 0.5f, 0.75f, 1 }, new Color[] {
                    new Color(0xBABDB6), new Color(0xE0E0E0), new Color(0xC0C3BB), new Color(0xDBDBDB) },
                NO_CYCLE, SRGB, new AffineTransform(0.9756098f, 0, 0, 1, 0.085365854f, -4)));
        g.fill(shape);
        g.setPaint(new Color(0x888A85));
        g.setStroke(new BasicStroke(1, 0, 0, 10));
        g.draw(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.28823528f * origAlpha));

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.664634, 9.865852);
        ((GeneralPath) shape).curveTo(4.736769, 9.865852, 4.0, 10.607826, 4.0, 11.512196);
        ((GeneralPath) shape).lineTo(4.0, 15.932926);
        ((GeneralPath) shape).lineTo(4.0, 34.55488);
        ((GeneralPath) shape).lineTo(4.0, 34.768295);
        ((GeneralPath) shape).curveTo(4.0, 37.050594, 6.545463, 38.884148, 9.707317, 38.884148);
        ((GeneralPath) shape).curveTo(12.171249, 38.884148, 14.255485, 37.590885, 15.057927, 36.01829);
        ((GeneralPath) shape).lineTo(41.335365, 36.01829);
        ((GeneralPath) shape).curveTo(42.263233, 36.01829, 43.0, 35.27632, 43.0, 34.371952);
        ((GeneralPath) shape).lineTo(43.0, 11.512196);
        ((GeneralPath) shape).curveTo(43.0, 10.607826, 42.26323, 9.865852, 41.335365, 9.865852);
        ((GeneralPath) shape).lineTo(5.664634, 9.865852);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(44.5, 32.25),
                new Point2D.Double(40.625, 32.25), new float[] {
                    0, 1 }, new Color[] {
                    BLACK, new Color(0x0, true) }, NO_CYCLE, SRGB, new AffineTransform(0.9512194f, 0, 0,
                        0.9756096f, 0.6707319f, -3.304878f)));
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.4764706f * origAlpha));

        // _0_0_4
        shape = new RoundRectangle2D.Double(14.125, 30.5, 25.625, 4.5, 1.1863425970077515, 1.25);
        g.setPaint(new LinearGradientPaint(new Point2D.Double(31.5, 39), new Point2D.Double(31.5,
                34.49826431274414), new float[] {
            0, 1 }, new Color[] {
            WHITE, new Color(0xA5A5A5, true) }, NO_CYCLE, SRGB, new AffineTransform(0.9490741f, 0, 0, 1,
                -1.1788194f, -4)));
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(30.4375, 15.0);
        ((GeneralPath) shape).curveTo(24.161402, 15.0, 19.0625, 20.068287, 19.0625, 26.3125);
        ((GeneralPath) shape).curveTo(19.0625, 30.442698, 21.327843, 34.02795, 24.65625, 36.0);
        ((GeneralPath) shape).lineTo(36.21875, 36.0);
        ((GeneralPath) shape).curveTo(39.547157, 34.02795, 41.8125, 30.442696, 41.8125, 26.3125);
        ((GeneralPath) shape).curveTo(41.8125, 20.068287, 36.713596, 15.0, 30.4375, 15.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(22.992923736572266, 42.25815963745117),
                new Point2D.Double(39.224056243896484, 19.70405387878418), new float[] {
                    0, 0.5f, 0.75f, 1 }, new Color[] {
                    new Color(0xBABDB6), WHITE, new Color(0xC0C3BB), WHITE }, NO_CYCLE, SRGB,
                new AffineTransform(0.9780423f, 0, 0, 0.9730736f, 1.5876454f, -1.307902f)));
        g.fill(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.0, 33.763325);
        ((GeneralPath) shape).curveTo(3.5625, 38.3914, 12.590192, 39.218273, 14.116117, 35.107075);
        ((GeneralPath) shape).lineTo(17.0, 35.107075);
        ((GeneralPath) shape).curveTo(17.577469, 35.107075, 18.0, 34.735332, 18.0, 33.9375);
        ((GeneralPath) shape).lineTo(18.0, 16.0);
        ((GeneralPath) shape).curveTo(18.0, 15.377795, 17.742046, 15.0625, 17.125, 15.0625);
        ((GeneralPath) shape).lineTo(13.928617, 15.0625);
        ((GeneralPath) shape).curveTo(11.234482, 18.288094, 4.773502, 15.204428, 4.0, 13.125);
        ((GeneralPath) shape).lineTo(4.0, 33.763325);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(5, 29.951862335205078), new Point2D.Double(20,
                29.951862335205078), new float[] {
            0, 0.16071428f, 0.56037414f, 1 }, new Color[] {
            new Color(0x898B86), new Color(0xB3B3B0), new Color(0x71746F), new Color(0x555753) }, NO_CYCLE,
                SRGB, new AffineTransform(1, 0, 0, 1, 0, -4)));
        g.fill(shape);

        // _0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.5, 10.93566);
        ((GeneralPath) shape).lineTo(4.5, 12.28125);
        ((GeneralPath) shape).curveTo(4.5, 14.62061, 6.013118, 16.4375, 9.255931, 16.4375);
        ((GeneralPath) shape).curveTo(11.782953, 16.4375, 13.005952, 15.17441, 13.828942, 13.5625);
        ((GeneralPath) shape).lineTo(41.267006, 13.5625);
        ((GeneralPath) shape).curveTo(42.218628, 13.5625, 42.5, 12.80198, 42.5, 11.875);
        ((GeneralPath) shape).lineTo(42.5, 11.053243);
        ((GeneralPath) shape).curveTo(42.5, 10.481627, 41.90364, 10.06066, 41.314342, 10.06066);
        ((GeneralPath) shape).lineTo(5.4755754, 10.06066);
        ((GeneralPath) shape).curveTo(4.956924, 10.021822, 4.535038, 10.148297, 4.5, 10.93566);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF6F6F6));
        g.fill(shape);
        g.setPaint(new LinearGradientPaint(new Point2D.Double(24.03818130493164, 18.620981216430664),
                new Point2D.Double(24.03818130493164, 15.495981216430664), new float[] {
                    0, 1 }, new Color[] {
                    WHITE, new Color(0xFFFFFF, true) }, NO_CYCLE, SRGB, new AffineTransform(0.9755756f, 0, 0,
                        1, 0.1099098f, -4)));
        g.draw(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.14705881f * origAlpha));

        // _0_0_8
        shape = new RoundRectangle2D.Double(7, 17.75, 1.5, 19.5, 1.1863425970077515, 1.25);
        g.setPaint(WHITE);
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.2f * origAlpha));

        // _0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.116117, 35.107075);
        ((GeneralPath) shape).lineTo(17.0, 35.107075);
        ((GeneralPath) shape).curveTo(17.577469, 35.107075, 18.0, 34.735332, 18.0, 33.9375);
        ((GeneralPath) shape).lineTo(18.0, 16.0);
        ((GeneralPath) shape).curveTo(18.0, 15.377795, 17.742046, 15.0625, 17.125, 15.0625);
        ((GeneralPath) shape).lineTo(13.928617, 15.0625);
        ((GeneralPath) shape).curveTo(13.928617, 15.0625, 14.116117, 35.107075, 14.116117, 35.107075);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(13.928616523742676, 29.084787368774414),
                new Point2D.Double(35.02602005004883, 29.084787368774414), new float[] {
                    0, 1 }, new Color[] {
                    WHITE, new Color(0xFFFFFF, true) }, NO_CYCLE, SRGB,
                new AffineTransform(1, 0, 0, 1, 0, -4)));
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.37058824f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1.0041459f, 0, 0, 1, -0.019304654f, 0));

        // _0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.21875, 10.65625);
        ((GeneralPath) shape).curveTo(4.887352, 10.65625, 4.65625, 10.902796, 4.65625, 11.1875);
        ((GeneralPath) shape).lineTo(4.65625, 15.71875);
        ((GeneralPath) shape).lineTo(4.65625, 35.0625);
        ((GeneralPath) shape).lineTo(4.65625, 35.28125);
        ((GeneralPath) shape).curveTo(4.65625, 36.019485, 5.048684, 36.715786, 5.875, 37.3125);
        ((GeneralPath) shape).curveTo(6.701316, 37.909214, 7.9471874, 38.34375, 9.34375, 38.34375);
        ((GeneralPath) shape).curveTo(11.463736, 38.34375, 13.245322, 37.14209, 13.8125, 36.03125);
        ((GeneralPath) shape).curveTo(14.013191, 35.647274, 14.410489, 35.406487, 14.84375, 35.40625);
        ((GeneralPath) shape).lineTo(41.78125, 35.40625);
        ((GeneralPath) shape).curveTo(42.112648, 35.40625, 42.34375, 35.159706, 42.34375, 34.875);
        ((GeneralPath) shape).lineTo(42.34375, 11.1875);
        ((GeneralPath) shape).curveTo(42.34375, 10.902795, 42.112644, 10.65625, 41.78125, 10.65625);
        ((GeneralPath) shape).lineTo(5.21875, 10.65625);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(25.84375, 27.124889373779297),
                new Point2D.Double(25.84375, 45), new float[] {
                    0, 1 }, new Color[] {
                    WHITE, new Color(0xFFFFFF, true) }, NO_CYCLE, SRGB, new AffineTransform()));
        g.setStroke(new BasicStroke(0.99793345f, 0, 0, 10));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_10
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1.1f, 0, 0, 1.1f, 0.60625f, -8.93125f));

        // _0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.5625, 23.0625);
        ((GeneralPath) shape).curveTo(24.5625, 24.098034, 23.723034, 24.9375, 22.6875, 24.9375);
        ((GeneralPath) shape).curveTo(21.651966, 24.9375, 20.8125, 24.098034, 20.8125, 23.0625);
        ((GeneralPath) shape).curveTo(20.8125, 22.026966, 21.651966, 21.1875, 22.6875, 21.1875);
        ((GeneralPath) shape).curveTo(23.723034, 21.1875, 24.5625, 22.026966, 24.5625, 23.0625);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x2E3436));
        g.fill(shape);
        g.setPaint(new LinearGradientPaint(new Point2D.Double(22.0625, 22.125), new Point2D.Double(24,
                24.9375), new float[] {
            0, 1 }, new Color[] {
            new Color(0x888A85), WHITE }, NO_CYCLE, SRGB, new AffineTransform()));
        g.setStroke(new BasicStroke(0.90909094f, 0, 0, 10));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_11
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.5333333f, 0, 0, 0.5333333f, 8.400001f, 4.200001f));

        // _0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.5625, 23.0625);
        ((GeneralPath) shape).curveTo(24.5625, 24.098034, 23.723034, 24.9375, 22.6875, 24.9375);
        ((GeneralPath) shape).curveTo(21.651966, 24.9375, 20.8125, 24.098034, 20.8125, 23.0625);
        ((GeneralPath) shape).curveTo(20.8125, 22.026966, 21.651966, 21.1875, 22.6875, 21.1875);
        ((GeneralPath) shape).curveTo(23.723034, 21.1875, 24.5625, 22.026966, 24.5625, 23.0625);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x2E3436));
        g.fill(shape);
        g.setPaint(new LinearGradientPaint(new Point2D.Double(22.0625, 22.125), new Point2D.Double(24,
                24.9375), new float[] {
            0, 1 }, new Color[] {
            new Color(0x888A85), WHITE }, NO_CYCLE, SRGB, new AffineTransform()));
        g.setStroke(new BasicStroke(1.8750001f, 0, 0, 10));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_12

        // _0_0_13
        shape = new RoundRectangle2D.Double(33.5, 14.5, 7.999996662139893, 4, 2.5788350105285645,
                2.6241064071655273);
        g.setPaint(new LinearGradientPaint(new Point2D.Double(6.559582710266113, 29.373809814453125),
                new Point2D.Double(6.559582710266113, 30.19115447998047), new float[] {
                    0, 1 }, new Color[] {
                    WHITE, new Color(0xCBCBCB) }, NO_CYCLE, SRGB, new AffineTransform(1.2673265f, 0, 0,
                        1.7297297f, 28.430708f, -34.58105f)));
        g.fill(shape);
        g.setPaint(new LinearGradientPaint(new Point2D.Double(7.915133476257324, 30.81684112548828),
                new Point2D.Double(7.915133476257324, 24.700984954833984), new float[] {
                    0, 1 }, new Color[] {
                    new Color(0xEEEEEE), new Color(0xA2A2A2) }, NO_CYCLE, SRGB, new AffineTransform(1.13066f,
                        0, 0, 0.6747171f, 28.550674f, -1.9552823f)));
        g.setStroke(new BasicStroke(1, 0, 0, 4));
        g.draw(shape);
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1.355599f, 0, 0, 1.3453974f, -14.966671f, -18.75734f));

        // _0_0_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(39.421204, 33.150757);
        ((GeneralPath) shape).curveTo(39.422047, 35.235474, 38.31035, 37.162193, 36.50507, 38.204796);
        ((GeneralPath) shape).curveTo(34.69979, 39.2474, 32.475353, 39.2474, 30.670076, 38.204796);
        ((GeneralPath) shape).curveTo(28.8648, 37.162193, 27.7531, 35.235474, 27.753942, 33.150757);
        ((GeneralPath) shape).curveTo(27.7531, 31.06604, 28.8648, 29.13932, 30.670076, 28.096718);
        ((GeneralPath) shape).curveTo(32.475353, 27.054117, 34.69979, 27.054117, 36.50507, 28.096718);
        ((GeneralPath) shape).curveTo(38.31035, 29.13932, 39.422047, 31.06604, 39.421204, 33.150757);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(25.63262176513672, 33.1507568359375),
                new Point2D.Double(39.42120361328125, 33.1507568359375), new float[] {
                    0, 0.5f, 0.75f, 1 }, new Color[] {
                    new Color(0x72776C), new Color(0xE0E0E0), new Color(0x8F9587), new Color(0xC1C1C1) },
                NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_14
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1.2939177f, 0, 0, 1.257793f, -12.894941f, -15.094093f));

        // _0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(39.421204, 33.150757);
        ((GeneralPath) shape).curveTo(39.422047, 35.235474, 38.31035, 37.162193, 36.50507, 38.204796);
        ((GeneralPath) shape).curveTo(34.69979, 39.2474, 32.475353, 39.2474, 30.670076, 38.204796);
        ((GeneralPath) shape).curveTo(28.8648, 37.162193, 27.7531, 35.235474, 27.753942, 33.150757);
        ((GeneralPath) shape).curveTo(27.7531, 31.06604, 28.8648, 29.13932, 30.670076, 28.096718);
        ((GeneralPath) shape).curveTo(32.475353, 27.054117, 34.69979, 27.054117, 36.50507, 28.096718);
        ((GeneralPath) shape).curveTo(38.31035, 29.13932, 39.422047, 31.06604, 39.421204, 33.150757);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(35.132232666015625, 38.14469528198242),
                5.9602365f, new Point2D.Double(35.132232666015625, 38.14469528198242), new float[] {
                    0, 1 }, new Color[] {
                    WHITE, new Color(0xCCCCCC) }, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);
        g.setPaint(new LinearGradientPaint(new Point2D.Double(32.753944396972656, 29.5257568359375),
                new Point2D.Double(32.67120361328125, 39.4843864440918), new float[] {
                    0, 1 }, new Color[] {
                    WHITE, new Color(0xA5A5A5) }, NO_CYCLE, SRGB, new AffineTransform()));
        g.setStroke(new BasicStroke(0.23515993f, 0, 0, 10));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_15
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1.063528f, 0, 0, 1.0465457f, -5.156714f, -7.588624f));

        // _0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(39.421204, 33.150757);
        ((GeneralPath) shape).curveTo(39.422047, 35.235474, 38.31035, 37.162193, 36.50507, 38.204796);
        ((GeneralPath) shape).curveTo(34.69979, 39.2474, 32.475353, 39.2474, 30.670076, 38.204796);
        ((GeneralPath) shape).curveTo(28.8648, 37.162193, 27.7531, 35.235474, 27.753942, 33.150757);
        ((GeneralPath) shape).curveTo(27.7531, 31.06604, 28.8648, 29.13932, 30.670076, 28.096718);
        ((GeneralPath) shape).curveTo(32.475353, 27.054117, 34.69979, 27.054117, 36.50507, 28.096718);
        ((GeneralPath) shape).curveTo(38.31035, 29.13932, 39.422047, 31.06604, 39.421204, 33.150757);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(25.63262176513672, 33.1507568359375),
                new Point2D.Double(39.42120361328125, 33.1507568359375), new float[] {
                    0, 0.5f, 0.75f, 1 }, new Color[] {
                    new Color(0x72776C), new Color(0xE0E0E0), new Color(0x8F9587), new Color(0xC1C1C1) },
                NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_16
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1.0151362f, 0, 0, 0.9686302f, -3.5313497f, -4.797608f));

        // _0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(39.421204, 33.150757);
        ((GeneralPath) shape).curveTo(39.422047, 35.235474, 38.31035, 37.162193, 36.50507, 38.204796);
        ((GeneralPath) shape).curveTo(34.69979, 39.2474, 32.475353, 39.2474, 30.670076, 38.204796);
        ((GeneralPath) shape).curveTo(28.8648, 37.162193, 27.7531, 35.235474, 27.753942, 33.150757);
        ((GeneralPath) shape).curveTo(27.7531, 31.06604, 28.8648, 29.13932, 30.670076, 28.096718);
        ((GeneralPath) shape).curveTo(32.475353, 27.054117, 34.69979, 27.054117, 36.50507, 28.096718);
        ((GeneralPath) shape).curveTo(38.31035, 29.13932, 39.422047, 31.06604, 39.421204, 33.150757);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(32.753944396972656, 29.5257568359375),
                5.9602365f, new Point2D.Double(32.753944396972656, 29.5257568359375), new float[] {
                    0, 1 }, new Color[] {
                    WHITE, new Color(0xCCCCCC) }, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);
        g.setPaint(new LinearGradientPaint(new Point2D.Double(32.753944396972656, 29.5257568359375),
                new Point2D.Double(32.67120361328125, 39.4843864440918), new float[] {
                    0, 1 }, new Color[] {
                    WHITE, new Color(0xA5A5A5) }, NO_CYCLE, SRGB, new AffineTransform()));
        g.setStroke(new BasicStroke(0.3025381f, 0, 0, 10));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_17
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1.2702988f, 0, 0, 1.2700835f, -10.164339f, -15.06132f));

        // _0_0_18
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.8125, 33.375);
        ((GeneralPath) shape).curveTo(35.8125, 35.446068, 34.133568, 37.125, 32.0625, 37.125);
        ((GeneralPath) shape).curveTo(29.991432, 37.125, 28.3125, 35.446068, 28.3125, 33.375);
        ((GeneralPath) shape).curveTo(28.3125, 31.303932, 29.991432, 29.625, 32.0625, 29.625);
        ((GeneralPath) shape).curveTo(34.133568, 29.625, 35.8125, 31.303932, 35.8125, 33.375);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(28.3125, 33.375), new Point2D.Double(35.8125,
                33.375), new float[] {
            0, 0.5f, 1 }, new Color[] {
            new Color(0x2E3436), new Color(0x6B797D), new Color(0x2E3436) }, NO_CYCLE, SRGB,
                new AffineTransform()));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_18
        g.setComposite(AlphaComposite.getInstance(3, 0.47058824f * origAlpha));

        // _0_0_19
        shape = new RoundRectangle2D.Double(26.475425720214844, 25.37565803527832, 8.178380012512207,
                4.564979553222656, 1.8975083827972412, 2.4713375568389893);
        g.setPaint(WHITE);
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));

        // _0_0_20
        shape = new RoundRectangle2D.Double(26.475425720214844, 24.80805778503418, 8.178380012512207, 5,
                2.264902353286743, 2.264902353286743);
        g.setPaint(new RadialGradientPaint(new Point2D.Double(33.71739196777344, 34.22916793823242), 3.5f,
                new Point2D.Double(33.71739196777344, 34.22916793823242), new float[] {
                    0, 1 }, new Color[] {
                    new Color(0x717171), BLACK }, NO_CYCLE, SRGB, new AffineTransform(0.9597076f, 0, 0,
                        1.4285709f, -0.6258796f, -20.549067f)));
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.7823529f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 0.9697467f, 0, -2.6906917f));

        // _0_0_21
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.197592, 17.726992);
        ((GeneralPath) shape).curveTo(12.198016, 18.279757, 11.633744, 18.790627, 10.71743, 19.067074);
        ((GeneralPath) shape).curveTo(9.801116, 19.34352, 8.672049, 19.34352, 7.7557344, 19.067074);
        ((GeneralPath) shape).curveTo(6.8394203, 18.790627, 6.275148, 18.279757, 6.275573, 17.726992);
        ((GeneralPath) shape).curveTo(6.275148, 17.174227, 6.8394203, 16.663357, 7.7557344, 16.38691);
        ((GeneralPath) shape).curveTo(8.672049, 16.110464, 9.801116, 16.110464, 10.71743, 16.38691);
        ((GeneralPath) shape).curveTo(11.633744, 16.663357, 12.198016, 17.174227, 12.197592, 17.726992);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(9.23658275604248, 15.629610061645508),
                2.9610097f, new Point2D.Double(9.23658275604248, 15.629610061645508), new float[] {
                    0, 0.5f, 1 }, new Color[] {
                    BLACK, BLACK, new Color(0xAFAFAF) }, NO_CYCLE, SRGB, new AffineTransform(1.5304128f, 0,
                        0, 0.7994693f, -4.899202f, 4.1359506f)));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_21
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.8598222f, 0, 0, 0.7359198f, 1.2947636f, 1.3521018f));

        // _0_0_22
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.197592, 17.726992);
        ((GeneralPath) shape).curveTo(12.198016, 18.279757, 11.633744, 18.790627, 10.71743, 19.067074);
        ((GeneralPath) shape).curveTo(9.801116, 19.34352, 8.672049, 19.34352, 7.7557344, 19.067074);
        ((GeneralPath) shape).curveTo(6.8394203, 18.790627, 6.275148, 18.279757, 6.275573, 17.726992);
        ((GeneralPath) shape).curveTo(6.275148, 17.174227, 6.8394203, 16.663357, 7.7557344, 16.38691);
        ((GeneralPath) shape).curveTo(8.672049, 16.110464, 9.801116, 16.110464, 10.71743, 16.38691);
        ((GeneralPath) shape).curveTo(11.633744, 16.663357, 12.198016, 17.174227, 12.197592, 17.726992);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(9.23658275604248, 16.462448120117188),
                2.9610097f, new Point2D.Double(9.23658275604248, 16.462448120117188), new float[] {
                    0, 0.32142857f, 0.5f, 1 }, new Color[] {
                    WHITE, new Color(0xEBEBEB), new Color(0x909090), new Color(0xFAFAFA) }, NO_CYCLE, SRGB,
                new AffineTransform(1.9559599f, 0, 0, 1.02177f, -8.8298025f, 0.2455734f)));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_22

        // _0_0_23
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.84375, 11.28125);
        ((GeneralPath) shape).lineTo(3.9960613, 17.25);
        ((GeneralPath) shape).lineTo(4.3616085, 13.375);
        ((GeneralPath) shape).curveTo(4.3616085, 11.78401, 5.945646, 11.75, 5.945646, 11.75);
        ((GeneralPath) shape).lineTo(41.647415, 11.75);
        ((GeneralPath) shape).curveTo(42.80498, 11.71875, 42.865906, 13.875, 42.865906, 13.875);
        ((GeneralPath) shape).curveTo(42.865906, 13.875, 42.987755, 11.375, 42.987755, 11.375);
        ((GeneralPath) shape).curveTo(43.073914, 10.579505, 42.713593, 9.96875, 41.647415, 9.875);
        ((GeneralPath) shape).lineTo(5.214552, 9.875);
        ((GeneralPath) shape).curveTo(4.54369, 9.875, 3.84375, 10.48781, 3.84375, 11.28125);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(24.75, 14.559897422790527), new Point2D.Double(
                24.75, 17.5625), new float[] {
            0, 1 }, new Color[] {
            WHITE, new Color(0x8B8B8B) }, NO_CYCLE, SRGB, new AffineTransform(0.9747923f, 0, 0, 1,
                0.09689207f, -4)));
        g.fill(shape);
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.5065839f, 0, 0, 0.6464973f, 24.820896f, -0.4604517f));

        // _0_0_24
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.197592, 17.726992);
        ((GeneralPath) shape).curveTo(12.198016, 18.279757, 11.633744, 18.790627, 10.71743, 19.067074);
        ((GeneralPath) shape).curveTo(9.801116, 19.34352, 8.672049, 19.34352, 7.7557344, 19.067074);
        ((GeneralPath) shape).curveTo(6.8394203, 18.790627, 6.275148, 18.279757, 6.275573, 17.726992);
        ((GeneralPath) shape).curveTo(6.275148, 17.174227, 6.8394203, 16.663357, 7.7557344, 16.38691);
        ((GeneralPath) shape).curveTo(8.672049, 16.110464, 9.801116, 16.110464, 10.71743, 16.38691);
        ((GeneralPath) shape).curveTo(11.633744, 16.663357, 12.198016, 17.174227, 12.197592, 17.726992);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(9.23658275604248, 15.667007446289062),
                2.9610097f, new Point2D.Double(9.195677757263184, 16.975967407226562), new float[] {
                    0, 0.32142857f, 0.5f, 1 }, new Color[] {
                    WHITE, new Color(0xEBEBEB), new Color(0x909090), new Color(0xFAFAFA) }, NO_CYCLE, SRGB,
                new AffineTransform(2.1327367f, 0, 0, 1.114116f, -10.462615f, -1.2746685f)));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_24
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.5065839f, 0, 0, 0.6464973f, 28.820896f, -0.4604517f));

        // _0_0_25
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.197592, 17.726992);
        ((GeneralPath) shape).curveTo(12.198016, 18.279757, 11.633744, 18.790627, 10.71743, 19.067074);
        ((GeneralPath) shape).curveTo(9.801116, 19.34352, 8.672049, 19.34352, 7.7557344, 19.067074);
        ((GeneralPath) shape).curveTo(6.8394203, 18.790627, 6.275148, 18.279757, 6.275573, 17.726992);
        ((GeneralPath) shape).curveTo(6.275148, 17.174227, 6.8394203, 16.663357, 7.7557344, 16.38691);
        ((GeneralPath) shape).curveTo(8.672049, 16.110464, 9.801116, 16.110464, 10.71743, 16.38691);
        ((GeneralPath) shape).curveTo(11.633744, 16.663357, 12.198016, 17.174227, 12.197592, 17.726992);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_25
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.5065839f, 0, 0, 0.6464973f, 32.820896f, -0.4604517f));

        // _0_0_26
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.197592, 17.726992);
        ((GeneralPath) shape).curveTo(12.198016, 18.279757, 11.633744, 18.790627, 10.71743, 19.067074);
        ((GeneralPath) shape).curveTo(9.801116, 19.34352, 8.672049, 19.34352, 7.7557344, 19.067074);
        ((GeneralPath) shape).curveTo(6.8394203, 18.790627, 6.275148, 18.279757, 6.275573, 17.726992);
        ((GeneralPath) shape).curveTo(6.275148, 17.174227, 6.8394203, 16.663357, 7.7557344, 16.38691);
        ((GeneralPath) shape).curveTo(8.672049, 16.110464, 9.801116, 16.110464, 10.71743, 16.38691);
        ((GeneralPath) shape).curveTo(11.633744, 16.663357, 12.198016, 17.174227, 12.197592, 17.726992);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_26
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, -2, -4.1919417f));

        // _0_0_27
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0.375f, -0.125f));

        // _0_0_27_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.0, 31.0);
        ((GeneralPath) shape).curveTo(35.0, 32.484264, 33.796764, 33.6875, 32.3125, 33.6875);
        ((GeneralPath) shape).curveTo(30.828236, 33.6875, 29.625, 32.484264, 29.625, 31.0);
        ((GeneralPath) shape).curveTo(29.625, 29.515736, 30.828236, 28.3125, 32.3125, 28.3125);
        ((GeneralPath) shape).curveTo(33.796764, 28.3125, 35.0, 29.515736, 35.0, 31.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(32.3125, 31), 2.6875f, new Point2D.Double(
                32.3125, 31), new float[] {
            0, 0.5f, 1 }, new Color[] {
            new Color(0x204A87, true), new Color(0x204A87, true), new Color(0x204A87) }, NO_CYCLE, SRGB,
                new AffineTransform(0.953696f, 0, 0, 0.953696f, 1.496198f, 1.4354241f)));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_27_0
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.6764706f, 0, 0, 0.6764706f, 9.983456f, 13.224265f));

        // _0_0_27_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.6875, 26.0);
        ((GeneralPath) shape).curveTo(35.6875, 27.173605, 34.736107, 28.125, 33.5625, 28.125);
        ((GeneralPath) shape).curveTo(32.388893, 28.125, 31.4375, 27.173605, 31.4375, 26.0);
        ((GeneralPath) shape).curveTo(31.4375, 24.826395, 32.388893, 23.875, 33.5625, 23.875);
        ((GeneralPath) shape).curveTo(34.736107, 23.875, 35.6875, 24.826395, 35.6875, 26.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(32.10432434082031, 27.79938507080078), 4.125f,
                new Point2D.Double(32.10432434082031, 27.79938507080078), new float[] {
                    0, 1 }, new Color[] {
                    new Color(0xEDD400), new Color(0xEDD400, true) }, NO_CYCLE, SRGB, new AffineTransform(
                        0.4953887f, 0, 0, 0.4953887f, 16.642078f, 14.429586f)));
        g.setStroke(new BasicStroke(1.4782609f, 0, 0, 10));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_27_1
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.6676229f, 0, 0, 0.6675098f, 10.635888f, 7.577028f));

        // _0_0_27_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.1875, 33.0625);
        ((GeneralPath) shape).curveTo(32.1875, 33.54575, 31.79575, 33.9375, 31.3125, 33.9375);
        ((GeneralPath) shape).curveTo(30.82925, 33.9375, 30.4375, 33.54575, 30.4375, 33.0625);
        ((GeneralPath) shape).curveTo(30.4375, 32.57925, 30.82925, 32.1875, 31.3125, 32.1875);
        ((GeneralPath) shape).curveTo(31.79575, 32.1875, 32.1875, 32.57925, 32.1875, 33.0625);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_27_2

        g.setTransform(transformations.poll()); // _0_0_27
        g.setComposite(AlphaComposite.getInstance(3, 0.34705883f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, -2, 0));

        // _0_0_28
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.416853, 16.44536);
        ((GeneralPath) shape).curveTo(28.416965, 16.745428, 28.256947, 17.022749, 27.997099, 17.172815);
        ((GeneralPath) shape).curveTo(27.737253, 17.322882, 27.417074, 17.322882, 27.157228, 17.172815);
        ((GeneralPath) shape).curveTo(26.89738, 17.022749, 26.737362, 16.745428, 26.737474, 16.44536);
        ((GeneralPath) shape).curveTo(26.737362, 16.145292, 26.89738, 15.86797, 27.157228, 15.717904);
        ((GeneralPath) shape).curveTo(27.417074, 15.567838, 27.737253, 15.567838, 27.997099, 15.717904);
        ((GeneralPath) shape).curveTo(28.256947, 15.86797, 28.416965, 16.145292, 28.416853, 16.44536);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_28
        g.setComposite(AlphaComposite.getInstance(3, 0.30588236f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.7105263f, 0, 0, 0.7105263f, 6.3585134f, 5.474538f));

        // _0_0_29
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.416853, 16.44536);
        ((GeneralPath) shape).curveTo(28.416965, 16.745428, 28.256947, 17.022749, 27.997099, 17.172815);
        ((GeneralPath) shape).curveTo(27.737253, 17.322882, 27.417074, 17.322882, 27.157228, 17.172815);
        ((GeneralPath) shape).curveTo(26.89738, 17.022749, 26.737362, 16.745428, 26.737474, 16.44536);
        ((GeneralPath) shape).curveTo(26.737362, 16.145292, 26.89738, 15.86797, 27.157228, 15.717904);
        ((GeneralPath) shape).curveTo(27.417074, 15.567838, 27.737253, 15.567838, 27.997099, 15.717904);
        ((GeneralPath) shape).curveTo(28.256947, 15.86797, 28.416965, 16.145292, 28.416853, 16.44536);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_29

    }
}
