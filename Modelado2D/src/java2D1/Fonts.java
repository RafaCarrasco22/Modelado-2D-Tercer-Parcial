/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2D1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Fonts extends JFrame {
    // set window's title bar and dimensions

    public Fonts() {
        super("Using fonts");

        setSize(420, 125);
        setVisible(true);
    }
// display Strings in different fonts and colors

    public void paint(Graphics g) { // call superclass's paint method
        super.paint(g);

        // set font to Serif (Times), bold, 12pt and draw a string
        g.setFont(new Font("Serif", Font.BOLD, 12));
        g.drawString("Serif 12 point bold.", 20, 50);
        // set font to Monospaced (Courier), italic, 24pt and draw a string
        g.setFont(new Font("Monospaced", Font.ITALIC, 24));
        g.drawString("Monospaced 24 point italic.", 20, 70);

        // set font to SansSerif (Helvetica), plain, 14pt and draw a string
        g.setFont(new Font("SansSerif", Font.PLAIN, 14));
        g.drawString("SansSerif 14 point plain.", 20, 90);

        // set font to Serif (Times), bold/italic, 18pt and draw a string
        g.setColor(Color.RED);
        g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 18));
        g.drawString(g.getFont().getName() + " " + g.getFont().getSize()
                + " point bold italic.", 20, 110);

    } // end method paint

    // execute application
    public static void main(String args[]) {
        Fonts application = new Fonts();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
