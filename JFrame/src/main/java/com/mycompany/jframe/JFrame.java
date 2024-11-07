/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyJFrame extends JFrame {
    JLabel myLabel;

    public MyFrame() {
        // Configuración de la ventana JFrame
        setTitle("Hola Mundo");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myLabel = new JLabel();
        myLabel.setText("Hola mundo");
        add(myLabel);

        setVisible(true);
    }
}

public class JFrame {
    public static void main(String[] args) {
        new JFrame();
    }
}
