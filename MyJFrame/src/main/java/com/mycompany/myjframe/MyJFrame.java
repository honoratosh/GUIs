/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myjframe;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class MyJFrame extends JFrame {
    private JLabel myLabel;

    public MyJFrame() {
        setTitle("Hola Mundo JFrame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        myLabel = new JLabel("Hola Mundo");
        add(myLabel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyJFrame();
    }
}

//Oscar Raymundo Fragoso Mayén