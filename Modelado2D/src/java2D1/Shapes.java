/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2D1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Shapes extends JFrame {

    // set window's title bar String and dimensions
    public Shapes() {
        super("Drawing 2D shapes");

        setSize(500, 200);
        setVisible(true);
    }

    // draw shapes with Java2D API
    public void paint(Graphics g) {
        super.paint(g); // call superclass's paint method

        Graphics2D g2d = (Graphics2D) g; // cast g to Graphics2D
        // draw 2D ellipse filled with a blue-yellow gradient
        g2d.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100,
                Color.YELLOW, true));
        g2d.fill(new Ellipse2D.Double(19, 60, 65, 100));

        // draw 2D rectangle in red
        g2d.setPaint(Color.RED);
        g2d.setStroke(new BasicStroke(10.0f));
        g2d.draw(new Rectangle2D.Double(100, 60, 65, 100));

        // draw 2D rounded rectangle with a buffered background
        BufferedImage buffImage = new BufferedImage(10, 10,
                BufferedImage.TYPE_INT_RGB);

        Graphics2D gg = buffImage.createGraphics();
        gg.setColor(Color.YELLOW); // draw in yellow
        gg.fillRect(0, 0, 10, 10); // draw a filled rectangle
        gg.setColor(Color.BLACK); // draw in black
        gg.drawRect(1, 1, 6, 6); // draw a rectangle
        gg.setColor(Color.BLUE); // draw in blue
        gg.fillRect(1, 1, 3, 3); // draw a filled rectangle
        gg.setColor(Color.RED); // draw in red
        gg.fillRect(4, 4, 3, 3); // draw a filled rectangle
        // paint buffImage onto the JFrame
        g2d.setPaint(new TexturePaint(buffImage,
                new Rectangle(10, 10)));
        g2d.fill(new RoundRectangle2D.Double(190, 60, 75, 100, 50, 50));

        // draw 2D pie-shaped arc in white
        g2d.setPaint(Color.MAGENTA);
        g2d.setStroke(new BasicStroke(6.0f));
        g2d.draw(new Arc2D.Double(285, 60, 75, 100, 0, 270, Arc2D.PIE));

        // draw 2D lines in green and yellow
        g2d.setPaint(Color.PINK);
        g2d.draw(new Line2D.Double(480, 60, 400, 150));

        float dashes[] = {10};

        g2d.setPaint(Color.RED);
        g2d.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND, 10, dashes, 0));
        g2d.draw(new Line2D.Double(400, 60, 480, 150));

    } // end method paint

    public static void main(String args[]) {
        Shapes application = new Shapes();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
