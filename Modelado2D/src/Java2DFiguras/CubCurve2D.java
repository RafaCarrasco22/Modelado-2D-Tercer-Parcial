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
import java.awt.Shape;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class CubCurve2D extends JFrame {

    public CubCurve2D() {
        super("Cubic Curve  2D");

        setSize(220, 230);
        setVisible(true);
    }

    public static void main(String args[]) {
        CubCurve2D application = new CubCurve2D();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.blue);
        g2.setStroke(new BasicStroke(3.0f));
        CubicCurve2D c = new CubicCurve2D.Float(40.0f, 60.0f, 60.0f, 120.0f,
                140.0f, 130.0f, 150.0f, 210.0f);
        
        g2.draw((Shape) c);
        g2.setColor(Color.red);
        g2.draw(new Rectangle2D.Float(40.0f, 60.0f, 1.0f, 1.0f));
        g2.draw(new Rectangle2D.Float(60.0f, 120.0f, 1.0f, 1.0f));
        g2.draw(new Rectangle2D.Float(140.0f, 130.0f, 1.0f, 1.0f));
        g2.draw(new Rectangle2D.Float(150.0f, 210.0f, 1.0f, 1.0f));
    }

    
}
