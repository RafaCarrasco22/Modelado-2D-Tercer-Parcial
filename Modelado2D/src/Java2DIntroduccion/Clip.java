/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2DIntroduccion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Clip extends JFrame {
    public Clip() {
        super("Clips");

        this.setSize(260, 260);
        super.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Clip v = new Clip();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
// Primera parte del ejemplo
        int ancho = this.getSize().width;
        int largo = this.getSize().height;
        Ellipse2D e = new Ellipse2D.Float(ancho / 4.0f, largo / 4.0f,
                ancho / 2.0f, largo / 2.0f);
        g2.setClip(e);
        g2.setColor(Color.MAGENTA);
        g2.fill(new Rectangle2D.Float(0.0f, 0.0f, ancho, largo));
//Segunda parte del ejemplo
        Rectangle2D r2 = new Rectangle2D.Float((ancho / 4.0f + 10.0f),(largo / 4.0f + 10.0f),(ancho / 2.0f-20.0f), (largo / 2.0f -20.0f));
        g2.clip(r2);
        g2.setColor(Color.ORANGE);
        g2.fill(new Rectangle2D.Float(0.0f, 0.0f, ancho, largo));
    }
}
