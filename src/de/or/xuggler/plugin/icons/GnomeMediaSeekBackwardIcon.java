package de.or.xuggler.plugin.icons;

import de.or.utils.icons.FlamingoSvgJavaIcon;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.MultipleGradientPaint;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

/**
 * This class has been automatically generated using svg2java
 * 
 */
public class GnomeMediaSeekBackwardIcon extends FlamingoSvgJavaIcon {

    private float origAlpha = 1.0f;

    /**
     * Paints the transcoded SVG image on the specified graphics context. You can install a custom
     * transformation on the graphics context to scale the image.
     * 
     * @param g
     *            Graphics context.
     */
    @Override
    public void paint(Graphics2D g)
    {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite)
        {
            AlphaComposite origAlphaComposite = (AlphaComposite) origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER)
                origAlpha = origAlphaComposite.getAlpha();
        }

        // _0
        AffineTransform trans_0 = g.getTransform();
        paintRootGraphicsNode_0(g);
        g.setTransform(trans_0);

    }

    private void paintShapeNode_0_0_0_0_0(Graphics2D g)
    {
        GeneralPath shape0 = new GeneralPath();
        shape0.moveTo(-143.75, 11.53125);
        shape0.curveTo(-144.47127, 11.646642, -145.0014, 12.2695675, -145.0, 13.0);
        shape0.lineTo(-145.0, 35.0);
        shape0.curveTo(-145.00337, 35.53685, -144.71663, 36.033688, -144.2501, 36.299347);
        shape0.curveTo(-143.78358, 36.565006, -143.20998, 36.558086, -142.75, 36.28125);
        shape0.lineTo(-127.0, 26.9375);
        shape0.lineTo(-127.0, 35.0);
        shape0.curveTo(-127.00337, 35.53685, -126.71663, 36.033688, -126.25011, 36.299347);
        shape0.curveTo(-125.783585, 36.565006, -125.20998, 36.558086, -124.75, 36.28125);
        shape0.lineTo(-106.25, 25.28125);
        shape0.curveTo(-105.794945, 25.014944, -105.51528, 24.527252, -105.51528, 24.0);
        shape0.curveTo(-105.51528, 23.472748, -105.794945, 22.985056, -106.25, 22.71875);
        shape0.lineTo(-124.75, 11.71875);
        shape0.curveTo(-125.20998, 11.441915, -125.783585, 11.434995, -126.25011, 11.700653);
        shape0.curveTo(-126.71663, 11.966312, -127.00337, 12.463152, -127.0, 13.0);
        shape0.lineTo(-127.0, 21.0625);
        shape0.lineTo(-142.75, 11.71875);
        shape0.curveTo(-143.05084, 11.540409, -143.40498, 11.474007, -143.75, 11.53125);
        shape0.closePath();
        g.setPaint(new LinearGradientPaint(new Point2D.Double(-127.01692199707031, 12.838128089904785),
                new Point2D.Double(-123.49838256835938, 25.969480514526367), new float[] {
                    0.0f, 1.0f }, new Color[] {
                    new Color(0, 0, 0, 80), new Color(255, 255, 255, 255) },
                MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB,
                new AffineTransform(-1.0f, 0.0f, 0.0f, 1.0f, -250.5153045654297f, 0.0f)));
        g.fill(shape0);
    }

    private void paintShapeNode_0_0_0_0_1_0(Graphics2D g)
    {
        GeneralPath shape1 = new GeneralPath();
        shape1.moveTo(21.5, 35.0);
        shape1.lineTo(21.5, 13.000461);
        shape1.lineTo(39.995766, 24.010195);
        shape1.lineTo(21.5, 35.0);
        shape1.closePath();
        g.setPaint(new RadialGradientPaint(new Point2D.Double(38.40032958984375, 17.83346176147461),
                13.55237f, new Point2D.Double(38.40032958984375, 17.83346176147461), new float[] {
                    0.0f, 1.0f }, new Color[] {
                    new Color(238, 238, 236, 255), new Color(146, 148, 143, 255) },
                MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB,
                new AffineTransform(-1.914332628250122f, 0.0f, 0.0f, 1.5917713642120361f,
                        100.35131072998047f, 0.016193440183997154f)));
        g.fill(shape1);
        g.setPaint(new Color(85, 87, 83, 255));
        g.setStroke(new BasicStroke(0.99999994f, 2, 0, 4.0f, null, 0.0f));
        g.draw(shape1);
    }

    private void paintShapeNode_0_0_0_0_1_1(Graphics2D g)
    {
        GeneralPath shape2 = new GeneralPath();
        shape2.moveTo(22.5, 14.78125);
        shape2.lineTo(22.5, 33.21875);
        shape2.lineTo(38.03125, 24.0);
        shape2.lineTo(22.5, 14.78125);
        shape2.closePath();
        g.setPaint(new Color(255, 255, 255, 255));
        g.draw(shape2);
    }

    private void paintCompositeGraphicsNode_0_0_0_0_1(Graphics2D g)
    {
        // _0_0_0_0_1_0
        AffineTransform trans_0_0_0_0_1_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        paintShapeNode_0_0_0_0_1_0(g);
        g.setTransform(trans_0_0_0_0_1_0);
        // _0_0_0_0_1_1
        AffineTransform trans_0_0_0_0_1_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        paintShapeNode_0_0_0_0_1_1(g);
        g.setTransform(trans_0_0_0_0_1_1);
    }

    private void paintShapeNode_0_0_0_0_2_0(Graphics2D g)
    {
        GeneralPath shape3 = new GeneralPath();
        shape3.moveTo(21.5, 35.0);
        shape3.lineTo(21.5, 13.000461);
        shape3.lineTo(39.995766, 24.010195);
        shape3.lineTo(21.5, 35.0);
        shape3.closePath();
        g.setPaint(new RadialGradientPaint(new Point2D.Double(38.40032958984375, 17.83346176147461),
                13.55237f, new Point2D.Double(38.40032958984375, 17.83346176147461), new float[] {
                    0.0f, 1.0f }, new Color[] {
                    new Color(238, 238, 236, 255), new Color(146, 148, 143, 255) },
                MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB,
                new AffineTransform(-1.914332628250122f, 0.0f, 0.0f, 1.5917713642120361f,
                        100.35131072998047f, 0.016193440183997154f)));
        g.fill(shape3);
        g.setPaint(new Color(85, 87, 83, 255));
        g.draw(shape3);
    }

    private void paintShapeNode_0_0_0_0_2_1(Graphics2D g)
    {
        GeneralPath shape4 = new GeneralPath();
        shape4.moveTo(22.5, 14.78125);
        shape4.lineTo(22.5, 33.21875);
        shape4.lineTo(38.03125, 24.0);
        shape4.lineTo(22.5, 14.78125);
        shape4.closePath();
        g.setPaint(new Color(255, 255, 255, 255));
        g.draw(shape4);
    }

    private void paintCompositeGraphicsNode_0_0_0_0_2(Graphics2D g)
    {
        // _0_0_0_0_2_0
        AffineTransform trans_0_0_0_0_2_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        paintShapeNode_0_0_0_0_2_0(g);
        g.setTransform(trans_0_0_0_0_2_0);
        // _0_0_0_0_2_1
        AffineTransform trans_0_0_0_0_2_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        paintShapeNode_0_0_0_0_2_1(g);
        g.setTransform(trans_0_0_0_0_2_1);
    }

    private void paintShapeNode_0_0_0_0_3(Graphics2D g)
    {
        GeneralPath shape5 = new GeneralPath();
        shape5.moveTo(24.0, 34.125);
        shape5.lineTo(6.96875, 24.0);
        shape5.lineTo(24.0, 13.875);
        shape5.lineTo(24.0, 23.6875);
        shape5.curveTo(24.004, 23.80308, 24.0481, 23.913654, 24.125, 24.0);
        shape5.curveTo(24.0481, 24.08635, 24.00384, 24.19692, 24.0, 24.3125);
        shape5.lineTo(24.0, 34.125);
        shape5.closePath();
        shape5.moveTo(42.0, 34.125);
        shape5.lineTo(24.96875, 24.0);
        shape5.lineTo(42.0, 13.875);
        shape5.lineTo(42.0, 34.125);
        shape5.closePath();
        g.setPaint(new LinearGradientPaint(
                new Point2D.Double(52.33195114135742, 10.440893173217773),
                new Point2D.Double(100.16806030273438, 38.059085845947266),
                new float[] {
                    0.0f, 0.20971029f, 0.34936365f, 0.42850056f, 0.5213405f, 0.55746967f, 0.7100152f,
                    0.7439496f, 1.0f },
                new Color[] {
                    new Color(255, 255, 255, 255), new Color(255, 255, 255, 0),
                    new Color(255, 255, 255, 207), new Color(255, 255, 255, 0),
                    new Color(255, 255, 255, 255), new Color(255, 255, 255, 0),
                    new Color(255, 255, 255, 145), new Color(255, 255, 255, 0), new Color(255, 255, 255, 0) },
                MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB,
                new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -52.0f, 48.0f)));
        g.fill(shape5);
    }

    private void paintCompositeGraphicsNode_0_0_0_0(Graphics2D g)
    {
        // _0_0_0_0_0
        g.setComposite(AlphaComposite.getInstance(3, 0.4f * origAlpha));
        AffineTransform trans_0_0_0_0_0 = g.getTransform();
        g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, 1.0f, -101.01531219482422f, 0.0f));
        paintShapeNode_0_0_0_0_0(g);
        g.setTransform(trans_0_0_0_0_0);
        // _0_0_0_0_1
        g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
        AffineTransform trans_0_0_0_0_1 = g.getTransform();
        g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, 1.0f, 64.0f, 0.0f));
        paintCompositeGraphicsNode_0_0_0_0_1(g);
        g.setTransform(trans_0_0_0_0_1);
        // _0_0_0_0_2
        AffineTransform trans_0_0_0_0_2 = g.getTransform();
        g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, 1.0f, 46.0f, 0.0f));
        paintCompositeGraphicsNode_0_0_0_0_2(g);
        g.setTransform(trans_0_0_0_0_2);
        // _0_0_0_0_3
        g.setComposite(AlphaComposite.getInstance(3, 0.15f * origAlpha));
        AffineTransform trans_0_0_0_0_3 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        paintShapeNode_0_0_0_0_3(g);
        g.setTransform(trans_0_0_0_0_3);
    }

    private void paintCompositeGraphicsNode_0_0_0(Graphics2D g)
    {
        // _0_0_0_0
        AffineTransform trans_0_0_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.2423456311225891f, 0.0f));
        paintCompositeGraphicsNode_0_0_0_0(g);
        g.setTransform(trans_0_0_0_0);
    }

    private void paintCanvasGraphicsNode_0_0(Graphics2D g)
    {
        // _0_0_0
        AffineTransform trans_0_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        paintCompositeGraphicsNode_0_0_0(g);
        g.setTransform(trans_0_0_0);
    }

    private void paintRootGraphicsNode_0(Graphics2D g)
    {
        // _0_0
        g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
        AffineTransform trans_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        paintCanvasGraphicsNode_0_0(g);
        g.setTransform(trans_0_0);
    }

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public int getOrigX()
    {
        return 5;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public int getOrigY()
    {
        return 12;
    }

    /**
     * Returns the width of the bounding box of the original SVG image.
     * 
     * @return The width of the bounding box of the original SVG image.
     */
    @Override
    public int getOrigWidth()
    {
        return 40;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    @Override
    public int getOrigHeight()
    {
        return 26;
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public GnomeMediaSeekBackwardIcon()
    {
        width = getOrigWidth();
        height = getOrigHeight();
    }

    public GnomeMediaSeekBackwardIcon(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

}
