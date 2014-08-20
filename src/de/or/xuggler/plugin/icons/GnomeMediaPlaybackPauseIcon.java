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
public class GnomeMediaPlaybackPauseIcon extends FlamingoSvgJavaIcon {

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
        shape0.moveTo(-2.9939585, -7.3132057);
        shape0.curveTo(-4.0106435, -7.3132057, -4.9314585, -6.3923907, -4.9314585, -5.3757057);
        shape0.lineTo(-4.9314585, 16.686794);
        shape0.curveTo(-4.9314585, 17.703484, -4.0106583, 18.624302, -2.9939585, 18.624294);
        shape0.lineTo(4.0685415, 18.624294);
        shape0.curveTo(5.0852237, 18.624294, 6.0060453, 17.703484, 6.0060415, 16.686794);
        shape0.lineTo(6.0060415, -5.3757057);
        shape0.curveTo(6.0060415, -6.3923907, 5.0852265, -7.3132057, 4.0685415, -7.3132057);
        shape0.lineTo(-2.9939585, -7.3132057);
        shape0.closePath();
        shape0.moveTo(12.0060425, -7.3132057);
        shape0.curveTo(10.989357, -7.3132057, 10.0685425, -6.3923907, 10.0685425, -5.3757057);
        shape0.lineTo(10.0685425, 16.686794);
        shape0.curveTo(10.0685425, 17.703484, 10.989343, 18.624302, 12.0060425, 18.624294);
        shape0.lineTo(19.068542, 18.624294);
        shape0.curveTo(20.085224, 18.624294, 21.006042, 17.703478, 21.006042, 16.686794);
        shape0.lineTo(21.006042, -5.3757057);
        shape0.curveTo(21.006042, -6.3923907, 20.085228, -7.3132057, 19.068542, -7.3132057);
        shape0.lineTo(12.0060425, -7.3132057);
        shape0.closePath();
        g.setPaint(new LinearGradientPaint(new Point2D.Double(-27.66901206970215, 13.129915237426758),
                new Point2D.Double(-24.33098793029785, 25.587594985961914), new float[] {
                    0.0f, 1.0f }, new Color[] {
                    new Color(0, 0, 0, 80), new Color(255, 255, 255, 255) },
                MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB,
                new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 34.03729248046875f, -18.34445571899414f)));
        g.fill(shape0);
    }

    private void paintShapeNode_0_0_0_0_1(Graphics2D g)
    {
        GeneralPath shape1 = new GeneralPath();
        shape1.moveTo(-2.587303, -5.428793);
        shape1.lineTo(4.202141, -5.428793);
        shape1.curveTo(4.4568377, -5.428793, 4.661883, -5.2237477, 4.661883, -4.969051);
        shape1.lineTo(4.661883, 16.28014);
        shape1.curveTo(4.661883, 16.534838, 4.4568377, 16.739883, 4.202141, 16.739883);
        shape1.lineTo(-2.5873027, 16.739883);
        shape1.curveTo(-2.842, 16.739883, -3.0470452, 16.534838, -3.0470452, 16.28014);
        shape1.lineTo(-3.0470452, -4.9690514);
        shape1.curveTo(-3.0470452, -5.223748, -2.842, -5.4287934, -2.5873027, -5.4287934);
        shape1.closePath();
        g.setPaint(new RadialGradientPaint(new Point2D.Double(28.541149139404297, 31.67877197265625),
                12.000001f, new Point2D.Double(28.541149139404297, 31.67877197265625), new float[] {
                    0.0f, 1.0f }, new Color[] {
                    new Color(238, 238, 236, 255), new Color(146, 148, 143, 255) },
                MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB,
                new AffineTransform(5.204353332519531f, 0.0f, 0.0f, 2.2201759815216064f,
                        -136.68301391601562f, -57.81620788574219f)));
        g.fill(shape1);
        g.setPaint(new Color(85, 87, 83, 255));
        g.setStroke(new BasicStroke(0.96385545f, 1, 1, 4.0f, null, 0.0f));
        g.draw(shape1);
    }

    private void paintShapeNode_0_0_0_0_2(Graphics2D g)
    {
        GeneralPath shape2 = new GeneralPath();
        shape2.moveTo(11.870528, -5.428793);
        shape2.lineTo(18.659971, -5.428793);
        shape2.curveTo(18.914669, -5.428793, 19.119715, -5.2237477, 19.119715, -4.969051);
        shape2.lineTo(19.119715, 16.28014);
        shape2.curveTo(19.119715, 16.534838, 18.914669, 16.739883, 18.659971, 16.739883);
        shape2.lineTo(11.870528, 16.739883);
        shape2.curveTo(11.61583, 16.739883, 11.410786, 16.534838, 11.410786, 16.28014);
        shape2.lineTo(11.410786, -4.9690514);
        shape2.curveTo(11.410786, -5.223748, 11.61583, -5.4287934, 11.870528, -5.4287934);
        shape2.closePath();
        g.setPaint(new RadialGradientPaint(new Point2D.Double(28.541149139404297, 31.67877197265625),
                12.000001f, new Point2D.Double(28.541149139404297, 31.67877197265625), new float[] {
                    0.0f, 1.0f }, new Color[] {
                    new Color(238, 238, 236, 255), new Color(146, 148, 143, 255) },
                MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB,
                new AffineTransform(5.204353332519531f, 0.0f, 0.0f, 2.2201759815216064f,
                        -136.68301391601562f, -57.81620788574219f)));
        g.fill(shape2);
        g.setPaint(new Color(85, 87, 83, 255));
        g.draw(shape2);
    }

    private void paintShapeNode_0_0_0_0_3(Graphics2D g)
    {
        GeneralPath shape3 = new GeneralPath();
        shape3.moveTo(-2.0831904, -4.464936);
        shape3.lineTo(3.6999135, -4.464936);
        shape3.lineTo(3.6999135, 15.776026);
        shape3.lineTo(-2.0831904, 15.776026);
        shape3.closePath();
        g.setPaint(new Color(255, 255, 255, 255));
        g.setStroke(new BasicStroke(0.9638553f, 1, 0, 4.0f, null, 0.0f));
        g.draw(shape3);
    }

    private void paintShapeNode_0_0_0_0_4(Graphics2D g)
    {
        GeneralPath shape4 = new GeneralPath();
        shape4.moveTo(12.374641, -4.464936);
        shape4.lineTo(18.157745, -4.464936);
        shape4.lineTo(18.157745, 15.776026);
        shape4.lineTo(12.374641, 15.776026);
        shape4.closePath();
        g.draw(shape4);
    }

    private void paintShapeNode_0_0_0_0_5(Graphics2D g)
    {
        GeneralPath shape5 = new GeneralPath();
        shape5.moveTo(-2.9627085, 16.655544);
        shape5.lineTo(-2.9627085, -5.3444557);
        shape5.lineTo(4.0372915, -5.3444557);
        shape5.lineTo(4.0372915, 16.655544);
        shape5.lineTo(-2.9627085, 16.655544);
        shape5.closePath();
        shape5.moveTo(12.0372925, 16.655544);
        shape5.lineTo(12.0372925, -5.3444557);
        shape5.lineTo(19.037292, -5.3444557);
        shape5.lineTo(19.037292, 16.655544);
        shape5.lineTo(12.0372925, 16.655544);
        shape5.closePath();
        g.setPaint(new LinearGradientPaint(
                new Point2D.Double(-0.13080163300037384, 10.068081855773926),
                new Point2D.Double(48.13079833984375, 37.93193054199219),
                new float[] {
                    0.0f, 0.20971029f, 0.34936365f, 0.42850056f, 0.5213405f, 0.55746967f, 0.7100152f,
                    0.7439496f, 1.0f },
                new Color[] {
                    new Color(255, 255, 255, 255), new Color(255, 255, 255, 0),
                    new Color(255, 255, 255, 207), new Color(255, 255, 255, 0),
                    new Color(255, 255, 255, 255), new Color(255, 255, 255, 0),
                    new Color(255, 255, 255, 145), new Color(255, 255, 255, 0), new Color(255, 255, 255, 0) },
                MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB,
                new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -15.962708473205566f, 29.65554428100586f)));
        g.fill(shape5);
    }

    private void paintCompositeGraphicsNode_0_0_0_0(Graphics2D g)
    {
        // _0_0_0_0_0
        g.setComposite(AlphaComposite.getInstance(3, 0.4f * origAlpha));
        AffineTransform trans_0_0_0_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        paintShapeNode_0_0_0_0_0(g);
        g.setTransform(trans_0_0_0_0_0);
        // _0_0_0_0_1
        g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
        AffineTransform trans_0_0_0_0_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        paintShapeNode_0_0_0_0_1(g);
        g.setTransform(trans_0_0_0_0_1);
        // _0_0_0_0_2
        AffineTransform trans_0_0_0_0_2 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        paintShapeNode_0_0_0_0_2(g);
        g.setTransform(trans_0_0_0_0_2);
        // _0_0_0_0_3
        AffineTransform trans_0_0_0_0_3 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        paintShapeNode_0_0_0_0_3(g);
        g.setTransform(trans_0_0_0_0_3);
        // _0_0_0_0_4
        AffineTransform trans_0_0_0_0_4 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        paintShapeNode_0_0_0_0_4(g);
        g.setTransform(trans_0_0_0_0_4);
        // _0_0_0_0_5
        g.setComposite(AlphaComposite.getInstance(3, 0.15f * origAlpha));
        AffineTransform trans_0_0_0_0_5 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        paintShapeNode_0_0_0_0_5(g);
        g.setTransform(trans_0_0_0_0_5);
    }

    private void paintCompositeGraphicsNode_0_0_0(Graphics2D g)
    {
        // _0_0_0_0
        AffineTransform trans_0_0_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 7.962708473205566f, 10.34445571899414f));
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
        return 4;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public int getOrigY()
    {
        return 4;
    }

    /**
     * Returns the width of the bounding box of the original SVG image.
     * 
     * @return The width of the bounding box of the original SVG image.
     */
    @Override
    public int getOrigWidth()
    {
        return 26;
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
    public GnomeMediaPlaybackPauseIcon()
    {
        width = getOrigWidth();
        height = getOrigHeight();
    }

    public GnomeMediaPlaybackPauseIcon(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

}
