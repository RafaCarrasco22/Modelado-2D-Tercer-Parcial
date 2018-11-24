/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Casa extends JFrame {

    Graphics g2;
    Graphics g3;
    Graphics g4;
    Graphics g5;

    public Casa() {
        super("La casa que no es de papel");

        setSize(600, 565);
        setVisible(true);
    }

    /*public static void main(String args[]) {
        //Casa application = new Casa();
        //application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //application.setVisible(true);
    }*/

    // display various lines, rectangles and ovals
    public void paint(Graphics g) {
        super.paint(g); // call superclass's paint method

        g.setColor(Color.BLUE);
        g.drawRect(50, 200, 450, 270);

        g3 = this.getGraphics();
        g3.drawRect(100, 230, 60, 60);

        g4 = this.getGraphics();
        g4.drawRect(400, 230, 60, 60);

        Lineas linea = new Lineas();
        int aumento = 2;
        int x = 10;
        g2 = this.getGraphics();
        g2.setColor(Color.GREEN);
        for (int i = 0; i < 1000; i++) {
            g2.drawLine(x, 470, x, 480);
            x += aumento;
        }
        g2.setColor(Color.RED);
        g2.drawLine(130, 230, 130, 290);
        g2.drawLine(430, 230, 430, 290);

        g2.drawLine(30, 200, 520, 200);
        g2.drawLine(30, 200, 50, 160);
        g2.drawLine(500, 160, 520, 200);
        g2.drawLine(50, 160, 500, 160);

        linea.invalidate();
        linea.validate();
        linea.repaint();

        Graphics2D gg = (Graphics2D) g;
        Rectangle2D r = new Rectangle2D.Float(245.0f,
                320.0f, 90.0f, 150.0f);
        Ellipse2D e = new Ellipse2D.Float(248.0f, 380.0f,
                10.0f, 10.0f);
        gg.draw(r);
        gg.draw(e);
    } // end method paint
}
