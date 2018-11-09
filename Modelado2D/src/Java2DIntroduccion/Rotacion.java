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
public class Rotacion extends JFrame {

    public Rotacion() {
        super("Rotación");

        this.setSize(260, 260);
        super.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Rotacion v = new Rotacion();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        int ancho = this.getSize().width;
        int largo = this.getSize().height;
        AffineTransform aT = g2.getTransform();
        aT.translate(ancho / 2, largo / 2);
        g2.transform(aT);
        aT.setToRotation(Math.PI / 4.0);
        for (int i = 0; i < 8; i++) {
            g2.setColor(Color.BLUE);
            g2.drawString("Me llamo Rafa", 0.0f, 0.0f);
            g2.transform(aT);
        }
    }
}
