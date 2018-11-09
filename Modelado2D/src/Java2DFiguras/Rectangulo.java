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
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Rectangulo extends JFrame{
    public Rectangulo() {
        super("Rectangulo loco");

        setSize(275, 230);
        setVisible(true);
    }
    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        // Creación del Rectangle2D
        g2.setColor(Color.GREEN);
        g2.setStroke(new BasicStroke(3.0f));
        Rectangle2D r = new Rectangle2D.Float(35.0f, 75.0f, 200.0f,
        100.0f);
        g2.draw(r);
        }
    public static void main(String args[]) {
        Rectangulo application = new Rectangulo();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
