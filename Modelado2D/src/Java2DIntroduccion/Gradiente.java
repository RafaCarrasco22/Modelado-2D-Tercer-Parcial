/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2DIntroduccion;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Gradiente extends JFrame {

    public Gradiente() {
        super("Gradiente");

        this.setSize(480, 250);
        super.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Gradiente v = new Gradiente();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        GradientPaint gp1
                = new GradientPaint(50.0f, 25.0f, Color.blue, 50.0f, 225.0f, Color.YELLOW);
        g2.setPaint(gp1);
        Rectangle2D r1 = new Rectangle2D.Float(25, 25, 200, 200);
        g2.fill(r1);
        GradientPaint gp2
                = new GradientPaint(250.0f, 25.0f, Color.PINK, 450.0f, 225.0f, Color.black);
        g2.setPaint(gp2);
        Rectangle2D r2 = new Rectangle2D.Float(250, 25, 200, 200);
        g2.fill(r2);
    }
}
