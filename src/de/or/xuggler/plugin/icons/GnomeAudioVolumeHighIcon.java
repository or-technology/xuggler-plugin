package de.or.xuggler.plugin.icons;

import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;
import static java.awt.MultipleGradientPaint.ColorSpaceType.SRGB;
import static java.awt.MultipleGradientPaint.CycleMethod.NO_CYCLE;

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

/**
 * This class has been automatically generated using <a href="https://flamingo.dev.java.net">Flamingo SVG
 * transcoder</a>.
 */
public class GnomeAudioVolumeHighIcon extends de.or.guiUtils.icons.FlamingoSvgJavaIcon {

    /**
     * Creates a new transcoded SVG image.
     */
    public GnomeAudioVolumeHighIcon()
    {
        this(48, 45);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public GnomeAudioVolumeHighIcon(int width, int height)
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
        return 45;
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
        g.setComposite(AlphaComposite.getInstance(3, 0.2f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1.5365906f, 0, 0, 2.4199734f, -1.1723206f, -56.384865f));

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.097088, 36.863068);
        ((GeneralPath) shape).curveTo(22.097088, 38.81569, 17.308777, 40.3986, 11.402098, 40.3986);
        ((GeneralPath) shape).curveTo(5.495417, 40.3986, 0.7071066, 38.81569, 0.7071066, 36.863068);
        ((GeneralPath) shape).curveTo(0.7071066, 34.910446, 5.495417, 33.327534, 11.402097, 33.327534);
        ((GeneralPath) shape).curveTo(17.308777, 33.327534, 22.097088, 34.910446, 22.097088, 36.863068);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(11.40209674835205, 36.863067626953125),
                10.69499f, new Point2D.Double(11.40209674835205, 36.863067626953125), new float[] {
                    0, 1 }, new Color[] {
                    BLACK, new Color(0x0, true) }, NO_CYCLE, SRGB, new AffineTransform(1, 0, 0, 0.330579f, 0,
                        24.67693f)));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.75f, 0, 0, 0.7857143f, 1.5f, 4.357156f));

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.0, 25.0);
        ((GeneralPath) shape).curveTo(8.0, 28.865993, 6.209139, 32.0, 4.0, 32.0);
        ((GeneralPath) shape).curveTo(1.790861, 32.0, 4.440892E-16, 28.865993, 0.0, 25.0);
        ((GeneralPath) shape).curveTo(0.0, 21.134007, 1.790861, 18.0, 4.0, 18.0);
        ((GeneralPath) shape).curveTo(6.209139, 18.0, 8.0, 21.134007, 8.0, 25.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x2E3436));
        g.fill(shape);
        g.setPaint(new Color(0x555753));
        g.setStroke(new BasicStroke(1.3026779f, 1, 0, 4));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_1
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, -1.53125f, 0.65625f));

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.5, 20.75);
        ((GeneralPath) shape).curveTo(4.5, 21.164213, 4.1642137, 21.5, 3.75, 21.5);
        ((GeneralPath) shape).curveTo(3.3357863, 21.5, 3.0, 21.164213, 3.0, 20.75);
        ((GeneralPath) shape).curveTo(3.0, 20.335787, 3.3357863, 20.0, 3.75, 20.0);
        ((GeneralPath) shape).curveTo(4.1642137, 20.0, 4.5, 20.335787, 4.5, 20.75);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xBABDB6));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_2

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.125, 15.500014);
        ((GeneralPath) shape).curveTo(4.1240034, 15.500014, 2.500001, 19.308037, 2.5, 24.000013);
        ((GeneralPath) shape).curveTo(2.5, 28.691992, 4.1240034, 32.500015, 6.125, 32.500015);
        ((GeneralPath) shape).lineTo(9.75, 32.500015);
        ((GeneralPath) shape).curveTo(11.750996, 32.500015, 13.375, 28.69199, 13.375, 24.000013);
        ((GeneralPath) shape).curveTo(13.375, 19.308037, 11.750996, 15.500014, 9.75, 15.500014);
        ((GeneralPath) shape).lineTo(6.125, 15.500014);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(78.5, -4.006520748138428), new Point2D.Double(
                78.5, 14.00098991394043), new float[] {
            0, 0.25301206f, 1 }, new Color[] {
            new Color(0xBABDB6), new Color(0xEEEEEC), new Color(0x555753) }, NO_CYCLE, SRGB,
                new AffineTransform(0.90625f, 0, 0, 1, -65.921875f, 19)));
        g.fill(shape);
        g.setPaint(new LinearGradientPaint(new Point2D.Double(80.0625, 14), new Point2D.Double(80.0625,
                -4.008772850036621), new float[] {
            0, 1 }, new Color[] {
            new Color(0x555753), new Color(0xBABDB6) }, NO_CYCLE, SRGB, new AffineTransform(0.90625f, 0, 0,
                1, -65.921875f, 19)));
        g.setStroke(new BasicStroke(1, 1, 0, 4));
        g.draw(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.6f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.89375f, 0, 0, 1, 1.265625f, 2));

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.5, 14.5);
        ((GeneralPath) shape).curveTo(4.974, 14.5, 4.2339163, 15.045895, 3.59375, 16.40625);
        ((GeneralPath) shape).curveTo(2.9535835, 17.766605, 2.5000005, 19.78201, 2.5, 22.0);
        ((GeneralPath) shape).curveTo(2.5, 24.21799, 2.9535835, 26.233395, 3.59375, 27.59375);
        ((GeneralPath) shape).curveTo(4.2339168, 28.954105, 4.9740005, 29.5, 5.5, 29.5);
        ((GeneralPath) shape).lineTo(9.5, 29.5);
        ((GeneralPath) shape).curveTo(10.025999, 29.5, 10.766083, 28.954105, 11.40625, 27.59375);
        ((GeneralPath) shape).curveTo(12.046417, 26.233395, 12.5, 24.217987, 12.5, 22.0);
        ((GeneralPath) shape).curveTo(12.5, 19.782013, 12.046417, 17.766605, 11.40625, 16.40625);
        ((GeneralPath) shape).curveTo(10.766083, 15.045894, 10.026, 14.5, 9.5, 14.5);
        ((GeneralPath) shape).lineTo(5.5, 14.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(3.844893217086792, 15.561476707458496),
                new Point2D.Double(3.844893217086792, 39.88433837890625), new float[] {
                    0, 1 }, new Color[] {
                    WHITE, new Color(0xFFFFFF, true) }, NO_CYCLE, SRGB, new AffineTransform()));
        g.setStroke(new BasicStroke(1.0577718f, 1, 0, 4));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_4
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.696925, 16.0);
        ((GeneralPath) shape).curveTo(7.656226, 16.0, 6.000001, 19.57702, 6.0, 23.984375);
        ((GeneralPath) shape).curveTo(6.0, 28.39173, 7.656226, 31.968752, 9.696925, 31.96875);
        ((GeneralPath) shape).lineTo(10.334325, 31.96875);
        ((GeneralPath) shape).curveTo(12.375024, 31.96875, 14.03125, 28.391727, 14.03125, 23.984375);
        ((GeneralPath) shape).curveTo(14.03125, 19.57702, 12.375024, 16.0, 10.334325, 16.0);
        ((GeneralPath) shape).lineTo(9.696925, 16.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(80.693359375, 31.561477661132812),
                new Point2D.Double(77.125, 14), new float[] {
                    0, 1 }, new Color[] {
                    new Color(0x555753), new Color(0x888A85) }, NO_CYCLE, SRGB, new AffineTransform(1, 0, 0,
                        1, -70, 2)));
        g.fill(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.625, 24.0);
        ((GeneralPath) shape).curveTo(8.625, 33.227272, 17.811975, 38.5, 23.500002, 38.5);
        ((GeneralPath) shape).curveTo(27.437502, 38.5, 30.500002, 32.003998, 30.500002, 24.0);
        ((GeneralPath) shape).curveTo(30.500002, 15.996003, 27.437502, 9.5, 23.500002, 9.5);
        ((GeneralPath) shape).curveTo(17.811975, 9.5, 8.625, 14.772728, 8.625, 24.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(9.320398330688477, 18.817092895507812), 12.5f,
                new Point2D.Double(9.320398330688477, 18.817092895507812), new float[] {
                    0, 1 }, new Color[] {
                    new Color(0xEEEEEC), new Color(0x61635F) }, NO_CYCLE, SRGB, new AffineTransform(
                        0.7132478f, 0.5221478f, -0.9280778f, 1.1784894f, 22.517143f, -6.7083f)));
        g.fill(shape);
        g.setPaint(new LinearGradientPaint(new Point2D.Double(7.75, 33.04657745361328), new Point2D.Double(
                4.643186569213867, 12.063652038574219), new float[] {
            0, 1 }, new Color[] {
            new Color(0x555753), new Color(0xBABDB6) }, NO_CYCLE, SRGB, new AffineTransform(0.9114584f, 0, 0,
                0.8787879f, 2.7005208f, 4.6666546f)));
        g.setStroke(new BasicStroke(1, 1, 0, 4));
        g.draw(shape);
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1.3225807f, 0, 0, 1.026415f, -12.145162f, -4.6754713f));

        // _0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(33.0, 27.9375);
        ((GeneralPath) shape).curveTo(33.0, 37.084717, 29.530207, 44.5, 25.25, 44.5);
        ((GeneralPath) shape).curveTo(20.969793, 44.5, 17.5, 37.084717, 17.5, 27.9375);
        ((GeneralPath) shape).curveTo(17.5, 18.790283, 20.969793, 11.375, 25.25, 11.375);
        ((GeneralPath) shape).curveTo(29.530207, 11.375, 33.0, 18.790283, 33.0, 27.9375);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(23.98688316345215, 27.05316734313965), 7.75f,
                new Point2D.Double(23.98688316345215, 27.05316734313965), new float[] {
                    0, 1 }, new Color[] {
                    WHITE, new Color(0xFFFFFF, true) }, NO_CYCLE, SRGB, new AffineTransform(-0.2432942f, 0,
                        0, -1.2543129f, 25.2214f, 61.870636f)));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_7
        g.setComposite(AlphaComposite.getInstance(3, 0.7335907f * origAlpha));

        // _0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.0, 13.375);
        ((GeneralPath) shape).curveTo(13.416667, 14.769678, 10.541667, 17.57092, 8.0, 21.5);
        ((GeneralPath) shape).curveTo(10.69956, 20.373913, 13.491292, 19.539528, 16.0, 19.75);
        ((GeneralPath) shape).lineTo(16.0, 13.375);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(20.226221084594727, 20.333629608154297),
                new Point2D.Double(11.4375, 21.75), new float[] {
                    0, 0.5f, 1 }, new Color[] {
                    new Color(0xFFFFFF, true), WHITE, new Color(0xFFFFFF, true) }, NO_CYCLE, SRGB,
                new AffineTransform(0.6666667f, 0, 0, 1, 2, -1)));
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.5862069f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.9034091f, 0, 0, 0.8709678f, 2.8494318f, 4.8387094f));

        // _0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.8125, 6.5);
        ((GeneralPath) shape).curveTo(20.0167, 6.5, 16.088488, 7.9333134, 12.96875, 10.59375);
        ((GeneralPath) shape).curveTo(9.849012, 13.254187, 7.5, 17.073742, 7.5, 22.0);
        ((GeneralPath) shape).curveTo(7.5, 26.92626, 9.849012, 30.745813, 12.96875, 33.40625);
        ((GeneralPath) shape).curveTo(16.088488, 36.06669, 20.0167, 37.5, 22.8125, 37.5);
        ((GeneralPath) shape).curveTo(24.394999, 37.5, 26.04527, 36.056267, 27.34375, 33.25);
        ((GeneralPath) shape).curveTo(28.64223, 30.443735, 29.5, 26.429214, 29.5, 22.0);
        ((GeneralPath) shape).curveTo(29.5, 17.570787, 28.64223, 13.556265, 27.34375, 10.75);
        ((GeneralPath) shape).curveTo(26.04527, 7.943735, 24.394999, 6.5, 22.8125, 6.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(12.197591781616211, 9.25974178314209),
                new Point2D.Double(12.197591781616211, 47.496856689453125), new float[] {
                    0, 1 }, new Color[] {
                    WHITE, new Color(0xFFFFFF, true) }, NO_CYCLE, SRGB, new AffineTransform()));
        g.setStroke(new BasicStroke(1.1273447f, 1, 0, 4));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_9
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1.2258059f, 0, 0, 1.1773585f, -8.951594f, -8.892453f));

        // _0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(33.0, 27.9375);
        ((GeneralPath) shape).curveTo(33.0, 37.084717, 29.530207, 44.5, 25.25, 44.5);
        ((GeneralPath) shape).curveTo(20.969793, 44.5, 17.5, 37.084717, 17.5, 27.9375);
        ((GeneralPath) shape).curveTo(17.5, 18.790283, 20.969793, 11.375, 25.25, 11.375);
        ((GeneralPath) shape).curveTo(29.530207, 11.375, 33.0, 18.790283, 33.0, 27.9375);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(23.164974212646484, 30.232789993286133),
                8.189013f, new Point2D.Double(23.164974212646484, 30.232789993286133), new float[] {
                    0, 1 }, new Color[] {
                    new Color(0xBABDB6), new Color(0x555753) }, NO_CYCLE, SRGB, new AffineTransform(
                        1.7346265f, -0.1698771f, 0.327755f, 3.6175227f, -27.429342f, -73.69679f)));
        g.fill(shape);
        g.setPaint(new LinearGradientPaint(new Point2D.Double(33.43055725097656, 45.052154541015625),
                new Point2D.Double(33.43055725097656, 0.3103710114955902), new float[] {
                    0, 1 }, new Color[] {
                    new Color(0x555753), new Color(0xD3D7CF) }, NO_CYCLE, SRGB, new AffineTransform()));
        g.setStroke(new BasicStroke(0.8324051f, 1, 0, 4));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_10

        // _0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.616117, 24.000008);
        ((GeneralPath) shape).curveTo(21.616117, 26.484005, 19.233185, 28.49999, 17.549734, 28.49999);
        ((GeneralPath) shape).curveTo(15.866281, 28.49999, 14.500001, 26.483992, 14.500001, 23.999994);
        ((GeneralPath) shape).curveTo(14.500001, 21.515999, 15.866281, 19.5, 17.549734, 19.5);
        ((GeneralPath) shape).curveTo(19.233185, 19.5, 21.616117, 21.51601, 21.616117, 24.000008);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(20.883899688720703, 20.434255599975586),
                3.9999843f, new Point2D.Double(20.883899688720703, 20.434255599975586), new float[] {
                    0, 1 }, new Color[] {
                    new Color(0xBABDB6), new Color(0x555753) }, NO_CYCLE, SRGB, new AffineTransform(
                        1.3093938f, 0, 0, 1.5604932f, -8.388638f, -9.784483f)));
        g.fill(shape);
        g.setPaint(new Color(0x555753));
        g.setStroke(new BasicStroke(1, 1, 0, 4));
        g.draw(shape);

        // _0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.0, 5.0);
        ((GeneralPath) shape).curveTo(19.367552, 5.0, 17.141972, 7.2498264, 15.5625, 10.6875);
        ((GeneralPath) shape).curveTo(13.983028, 14.125173, 13.03125, 18.830126, 13.03125, 24.0);
        ((GeneralPath) shape).curveTo(13.03125, 29.169874, 13.983028, 33.874825, 15.5625, 37.3125);
        ((GeneralPath) shape).curveTo(17.141972, 40.75017, 19.367552, 43.0, 22.0, 43.0);
        ((GeneralPath) shape).curveTo(24.632448, 43.0, 26.858028, 40.75017, 28.4375, 37.3125);
        ((GeneralPath) shape).curveTo(29.42467, 35.16395, 30.17461, 32.50128, 30.59375, 29.5625);
        ((GeneralPath) shape).curveTo(30.606968, 29.469828, 30.61243, 29.374514, 30.625, 29.28125);
        ((GeneralPath) shape).curveTo(30.701405, 28.714302, 30.76073, 28.149757, 30.8125, 27.5625);
        ((GeneralPath) shape).curveTo(30.863373, 27.016087, 30.910141, 26.469463, 30.9375, 25.90625);
        ((GeneralPath) shape).curveTo(30.938938, 25.875286, 30.93613, 25.843508, 30.9375, 25.8125);
        ((GeneralPath) shape).curveTo(30.96497, 25.216652, 30.96875, 24.611753, 30.96875, 24.0);
        ((GeneralPath) shape).curveTo(30.96875, 23.355639, 30.96794, 22.720383, 30.9375, 22.09375);
        ((GeneralPath) shape).curveTo(30.91165, 21.537127, 30.860237, 20.979033, 30.8125, 20.4375);
        ((GeneralPath) shape).curveTo(30.76073, 19.850243, 30.701405, 19.285698, 30.625, 18.71875);
        ((GeneralPath) shape).curveTo(30.611504, 18.623566, 30.607962, 18.53201, 30.59375, 18.4375);
        ((GeneralPath) shape).curveTo(30.17461, 15.498719, 29.42467, 12.836046, 28.4375, 10.6875);
        ((GeneralPath) shape).curveTo(26.858028, 7.249826, 24.632448, 5.0, 22.0, 5.0);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(22.5, 7.0);
        ((GeneralPath) shape).curveTo(24.422274, 7.0000005, 26.280369, 8.76565, 27.6875, 11.84375);
        ((GeneralPath) shape).curveTo(28.566957, 13.767562, 29.26438, 16.179117, 29.65625, 18.875);
        ((GeneralPath) shape).curveTo(29.734625, 19.414177, 29.789845, 19.97021, 29.84375, 20.53125);
        ((GeneralPath) shape).curveTo(29.89121, 21.056658, 29.942835, 21.584654, 29.96875, 22.125);
        ((GeneralPath) shape).curveTo(30.000626, 22.745495, 30.03125, 23.361156, 30.03125, 24.0);
        ((GeneralPath) shape).curveTo(30.03125, 24.595745, 29.99653, 25.170103, 29.96875, 25.75);
        ((GeneralPath) shape).curveTo(29.966915, 25.790974, 29.97071, 25.834105, 29.96875, 25.875);
        ((GeneralPath) shape).curveTo(29.941175, 26.411772, 29.893755, 26.9483, 29.84375, 27.46875);
        ((GeneralPath) shape).curveTo(29.789845, 28.029789, 29.734625, 28.585823, 29.65625, 29.125);
        ((GeneralPath) shape).curveTo(29.26438, 31.820883, 28.566957, 34.232437, 27.6875, 36.15625);
        ((GeneralPath) shape).curveTo(26.280369, 39.23435, 24.422274, 41.0, 22.5, 41.0);
        ((GeneralPath) shape).curveTo(20.577726, 40.999996, 18.719631, 39.234352, 17.3125, 36.15625);
        ((GeneralPath) shape).curveTo(15.905367, 33.078148, 14.96875, 28.765963, 14.96875, 24.0);
        ((GeneralPath) shape).curveTo(14.96875, 19.234035, 15.905368, 14.92185, 17.3125, 11.84375);
        ((GeneralPath) shape).curveTo(18.719631, 8.76565, 20.577726, 7.0, 22.5, 7.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(30.68531608581543, 42.26142501831055),
                8.22791f, new Point2D.Double(30.68531608581543, 42.26142501831055), new float[] {
                    0, 1 }, new Color[] {
                    new Color(0xEEEEEC), new Color(0xBABDB6) }, NO_CYCLE, SRGB, new AffineTransform(
                        3.9866297f, 0.1169977f, 0, -2.530036f, -104.62676f, 112.74341f)));
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.36637932f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.9032258f, 0, 0, 0.9962264f, -0.3064529f, -3.8320749f));

        // _0_0_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(33.0, 27.9375);
        ((GeneralPath) shape).curveTo(33.0, 37.084717, 29.530207, 44.5, 25.25, 44.5);
        ((GeneralPath) shape).curveTo(20.969793, 44.5, 17.5, 37.084717, 17.5, 27.9375);
        ((GeneralPath) shape).curveTo(17.5, 18.790283, 20.969793, 11.375, 25.25, 11.375);
        ((GeneralPath) shape).curveTo(29.530207, 11.375, 33.0, 18.790283, 33.0, 27.9375);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(23.238182067871094, 12.15865707397461),
                new Point2D.Double(29.892562866210938, 26.354360580444336), new float[] {
                    0, 1 }, new Color[] {
                    BLACK, new Color(0x0, true) }, NO_CYCLE, SRGB, new AffineTransform()));
        g.setStroke(new BasicStroke(1.0541995f, 1, 0, 4));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_13
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, -16, 5.3125f));

        // _0_0_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.5, 13.5);
        ((GeneralPath) shape).curveTo(21.5, 14.052285, 21.052284, 14.5, 20.5, 14.5);
        ((GeneralPath) shape).curveTo(19.947716, 14.5, 19.5, 14.052285, 19.5, 13.5);
        ((GeneralPath) shape).curveTo(19.5, 12.947715, 19.947716, 12.5, 20.5, 12.5);
        ((GeneralPath) shape).curveTo(21.052284, 12.5, 21.5, 12.947715, 21.5, 13.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_14
        g.setComposite(AlphaComposite.getInstance(3, 0.6551724f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1.0967748f, 0, 0, 1.1169811f, -5.693559f, -7.2056603f));

        // _0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(33.0, 27.9375);
        ((GeneralPath) shape).curveTo(33.0, 37.084717, 29.530207, 44.5, 25.25, 44.5);
        ((GeneralPath) shape).curveTo(20.969793, 44.5, 17.5, 37.084717, 17.5, 27.9375);
        ((GeneralPath) shape).curveTo(17.5, 18.790283, 20.969793, 11.375, 25.25, 11.375);
        ((GeneralPath) shape).curveTo(29.530207, 11.375, 33.0, 18.790283, 33.0, 27.9375);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(17.5, 25.58741569519043), new Point2D.Double(
                28.55514144897461, 25.699325561523438), new float[] {
            0, 1 }, new Color[] {
            WHITE, new Color(0xFFFFFF, true) }, NO_CYCLE, SRGB, new AffineTransform()));
        g.setStroke(new BasicStroke(0.90347946f, 1, 0, 4));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_15
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, -5, -1.875f));

        // _0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.5, 13.5);
        ((GeneralPath) shape).curveTo(21.5, 14.052285, 21.052284, 14.5, 20.5, 14.5);
        ((GeneralPath) shape).curveTo(19.947716, 14.5, 19.5, 14.052285, 19.5, 13.5);
        ((GeneralPath) shape).curveTo(19.5, 12.947715, 19.947716, 12.5, 20.5, 12.5);
        ((GeneralPath) shape).curveTo(21.052284, 12.5, 21.5, 12.947715, 21.5, 13.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_16

        // _0_1
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.5949393f, 0, 0, 1.2242975f, 1.3739932f, -4.22187f));

        // _0_1_0

        // _0_1_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(69.03125, 40.1875);
        ((GeneralPath) shape).curveTo(74.1908, 36.02097, 77.5, 29.64329, 77.5, 22.5);
        ((GeneralPath) shape).curveTo(77.5, 15.734684, 74.54026, 9.663768, 69.84375, 5.5);

        g.setPaint(new RadialGradientPaint(new Point2D.Double(72.49568176269531, 22.84375), 4.82023f,
                new Point2D.Double(72.49568176269531, 22.84375), new float[] {
                    0, 0.6f, 1 }, new Color[] {
                    new Color(0x729FCF), new Color(0x729FCF), new Color(0x729FCF, true) }, NO_CYCLE, SRGB,
                new AffineTransform(2.6999424f, 0, 0, 3.6828427f, -122.46854f, -61.286186f)));
        g.setStroke(new BasicStroke(1.1717104f, 1, 1, 4));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_1_0
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.5164697f, 0, 0, 1.2242975f, 3.5433953f, -4.22187f));

        // _0_1_1

        // _0_1_1_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(67.5625, 34.78125);
        ((GeneralPath) shape).curveTo(71.17637, 31.899733, 73.5, 27.47788, 73.5, 22.5);
        ((GeneralPath) shape).curveTo(73.5, 17.793936, 71.43603, 13.569699, 68.15625, 10.6875);

        g.setPaint(new RadialGradientPaint(new Point2D.Double(70.53125, 22.734375), 3.5975378f,
                new Point2D.Double(70.53125, 22.734375), new float[] {
                    0, 0.6f, 1 }, new Color[] {
                    new Color(0x729FCF), new Color(0x729FCF), new Color(0x729FCF, true) }, NO_CYCLE, SRGB,
                new AffineTransform(1.8087116f, 0, 0, 3.5234272f, -57.039448f, -57.36854f)));
        g.setStroke(new BasicStroke(1.2575756f, 1, 1, 4));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_1_1
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.3535062f, 0, 0, 1.2242975f, 13.43562f, -3.80102f));

        // _0_1_2

        // _0_1_2_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(58.78125, 30.15625);
        ((GeneralPath) shape).curveTo(61.050823, 28.375887, 62.5, 25.606104, 62.5, 22.5);
        ((GeneralPath) shape).curveTo(62.5, 19.560795, 61.188423, 16.939552, 59.125, 15.15625);

        g.setPaint(new RadialGradientPaint(new Point2D.Double(60.640625, 22.65625), 2.6194003f,
                new Point2D.Double(60.640625, 22.65625), new float[] {
                    0, 0.6f, 1 }, new Color[] {
                    new Color(0x729FCF), new Color(0x729FCF), new Color(0x729FCF, true) }, NO_CYCLE, SRGB,
                new AffineTransform(2.1454532f, 0, 0, 3.0191636f, -69.461f, -45.746674f)));
        g.setStroke(new BasicStroke(1.5200506f, 1, 1, 4));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_1_2

    }
}
