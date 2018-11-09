/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2DIntroduccion;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class RectanguloSimple extends JFrame {

    public RectanguloSimple() {
        super("Rectángulo Simple");
        
        this.setSize(250, 100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        RectanguloSimple v = new RectanguloSimple();
    }

    public void paint(Graphics g) {
        Rectangle2D r2 = new Rectangle2D.Float(75, 50, 100, 25);
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(r2);
    }
}
