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
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class CurvaBezier extends JFrame {

    public CurvaBezier() {
        super("Curva cuadrática de Bézier");

        setSize(290, 280);
        setVisible(true);
    }

    public static void main(String args[]) {
        CurvaBezier application = new CurvaBezier();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.blue);
        g2.setStroke(new BasicStroke(3.0f));
        QuadCurve2D q = new QuadCurve2D.Float(
                40.0f, 70.0f, 40.0f, 170.0f, 190.0f, 220.0f);
        g2.draw(q);
        g2.setColor(Color.red);
        g2.draw(new Rectangle2D.Float(40.0f, 70.0f, 1.0f, 1.0f));
        g2.draw(new Rectangle2D.Float(40.0f, 170.0f, 1.0f, 1.0f));
        g2.draw(new Rectangle2D.Float(190.0f, 220.0f, 1.0f, 1.0f));
    }
}
