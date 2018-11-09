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
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Arc2DPIE extends JFrame {

    public Arc2DPIE() {
        super("Arco Pie 2D");

        setSize(275, 230);
        setVisible(true);
    }

    public static void main(String args[]) {
        Arc2DPIE application = new Arc2DPIE();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
// Dibujo del rectángulo de referencia
        g2.setColor(Color.blue);
        g2.setStroke(new BasicStroke(1.0f));
        Rectangle2D r = new Rectangle2D.Float(100.0f, 75.0f, 50.0f, 100.0f);
        g2.draw(r);
// Dibujo del arco
        g2.setColor(Color.red);
        g2.setStroke(new BasicStroke(3.0f));
        Arc2D a = new Arc2D.Float(100.0f, 75.0f, 50.0f, 100.0f, 0.0f, 135.0f,
                Arc2D.PIE);
        g2.draw(a);
    }
}
