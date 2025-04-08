package AWT;

import java.awt.*;
import java.awt.event.*;

// Creating a class that extends Frame and implements ActionListener
public class Button extends Frame implements ActionListener {
    java.awt.Button b;  // Button component

    // Constructor
    Button() {
        // Creating a button
        b = new java.awt.Button("Click Me");
        b.setBounds(100, 100, 100, 50); // Setting position and size of the button

        // Adding action listener to the button
        b.addActionListener(this);

        // Adding button to the Frame
        add(b);

        // Setting Frame properties
        setSize(300, 250);  // Width=300, Height=250
        setTitle("Simple AWT App");
        setLayout(null);  // No default layout
        setVisible(true);

        // Closing the frame on clicking the close button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Overriding actionPerformed() to handle button click
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked!");
    }

    // Main method to launch the application
    public static void main(String[] args) {
        new Button();
    }
}
