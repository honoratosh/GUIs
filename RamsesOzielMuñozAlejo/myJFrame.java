/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.company.myjframe;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author RamsesMA
 */


public class myJFrame extends JFrame {
    private JLabel myLabel;

    public myJFrame() {
   
        myLabel = new JLabel();
        myLabel.setText("Hola Mundo");

        add(myLabel);

        setTitle("Mi JFrame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
    }

    public static void main(String[] args) {
        myJFrame frame = new myJFrame();
        frame.setVisible(true);
    }
}