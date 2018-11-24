/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.RadioButton;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;


/**
 *
 * @author Rafael
 */
public class PrincipalFrame extends JFrame{
    
   
    public PrincipalFrame(){
        super("Ejercicios xdxdxd");
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel title = new JLabel("Ejercicios de Clase By Rafa");
        JLabel carro = new JLabel("Carro");
        JLabel casa = new JLabel("Casa");
        JLabel cuadrado = new JLabel("Cuadrado");
        JLabel star = new JLabel("Estrella");
        JLabel flechas = new JLabel("Pintar cuadros con flechas");
        JLabel func = new JLabel("Función matemática");
        JLabel lcrc = new JLabel("Lineas+Cuadro+Rectangulo+Circulo");
        JLabel lineas = new JLabel("Lineas multiples");
        JLabel tablero = new JLabel("Tablero (EXAMEN)");
        JButton btn1 = new JButton("Go!");

        JComboBox checka = new JComboBox();
        
        checka.addItem("Carro");
        checka.addItem("Casa");
        checka.addItem("Cuadrado");
        checka.addItem("Estrella");
        checka.addItem("Flechas");
        checka.addItem("Función");
        checka.addItem("LineaCuadroRectCiculo");
        checka.addItem("Lineas Múltiples");
        checka.addItem("Tablero");
        
        panel.add(title);
        panel1.add(checka);
                
        panel2.add(btn1);
        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switch(checka.getSelectedIndex()){
                    case 0:
                        Carro c= new Carro();
                        c.show();
                        break;
                    case 1:
                        Casa ca = new Casa();
                        ca.show();
                        break;
                    case 2:
                        Cuadrado cua = new Cuadrado();
                        cua.show();
                        break;
                    case 3:
                        Estrella star = new Estrella();
                        star.show();
                        break;
                    case 4:
                        Flechas1 f = new Flechas1();
                        f.show();
                        break;
                    case 5:
                        Funcion fu = new Funcion();
                        fu.show();
                        break;
                    case 6: 
                        LCRC l = new LCRC();
                        l.show();
                        break;
                    case 7:
                        Lineas li = new Lineas();
                        li.show();
                        break;
                    case 8:
                        Tablero tab = new Tablero();
                        tab.show();
                        break;
                        
                }
            }
        });
        
        super.add(panel, BorderLayout.NORTH);
        
        
        super.add(panel1, BorderLayout.CENTER);
        super.add(panel2, BorderLayout.SOUTH);
        setSize(250, 190);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        PrincipalFrame application = new PrincipalFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
        
    }
}
