/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class Funcion extends JFrame {
  
    public Funcion() {
        super("Carrasco Valencia Rafael");

        setSize(700,800);
        setVisible(true);
        super.setLocationRelativeTo(null);
    }

   /* public static void main(String args[]) {
        Funcion application = new Funcion();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
    }*/

    public static double ecuacion(int a) {
        double res = 0;
        double x = a;
        res = (Math.pow(x, 2)) + (2 * x) - 4;
        return res;
    }

    public void paint(Graphics g) {
        super.paint(g); // call superclass's paint method

        g.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
        g.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());
        int xi = -5;
        int xf = 5;

        for (int i = xi; i <= xf; i++) {
            System.out.println(ecuacion(i));
            double y = ecuacion(i);
            int xp = i + 1;
            double yp = ecuacion(xp);
            g.drawLine((int) coord_x(i), (int) coord_y(y), (int) coord_x(xp), (int) coord_y(yp));
        }
    } // end method paint

    private double coord_x(double x) {
        double xfin = x + this.getWidth() / 2;
        return xfin;
    }
    private double coord_y(double y) {
        double yfin = -y + this.getHeight() / 2;
        return yfin;
    }
}
