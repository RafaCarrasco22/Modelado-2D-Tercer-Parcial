/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Carro extends JFrame {

    public Carro() {
        super("RUUUUUUUUUUUUUUUUN");

        setSize(550, 365);
        setVisible(true);
    }

    public static void main(String args[]) {
        Carro application = new Carro();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
    }
    
        // display various lines, rectangles and ovals
    public void paint(Graphics g) {
        super.paint(g); // call superclass's paint method
        //llantas
        g.setColor(Color.black);
        g.fillOval(30, 180, 100, 100);
        g.setColor(Color.white);
        g.fillOval(40, 190, 80, 80);
        g.setColor(Color.black);
        g.drawLine(40, 230, 120, 230);
        g.drawLine(80, 180, 80, 280);
        g.drawOval(50, 200, 60, 60);

        g.setColor(Color.black);
        g.fillOval(330, 180, 100, 100);
        g.setColor(Color.white);
        g.fillOval(340, 190, 80, 80);
        g.setColor(Color.black);
        g.drawLine(340, 230, 420, 230);
        g.drawLine(380, 180, 380, 280);
        g.drawOval(350, 200, 60, 60);
        
        //cuerpo carro
        g.setColor(Color.PINK);
        g.fillRect(10, 123, 122, 12);
        g.setColor(Color.BLUE);
        g.fillRect(10, 133, 500, 82);
        g.fillRect(122, 30, 388, 123);
        
        //detalles
        g.setColor(Color.YELLOW);
        g.fillOval(10, 125, 10, 30);
        g.setColor(Color.cyan);
        g.fillRect(130, 37, 130, 100);
        g.setColor(Color.ORANGE);
        g.drawLine(230, 139, 260, 139);
        g.drawLine(230, 140, 260, 140);
        g.drawLine(230, 141, 260, 141);
        g.setFont(new Font("Century", Font.CENTER_BASELINE, 20));
        g.drawString("El panadero con el pan", 270, 100);
    } // end method paint
}
