/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Rafael
 */
public class Tablero extends JFrame{
    Graphics g2;
    public Tablero() {
        super("Carrasco Valencia Rafael EXAMEEEN");
        
         SpinnerModel value =  new SpinnerNumberModel(5,1,25,1);
        JSpinner spinner = new JSpinner(value);   
        spinner.setBounds(100,100,50,30);
        
        SpinnerModel value2 =  new SpinnerNumberModel(5,1,25,1);
        JSpinner spinner2 = new JSpinner(value2);   
        spinner2.setBounds(100,100,50,30);
        
        JPanel panelarriba = new JPanel();
        JLabel label = new JLabel("N");
        JLabel label2 = new JLabel("Mod");
        JPanel panel = new JPanel();
        JButton boton = new JButton("Click me!");
        panelarriba.add(label);
        panelarriba.add(spinner);
        panelarriba.add(label2);
        panelarriba.add(spinner2);
        panelarriba.add(boton);
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int a = (int) spinner.getValue();
                int b = (int) spinner2.getValue();
                dibujar(a , b);
            }
        });
       super.add(panelarriba, BorderLayout.NORTH);
       super.add(panel, BorderLayout.CENTER);

        setSize(1000,800);
        setVisible(true);
        super.setLocationRelativeTo(null);
    }

    /*public static void main(String args[]) {
        Tablero application = new Tablero();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
    }*/


    public void paint(Graphics g) {
        super.paint(g); // call superclass's paint method
        g2 = g;
    } // end method paint
    
    public void dibujar(int valor, int modulo) {
        Lineas linea = new Lineas();
        int aumento = 30;
        int x =90;
        int xi = 90;
        int y = 90;
        
        g2 = this.getGraphics();
        
        int contador = 0;
        int cantidad = valor * valor;
        cantidad -=1;
        int c = cantidad + 1;
        System.out.println("La cantidad de cuadros es: "+cantidad);
        
        for(int i=0; i<valor; i++){
            for(int j=0; j<valor; j++){
                g2.drawRect(x, y, 30, 30);
                if(contador % modulo == 0){
                    g2.fillRect(x, y, 30, 30);
                }
                
                x+=aumento;
                contador++;
                System.out.println(contador);
            }
            x= xi;
            y+=aumento;
        }
        
        
        linea.invalidate();
        linea.validate();
        linea.repaint();
        
    }
}
