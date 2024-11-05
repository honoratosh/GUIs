/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//Malfavon Lemus Paris 
package com.mycompany.myjframe;


import java.awt.*;
import javax.swing.*;

public class MyJframe {

    public static void main(String[] args) {
        JFrame MyJFrame = new JFrame ("My JFrame");
        
        JLabel MyJLabel = new JLabel ("Hola Mundo");
        MyJFrame.add(MyJLabel);
        MyJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyJFrame.setSize(200, 100);
        MyJFrame.setVisible(true);
        
    }
}
