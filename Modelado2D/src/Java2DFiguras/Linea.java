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
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Linea extends JFrame {
    public Linea() {
        super("Linea Crazy");

        setSize(265, 250);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        // Dibujo dela línea
        g2.setColor(Color.ORANGE);
        g2.setStroke(new BasicStroke(3.0f));
        Line2D l = new Line2D.Float(50.0f, 50.0f, 200.0f,
                200.0f);
        g2.draw(l);
    }
    public static void main(String args[]) {
        Linea application = new Linea();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
