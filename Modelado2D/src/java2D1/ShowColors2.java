/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2D1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class ShowColors2 extends JFrame {

    private JButton changeColorButton;
    private Color color = Color.LIGHT_GRAY;
    private Container container;

    public ShowColors2() {
        super("Using JColorChooser");

        container = getContentPane();
        container.setLayout(new FlowLayout());

        // set up changeColorButton and register its event handler
        changeColorButton = new JButton("Change Color");
        changeColorButton.addActionListener(
                new ActionListener() { // anonymous inner class
            // display JColorChooser when user clicks button
            public void actionPerformed(ActionEvent event) {
                color = JColorChooser.showDialog(
                        ShowColors2.this, "Choose a color", color);
                // set default color, if no color is returned
                if (color == null) {
                    color = Color.LIGHT_GRAY;
                }
                // change content pane's background color
                container.setBackground(color);
            }
        } // end anonymous inner class

        ); // end call to addActionListener

        container.add(changeColorButton);

        setSize(400, 130);
        setVisible(true);

    }

    public static void main(String args[]) {
        ShowColors2 application = new ShowColors2();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
