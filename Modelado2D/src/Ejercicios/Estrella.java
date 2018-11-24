/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class Estrella extends JFrame{
    public Estrella() {
        super("Brilla Brilla Patricio Estrella");

        setSize(750,750);
        setVisible(true);
        super.setLocationRelativeTo(null);
    }

    /*public static void main(String args[]) {
        Estrella application = new Estrella();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
    }*/

    public void paint(Graphics g) {
        super.paint(g); // call superclass's paint method
        g.setColor(Color.blue);
        g.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
        g.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());
        
        int xf = 10;
        g.setColor(Color.black);
        int distancia = this.getHeight()/2;
        int aumento = distancia / xf;
        double y1 = distancia;
        double x2 = aumento;
        double x1= 0.0;
        double y2 = 0.0;
        
        for(int i = 0; i<xf ; i++){
            g.drawLine((int) coord_x(x1), (int) coord_y(y1), (int) coord_x(x2), (int) coord_y(y2));
            g.drawLine((int) coord_x(x1), (int) coord_y(-1*y1), (int) coord_x(-1*x2), (int) coord_y(y2));
            y1-=aumento;
            x2+=aumento;
        }
        y1=-1*distancia;
        x2=aumento;
        for(int i = 0; i<xf ; i++){
            g.drawLine((int) coord_x(x1), (int) coord_y(y1), (int) coord_x(x2), (int) coord_y(y2));
            g.drawLine((int) coord_x(x1), (int) coord_y(-1*y1), (int) coord_x(-1*x2), (int) coord_y(y2));
            y1+=aumento;
            x2+=aumento;
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
