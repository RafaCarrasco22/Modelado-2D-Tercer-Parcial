/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2D1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Shapes2 extends JFrame {

    // set window's title bar String, background color and dimensions
    public Shapes2() {
        super("Drawing 2D Shapes");

        getContentPane().setBackground(Color.WHITE);
        setSize(400, 400);
        setVisible(true);
    }

    // draw general paths
    public void paint(Graphics g) {
        super.paint(g); // call superclass's paint method

        int xPoints[] = {55, 67, 109, 73, 83, 55, 27, 37, 1, 43};
        int yPoints[] = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36};
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath star = new GeneralPath(); // create GeneralPath object

        // set the initial coordinate of the General Path
        star.moveTo(xPoints[0], yPoints[0]);

        // create the star--this does not draw the star
        for (int count = 1; count < xPoints.length; count++) {
            star.lineTo(xPoints[count], yPoints[count]);
        }

        star.closePath(); // close the shape

        g2d.translate(200, 200); // translate the origin to (200, 200)

        // rotate around origin and draw stars in random colors
        for (int count = 1; count <= 20; count++) {
            g2d.rotate(Math.PI / 10.0); // rotate coordinate system

            // set random drawing color
            g2d.setColor(new Color((int) (Math.random() * 256),
                    (int) (Math.random() * 256),
                    (int) (Math.random() * 256)));

            g2d.fill(star); // draw filled star
        }
    }

    public static void main(String args[]) {
        Shapes2 application = new Shapes2();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
