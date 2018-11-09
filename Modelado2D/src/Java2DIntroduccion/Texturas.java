/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2DIntroduccion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TexturePaint;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Texturas extends JFrame {

    public Texturas() {
        super("Texturas");

        this.setSize(260, 260);
        super.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Texturas v = new Texturas();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        BufferedImage bi = new BufferedImage(5, 5, BufferedImage.TYPE_INT_RGB);
        Graphics2D bigr = bi.createGraphics();
        bigr.setColor(Color.orange);
        Rectangle2D r2 = new Rectangle2D.Float(0.0f, 0.0f, 5.0f, 5.0f);
        bigr.fill(r2);
        bigr.setColor(Color.BLUE);
        Ellipse2D e2 = new Ellipse2D.Float(0.0f, 0.0f, 5.0f, 5.0f);
        bigr.fill(e2);
        Rectangle2D r3 = new Rectangle2D.Double(0.0, 0.0, 5.0, 5.0);
        TexturePaint tp = new TexturePaint(bi, r3);
        g2.setPaint(tp);
        Rectangle2D rt = new Rectangle2D.Float(0.0f, 0.0f, 250.0f, 250.0f);
        g2.fill(rt);
    }
}
