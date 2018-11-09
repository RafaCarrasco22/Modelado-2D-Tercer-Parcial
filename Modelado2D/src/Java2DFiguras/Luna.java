/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2DFiguras;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Luna extends JFrame {

    public Luna() {
        super("Luna");

        setSize(230, 258);
        setVisible(true);
    }

    public static void main(String args[]) {
        Luna application = new Luna();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
// Dibujo del cielo. Este es el fondo.
// Se ha usado un gradiente que va desde el azul al negro
        GradientPaint gp1 = new GradientPaint(10.0f,
                125.0f, Color.blue, 250.0f, 125.0f, Color.RED);
        Rectangle2D r = new Rectangle2D.Double(0.0, 0.0,
                250.0, 250.0);
        g2.setPaint(gp1);
        g2.fill(r);// Dibujo de la luna sobre el fondo
        GradientPaint gp2 = new GradientPaint(50.0f,
                50.0f, Color.WHITE, 300.0f, 50.0f, Color.darkGray);
        g2.setPaint(gp2);
        Ellipse2D e1 = new Ellipse2D.Double(70.0, 100.0,
                80.0, 80.0);
        Ellipse2D e2 = new Ellipse2D.Double(100.0, 100.0,
                80.0, 80.0);
        Area a1 = new Area(e1);
        Area a2 = new Area(e2);
        a1.subtract(a2);
        g2.fill(a1);
    }
}
