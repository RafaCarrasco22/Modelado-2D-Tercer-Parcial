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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Rafael
 */
public class LCRC extends JFrame{
    
    Graphics g2;
    Graphics g3;
    Graphics g4;
    Graphics g5;
    public LCRC() {
        super("LINEA CIRCULO RECTANGULO CIRCULO");
        
        JPanel panelarriba = new JPanel();
        JPanel panel = new JPanel();
        JComboBox combo = new JComboBox();
        combo.addItem("Linea");
        combo.addItem("Cuadrado");
        combo.addItem("Rectangulo");
        combo.addItem("Circulo");
        
        JLabel lab = new JLabel("Seleccione lo que desea");
        JButton boton = new JButton("Click me!");
        panelarriba.add(lab);
        panelarriba.add(combo);
        
        panelarriba.add(boton);
        
        JLabel labx = new JLabel("X --> ");
        JLabel laby = new JLabel("Y --> ");
        
        JTextField equis = new JTextField(5);
        JTextField ye = new JTextField(5);
        
        
        panelarriba.add(labx);
        panelarriba.add(equis);
        panelarriba.add(laby);
        panelarriba.add(ye);
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(combo.getSelectedIndex() == 0){
                    System.out.println("linea");
                    String a = equis.getText();
                    int b = Integer.parseInt(a);
                    dibujarL(b);
                } else if(combo.getSelectedIndex() == 1){
                    System.out.println("cuadro");
                    String a = equis.getText();
                    int b = Integer.parseInt(a);
                    dibujarC(b);
                } else if(combo.getSelectedIndex() == 2){
                    System.out.println("Rectangulo");
                    String a = equis.getText();
                    int b = Integer.parseInt(a);
                    String d = ye.getText();
                    int c = Integer.parseInt(d);
                    dibujarRe(b,c);
                } else {
                    System.out.println("Circulo");
                    String a = equis.getText();
                    int b = Integer.parseInt(a);
                    dibujarCi(b);
                }
                /*String a = equis.getText();
                int b = Integer.parseInt(a);
                dibujar(b);*/
                
                
            }
        });
       super.add(panelarriba, BorderLayout.NORTH);
       super.add(panel, BorderLayout.CENTER);
        
        this.setSize(550, 400);
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /*public static void main(String[] args) {
        LCRC v = new LCRC();
    }*/
    
   public void paint(Graphics g) {
        super.paint(g);
        g2 = g;
        g3 = g;
        g4 = g;
        g5 = g;
        
    }
    public void dibujarL(int valor) {
        Lineas linea = new Lineas();
        g2 = this.getGraphics();
        g2.drawLine(100, 100, 100, valor+valor);
        
        
        
        linea.invalidate();
        linea.validate();
        linea.repaint();
        
    }
    public void dibujarC(int valor) {
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
    public void dibujarRe(int valor, int valor2) {
        Lineas linea = new Lineas();
        int aumento = valor;
        int x =80;
        g2 = this.getGraphics();
        g2.drawRect(100, 100, valor, valor2);
        /*g2.drawLine(100, valor, 100, valor+valor);
        g3 = this.getGraphics();
        g4 = this.getGraphics();
        g5 = this.getGraphics();
        g3.drawLine(100+valor2, valor, 100+valor2, valor+valor);
        g4.drawLine(100+valor2, valor2+100, 100, valor);
        g5.drawLine(100+valor2, valor2+valor+100, 100, valor+100+valor2);*/
        
        
        linea.invalidate();
        linea.validate();
        linea.repaint();
        
    }
    public void dibujarCi(int valor) {
        Lineas linea = new Lineas();
        g2 = this.getGraphics();
        g2.drawOval(120, 120, valor*2, valor*2);
        linea.invalidate();
        linea.validate();
        linea.repaint();
        
    }
}
