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
public class GnomeMediaPlaybackStartIcon extends FlamingoSvgJavaIcon {

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
        shape0.moveTo(-186.59375, 9.0);
        shape0.curveTo(-187.38474, 9.0508995, -188.00018, 9.707384, -188.0, 10.5);
        shape0.lineTo(-188.0, 37.5);
        shape0.curveTo(-187.99205, 38.031998, -187.70338, 38.520138, -187.24103, 38.78342);
        shape0.curveTo(-186.77869, 39.046703, -186.21158, 39.045876, -185.75, 38.78125);
        shape0.lineTo(-162.75, 25.28125);
        shape0.curveTo(-162.30424, 25.008049, -162.03253, 24.522812, -162.03253, 24.0);
        shape0.curveTo(-162.03253, 23.477188, -162.30424, 22.991951, -162.75, 22.71875);
        shape0.lineTo(-185.75, 9.21875);
        shape0.curveTo(-186.00346, 9.064076, -186.29706, 8.987957, -186.59375, 9.0);
        shape0.closePath();
        g.setPaint(new LinearGradientPaint(new Point2D.Double(-177.2776641845703, 9.203917503356934),
                new Point2D.Double(-172.8285675048828, 25.80816078186035), new float[] {
                    0.0f, 1.0f }, new Color[] {
                    new Color(0, 0, 0, 80), new Color(255, 255, 255, 255) },
                MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB,
                new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f)));
        g.fill(shape0);
    }

    private void paintShapeNode_0_0_0_0_1(Graphics2D g)
    {
        GeneralPath shape1 = new GeneralPath();
        shape1.moveTo(13.5, 37.5);
        shape1.lineTo(13.5, 10.500456);
        shape1.lineTo(36.5, 24.012459);
        shape1.lineTo(13.5, 37.5);
        shape1.closePath();
        g.setPaint(new RadialGradientPaint(new Point2D.Double(36.126338958740234, 18.02047348022461),
                13.55237f, new Point2D.Double(36.126338958740234, 18.02047348022461), new float[] {
                    0.0f, 1.0f }, new Color[] {
                    new Color(238, 238, 236, 255), new Color(146, 148, 143, 255) },
                MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB,
                new AffineTransform(2.739166498184204f, 0.0f, 0.0f, 2.2478597164154053f, -74.85735321044922f,
                        -10.683483123779297f)));
        g.fill(shape1);
        g.setPaint(new Color(85, 87, 83, 255));
        g.setStroke(new BasicStroke(0.9999998f, 2, 0, 4.0f, null, 0.0f));
        g.draw(shape1);
    }

    private void paintShapeNode_0_0_0_0_2(Graphics2D g)
    {
        GeneralPath shape2 = new GeneralPath();
        shape2.moveTo(14.5, 35.750027);
        shape2.lineTo(14.5, 12.250427);
        shape2.lineTo(34.5, 24.010872);
        shape2.lineTo(14.5, 35.750027);
        shape2.closePath();
        g.setPaint(new Color(255, 255, 255, 255));
        g.draw(shape2);
    }

    private void paintShapeNode_0_0_0_0_3(Graphics2D g)
    {
        GeneralPath shape3 = new GeneralPath();
        shape3.moveTo(14.0, 11.375);
        shape3.lineTo(14.0, 36.625);
        shape3.curveTo(21.167154, 32.42134, 28.332237, 28.204016, 35.5, 24.0);
        shape3.curveTo(28.332834, 19.790152, 21.16775, 15.585191, 14.0, 11.375);
        shape3.closePath();
        g.setPaint(new LinearGradientPaint(
                new Point2D.Double(-0.11694507300853729, 10.146530151367188),
                new Point2D.Double(48.025962829589844, 37.94185256958008),
                new float[] {
                    0.0f, 0.20971029f, 0.34936365f, 0.42850056f, 0.5213405f, 0.55746967f, 0.7100152f,
                    0.7439496f, 1.0f },
                new Color[] {
                    new Color(255, 255, 255, 255), new Color(255, 255, 255, 0),
                    new Color(255, 255, 255, 207), new Color(255, 255, 255, 0),
                    new Color(255, 255, 255, 255), new Color(255, 255, 255, 0),
                    new Color(255, 255, 255, 145), new Color(255, 255, 255, 0), new Color(255, 255, 255, 0) },
                MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB,
                new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f)));
        g.fill(shape3);
    }

    private void paintCompositeGraphicsNode_0_0_0_0(Graphics2D g)
    {
        // _0_0_0_0_0
        g.setComposite(AlphaComposite.getInstance(3, 0.4f * origAlpha));
        AffineTransform trans_0_0_0_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 200.0f, 0.0f));
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
        g.setComposite(AlphaComposite.getInstance(3, 0.15f * origAlpha));
        AffineTransform trans_0_0_0_0_3 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 48.0f));
        paintShapeNode_0_0_0_0_3(g);
        g.setTransform(trans_0_0_0_0_3);
    }

    private void paintCompositeGraphicsNode_0_0_0(Graphics2D g)
    {
        // _0_0_0_0
        AffineTransform trans_0_0_0_0 = g.getTransform();
        g.transform(new AffineTransform(0.8338465094566345f, 0.0f, 0.0f, 0.8338465094566345f,
                -4.8326005935668945f, 11.996413230895996f));
        paintCompositeGraphicsNode_0_0_0_0(g);
        g.setTransform(trans_0_0_0_0);
    }

    private void paintCanvasGraphicsNode_0_0(Graphics2D g)
    {
        // _0_0_0
        AffineTransform trans_0_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -16.0f));
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
        return 6;
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
        return 22;
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
    public GnomeMediaPlaybackStartIcon()
    {
        width = getOrigWidth();
        height = getOrigHeight();
    }

    public GnomeMediaPlaybackStartIcon(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

}
