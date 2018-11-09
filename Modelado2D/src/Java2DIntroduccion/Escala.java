/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2DIntroduccion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Escala extends JFrame {

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        AffineTransform aT = g2.getTransform();
        aT.translate(10, 170);
        g2.transform(aT);
        aT.setToScale(2.5f, 2.5f);
        for (int i = 0; i < 3; i++) {
            
            g2.drawString("Hola profe", 0.0f, 0.0f);
            g2.setColor(Color.RED);
            g2.transform(aT);
        }
    }
    public Escala() {
        super("Escala");

        this.setSize(450, 260);
        super.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Escala v = new Escala();
    }
}
