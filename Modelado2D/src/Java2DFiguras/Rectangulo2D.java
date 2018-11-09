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
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Rectangulo2D extends JFrame {

    public Rectangulo2D() {
        super("Rectangulo 2D");

        setSize(275, 230);
        setVisible(true);
    }

    public static void main(String args[]) {
        Rectangulo2D application = new Rectangulo2D();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
// Dibujo delrectángulo redondeado
        g2.setColor(Color.DARK_GRAY);
        g2.setStroke(new BasicStroke(5.0f));
        RoundRectangle2D q = new RoundRectangle2D.Float(
                80.0f, 50.0f, 100.0f, 150.0f, 25.0f, 25.0f);
        g2.draw(q);
    }
}
