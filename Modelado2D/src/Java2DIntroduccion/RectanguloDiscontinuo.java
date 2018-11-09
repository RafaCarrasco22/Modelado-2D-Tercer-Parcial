/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2DIntroduccion;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class RectanguloDiscontinuo extends JFrame {

    public RectanguloDiscontinuo() {
        super("Lineas discontinuas");

        this.setSize(500, 500);
        super.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        RectanguloDiscontinuo v = new RectanguloDiscontinuo();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D r2 = new Rectangle2D.Float(200, 150, 100, 25);
        float punteo1[] = {10.0f, 4.0f};
        BasicStroke pincel1 = new BasicStroke(4.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, 3.0f,punteo1
        ,10.0f);
        g2.setStroke(pincel1);
        g2.draw(r2);
        Rectangle2D r3 = new Rectangle2D.Float(200, 300, 100, 25);
        float punteo2[] = {10.0f, 3.0f, 10.0f, 4.0f, 2.0f, 8.0f};
        BasicStroke pincel2 = new BasicStroke(4.0f, BasicStroke.CAP_ROUND , BasicStroke.JOIN_MITER, 3.0f, punteo2, 10.0f);
        g2.setStroke(pincel2);
        g2.draw(r3);
    }
}
