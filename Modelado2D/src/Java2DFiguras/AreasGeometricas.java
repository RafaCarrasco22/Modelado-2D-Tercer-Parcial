/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2DFiguras;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class AreasGeometricas extends JFrame {

    public AreasGeometricas() {
        super("áreas geométricas");

        setSize(260, 650);
        setVisible(true);
    }

    public static void main(String args[]) {
        AreasGeometricas application = new AreasGeometricas();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        GradientPaint gp = new GradientPaint(50.0f, 50.0f,
                Color.MAGENTA, 200.0f, 50.0f, Color.YELLOW);
        g2.setPaint(gp);
        Ellipse2D e1 = new Ellipse2D.Double(50.0, 50.0,
                100.0, 100.0);
        Ellipse2D e2 = new Ellipse2D.Double(100.0, 50.0,
                100.0, 100.0);
        Area a1 = new Area(e1);
        Area a2 = new Area(e2);
        a1.add(a2);
        //a1.intersect(a2);
        // a1.subtract(a2);
        //a1.exclusiveOr(a2);
        
        
        Ellipse2D e3 = new Ellipse2D.Double(50.0, 200.0,
                100.0, 100.0);
        Ellipse2D e4 = new Ellipse2D.Double(100.0, 200.0,
                100.0, 100.0);
        Area a3 = new Area(e3);
        Area a4 = new Area(e4);
        a3.intersect(a4);
        
        Ellipse2D e5 = new Ellipse2D.Double(50.0, 350.0,
                100.0, 100.0);
        Ellipse2D e6 = new Ellipse2D.Double(100.0, 350.0,
                100.0, 100.0);
        Area a5 = new Area(e5);
        Area a6 = new Area(e6);
        a5.subtract(a6);
        
        Ellipse2D e7 = new Ellipse2D.Double(50.0, 500.0,
                100.0, 100.0);
        Ellipse2D e8 = new Ellipse2D.Double(100.0, 500.0,
                100.0, 100.0);
        Area a7 = new Area(e7);
        Area a8 = new Area(e8);
        a7.exclusiveOr(a8);
        
        g2.fill(a7);
        g2.fill(a5);
        g2.fill(a3);
        g2.fill(a1);
    }
}
