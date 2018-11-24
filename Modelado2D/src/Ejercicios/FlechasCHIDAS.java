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
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Rafael
 */
public class FlechasCHIDAS extends JFrame{
    
         Graphics g2;
    public FlechasCHIDAS() {
       
        super("Flechas Chidas");
        JPanel panelarriba = new JPanel();
        JPanel panel = new JPanel();
        JButton botonar = new JButton("Arriba");
        JButton botonder = new JButton("Derecha");
        JButton botoniz = new JButton("Izquierda");
        JButton botonab = new JButton("Abajo");
        
        panelarriba.add(botonar);
        panelarriba.add(botonder);
        panelarriba.add(botoniz);
        panelarriba.add(botonab);
        
        botonar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dibujar(1);
            }
        });
        botonder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dibujar(2);
            }
        });
        botoniz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dibujar(3);
            }
        });
        botonab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dibujar(4);
            }
        });
       super.add(panelarriba, BorderLayout.NORTH);
       super.add(panel, BorderLayout.CENTER);
        
        setSize(700, 700);
//setVisible(true);
    }

    /*public static void main(String args[]) {
        FlechasCHIDAS application = new FlechasCHIDAS();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
    }*/
    int a = 250;
    int b = 300;
    int c = 50;
    int contador = 1;
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillRect(a, b, c, c);
        
        g2 = g;
        
    }
    public void dibujar(int caso) {
        FlechasCHIDAS linea = new FlechasCHIDAS();
        g2 = this.getGraphics();
        Random randomGenerator = new Random();
        int red = randomGenerator.nextInt(256);
        int green = randomGenerator.nextInt(256);
        int blue = randomGenerator.nextInt(256);

        Color randomColour = new Color(red,green,blue);
        g2.setColor(randomColour);
        switch(caso){
            case 1:
                for(int i=0; i<contador;i++){
                    b -=100;
                    g2.fillRect(a, b, c, c);
                }
                contador *=2;
                System.out.println("contador"+contador);
                break;
            case 2:
                for(int i=0; i<contador;i++){
                    a+=100;
                    g2.fillRect(a, b, c, c);
                }
                
                contador *=2;
                System.out.println("contador"+contador);
                break;
            case 3:
                for(int i=0;i<contador;i++){
                    a-=100;
                    g2.fillRect(a, b, c, c);
                }
                
                contador *=2;
                System.out.println("contador"+contador);
                break;
            case 4:
                for(int i=0; i<contador;i++){
                    b+=100;
                g2.fillRect(a, b, c, c);
                }
                
                contador *=2;
                System.out.println("contador"+contador);
                break;
        }
        linea.invalidate();
        linea.validate();
        linea.repaint();
        
    }
    
}
