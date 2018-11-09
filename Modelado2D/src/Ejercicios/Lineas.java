/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javafx.scene.shape.Line;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Rafael
 */
public class Lineas extends JFrame{
    Graphics g2;
    
    public Lineas() {
       
        super("Lineas Múltiples");
        
        SpinnerModel value =  new SpinnerNumberModel(5,1,15,1);
        JSpinner spinner = new JSpinner(value);   
        spinner.setBounds(100,100,50,30);
        JPanel panelarriba = new JPanel();
        JPanel panel = new JPanel();
        JButton boton = new JButton("Click me!");
        panelarriba.add(spinner);
        panelarriba.add(boton);
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int a = (int) spinner.getValue();
                dibujar(a);
            }
        });
       super.add(panelarriba, BorderLayout.NORTH);
       super.add(panel, BorderLayout.CENTER);
        
        setSize(360, 250);
//setVisible(true);
    }

    public static void main(String args[]) {
        Lineas application = new Lineas();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g2 = g;
       
        /*
        int aumento = 10;
        int x =100;
        System.out.println(valor);
        System.out.println(x);
        for(int i=0; i<valor; i++){
            g.drawLine(x, 100, x, 200);
            x+=aumento;
        }
        super.repaint();*/
        
    }
    public void dibujar(int valor) {
        Lineas linea = new Lineas();
        int aumento = 10;
        int x =100;
        g2 = this.getGraphics();
        
        for(int i=0; i<valor; i++){
            g2.drawLine(x, 100, x, 200);
            x+=aumento;
        }
        linea.invalidate();
        linea.validate();
        linea.repaint();
        
    }
    
}
