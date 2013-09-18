package de.or.xuggler.plugin.icons;

import de.or.utils.icons.FlamingoSvgJavaIcon;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.MultipleGradientPaint;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

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
    public void paint(Graphics2D g)
    {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite)
        {
            AlphaComposite origAlphaComposite = (AlphaComposite) origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER)
            {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }

        // _0
        AffineTransform trans_0 = g.getTransform();
        paintRootGraphicsNode_0(g);
        g.setTransform(trans_0);

    }

    private void paintShapeNode_0_0_0_0_0(Graphics2D g)
    {
        GeneralPath shape0 = new GeneralPath();
        shape0.moveTo(-37.03125, 11.03125);
        shape0.curveTo(-38.047935, 11.03125, -38.96875, 11.9520645, -38.96875, 12.96875);
        shape0.lineTo(-38.96875, 35.03125);
        shape0.curveTo(-38.96875, 36.04794, -38.04795, 36.968758, -37.03125, 36.96875);
        shape0.lineTo(-29.96875, 36.96875);
        shape0.curveTo(-28.952068, 36.96875, -28.031246, 36.04794, -28.03125, 35.03125);
        shape0.lineTo(-28.03125, 12.96875);
        shape0.curveTo(-28.03125, 11.9520645, -28.952065, 11.03125, -29.96875, 11.03125);
        shape0.lineTo(-37.03125, 11.03125);
        shape0.closePath();
        shape0.moveTo(-22.03125, 11.03125);
        shape0.curveTo(-23.047935, 11.03125, -23.96875, 11.9520645, -23.96875, 12.96875);
        shape0.lineTo(-23.96875, 35.03125);
        shape0.curveTo(-23.96875, 36.04794, -23.04795, 36.968758, -22.03125, 36.96875);
        shape0.lineTo(-14.96875, 36.96875);
        shape0.curveTo(-13.952068, 36.96875, -13.03125, 36.047935, -13.03125, 35.03125);
        shape0.lineTo(-13.03125, 12.96875);
        shape0.curveTo(-13.03125, 11.9520645, -13.9520645, 11.03125, -14.96875, 11.03125);
        shape0.lineTo(-22.03125, 11.03125);
        shape0.closePath();
        g.setPaint(new LinearGradientPaint(new Point2D.Double(-27.66901206970215, 13.129915237426758),
                new Point2D.Double(-24.33098793029785, 25.587594985961914), new float[] {
                    0.0f, 1.0f }, new Color[] {
                    new Color(0, 0, 0, 80), new Color(255, 255, 255, 255) },
                MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB,
                new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f)));
        g.fill(shape0);
    }

    private void paintShapeNode_0_0_0_0_1(Graphics2D g)
    {
        RoundRectangle2D.Double shape1 = new RoundRectangle2D.Double(4.91566276550293, 20.91566276550293,
                7.70892858505249, 22.168676376342773, 0.919485330581665, 0.919485330581665);
        g.setPaint(new RadialGradientPaint(new Point2D.Double(28.541149139404297, 31.67877197265625),
                12.000001f, new Point2D.Double(28.541149139404297, 31.67877197265625), new float[] {
                    0.0f, 1.0f }, new Color[] {
                    new Color(238, 238, 236, 255), new Color(146, 148, 143, 255) },
                MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB,
                new AffineTransform(5.204353332519531f, 0.0f, 0.0f, 2.2201759815216064f,
                        -128.72030639648438f, -31.471752166748047f)));
        g.fill(shape1);
        g.setPaint(new Color(85, 87, 83, 255));
        g.setStroke(new BasicStroke(0.96385545f, 1, 1, 4.0f, null, 0.0f));
        g.draw(shape1);
    }

    private void paintShapeNode_0_0_0_0_2(Graphics2D g)
    {
        RoundRectangle2D.Double shape2 = new RoundRectangle2D.Double(19.373493194580078, 20.91566276550293,
                7.70892858505249, 22.168676376342773, 0.919485330581665, 0.919485330581665);
        g.setPaint(new RadialGradientPaint(new Point2D.Double(28.541149139404297, 31.67877197265625),
                12.000001f, new Point2D.Double(28.541149139404297, 31.67877197265625), new float[] {
                    0.0f, 1.0f }, new Color[] {
                    new Color(238, 238, 236, 255), new Color(146, 148, 143, 255) },
                MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB,
                new AffineTransform(5.204353332519531f, 0.0f, 0.0f, 2.2201759815216064f,
                        -128.72030639648438f, -31.471752166748047f)));
        g.fill(shape2);
        g.setPaint(new Color(85, 87, 83, 255));
        g.draw(shape2);
    }

    private void paintShapeNode_0_0_0_0_3(Graphics2D g)
    {
        Rectangle2D.Double shape3 = new Rectangle2D.Double(5.879518032073975, 21.879520416259766,
                5.783103942871094, 20.2409610748291);
        g.setPaint(new Color(255, 255, 255, 255));
        g.setStroke(new BasicStroke(0.9638553f, 1, 0, 4.0f, null, 0.0f));
        g.draw(shape3);
    }

    private void paintShapeNode_0_0_0_0_4(Graphics2D g)
    {
        Rectangle2D.Double shape4 = new Rectangle2D.Double(20.33734893798828, 21.879520416259766,
                5.783103942871094, 20.2409610748291);
        g.draw(shape4);
    }

    private void paintShapeNode_0_0_0_0_5(Graphics2D g)
    {
        GeneralPath shape5 = new GeneralPath();
        shape5.moveTo(13.0, 13.0);
        shape5.lineTo(13.0, 35.0);
        shape5.lineTo(20.0, 35.0);
        shape5.lineTo(20.0, 13.0);
        shape5.lineTo(13.0, 13.0);
        shape5.closePath();
        shape5.moveTo(28.0, 13.0);
        shape5.lineTo(28.0, 35.0);
        shape5.lineTo(35.0, 35.0);
        shape5.lineTo(35.0, 13.0);
        shape5.lineTo(28.0, 13.0);
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
                new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f)));
        g.fill(shape5);
    }

    private void paintCompositeGraphicsNode_0_0_0_0(Graphics2D g)
    {
        // _0_0_0_0_0
        g.setComposite(AlphaComposite.getInstance(3, 0.4f * origAlpha));
        AffineTransform trans_0_0_0_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 42.0f, 8.0f));
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
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -8.0f, 56.0f));
        paintShapeNode_0_0_0_0_5(g);
        g.setTransform(trans_0_0_0_0_5);
    }

    private void paintCompositeGraphicsNode_0_0_0(Graphics2D g)
    {
        // _0_0_0_0
        AffineTransform trans_0_0_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
    public int getOrigWidth()
    {
        return 26;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public int getOrigHeight()
    {
        return 26;
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public GnomeMediaPlaybackPauseIcon()
    {
        this.width = getOrigWidth();
        this.height = getOrigHeight();
    }

    public GnomeMediaPlaybackPauseIcon(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.Icon#getIconHeight()
     */
    @Override
    public int getIconHeight()
    {
        return height;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.Icon#getIconWidth()
     */
    @Override
    public int getIconWidth()
    {
        return width;
    }

    /*
     * Set the dimension of the icon.
     */

    public void setDimension(Dimension newDimension)
    {
        this.width = newDimension.width;
        this.height = newDimension.height;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
     */
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y)
    {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.translate(x, y);

        double coef1 = (double) this.width / (double) getOrigWidth();
        double coef2 = (double) this.height / (double) getOrigHeight();
        double coef = Math.min(coef1, coef2);
        g2d.scale(coef, coef);
        paint(g2d);
        g2d.dispose();
    }
}
