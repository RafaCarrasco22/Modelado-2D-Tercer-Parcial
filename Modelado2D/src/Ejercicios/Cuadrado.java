/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Rafael
 */
public class Cuadrado extends JFrame{
    Graphics g2;
    Graphics g3;
    Graphics g4;
    Graphics g5;
    public Cuadrado() {
        super("Cuadrado");
        
        JPanel panelarriba = new JPanel();
        JPanel panel = new JPanel();
        JTextField txt = new JTextField(5);
        JLabel lab = new JLabel("Tamaño pixeles");
        JButton boton = new JButton("Click me!");
        panelarriba.add(lab);
        panelarriba.add(txt);
        panelarriba.add(boton);
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String a = txt.getText();
                int b = Integer.parseInt(a);
                dibujar(b);
                
                
            }
        });
       super.add(panelarriba, BorderLayout.NORTH);
       super.add(panel, BorderLayout.CENTER);
        
        this.setSize(350, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Cuadrado v = new Cuadrado();
    }
    
   public void paint(Graphics g) {
        super.paint(g);
        g2 = g;
        g3 = g;
        g4 = g;
        g5 = g;
       
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
        int aumento = valor;
        int x =80;
        g2 = this.getGraphics();
        g2.drawLine(100, valor, 100, valor+valor);
        g3 = this.getGraphics();
        g4 = this.getGraphics();
        g5 = this.getGraphics();
        g3.drawLine(100+valor, valor, 100+valor, valor+valor);
        g4.drawLine(100+valor, valor, 100, valor);
        g5.drawLine(100+valor, valor+valor, 100, valor+valor);
        
        
        linea.invalidate();
        linea.validate();
        linea.repaint();
        
    }
}
