/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2DIntroduccion;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Transformacion extends JFrame {

    public Transformacion() {
        super("Transformación");

        this.setSize(450, 400);
        super.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Transformacion v = new Transformacion();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        AffineTransform aT = g2.getTransform();
        aT.translate(100, 170);
        g2.transform(aT);
        aT.shear(20.0, -3.0);
for (int i = 0; i < 2; i++) {
            g2.drawString("El profe es chido", 0.0f, 0.0f);
            g2.transform(aT);
        }
    }
}
