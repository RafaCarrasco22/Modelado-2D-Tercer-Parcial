/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2DFiguras;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Punto2D extends JFrame {

    public Punto2D() {
        super("Point 2D");

        setSize(220, 230);
        setVisible(true);
    }

    public static void main(String args[]) {
        Punto2D application = new Punto2D();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3.0f));
        Point2D p1 = new Point2D.Float(23.5f, 48.9f);
        Point2D p2 = new Point2D.Float(180.0f, 200.0f);
        Line2D l = new Line2D.Float(p1, p2);
        g2.setColor(Color.ORANGE);
        g2.draw(l);
    }
}
