/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiss;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author efcru
 */


public class MyJFrame extends JFrame {
    private JLabel myLabel;

    public MyJFrame() {
        myLabel = new JLabel();
        myLabel.setText("Hola Mundo");
        add(myLabel);
        
        setTitle("Mi Ventana");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyJFrame();
    }
}

