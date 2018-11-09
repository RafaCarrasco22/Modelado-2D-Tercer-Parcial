/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2DIntroduccion;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class RectanguloStroke extends JFrame {

    public RectanguloStroke() {
        super("Rectángulo Stroke");

        this.setSize(250, 100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        RectanguloStroke v = new RectanguloStroke();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D r2 = new Rectangle2D.Float(75, 50, 100, 25);
        Stroke pincel = new BasicStroke(4.0f, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_MITER);
        g2.setStroke(pincel);
        g2.setColor(Color.BLUE);
        g2.draw(r2);
    }
}
