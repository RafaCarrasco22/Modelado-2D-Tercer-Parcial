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
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Elipse2D extends JFrame {

    public Elipse2D() {
        super("Elipse 2D");

        setSize(275, 230);
        setVisible(true);
    }

    public static void main(String args[]) {
        Elipse2D application = new Elipse2D();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(3.0f));
        Ellipse2D e = new Ellipse2D.Float(40.0f, 75.0f, 200.0f, 100.0f);
        g2.draw(e);
    }
}
