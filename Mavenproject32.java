package com.mycompany.mavenproject32;

//Librerías
import java.awt.*;
import javax.swing.*;

public class Mavenproject32 {
    public static void main(String[] args) {
        JFrame MyJFrame = new JFrame("MyJFrame");
        
        JLabel MyJLabel = new JLabel("Hola mundo");
        MyJFrame.add(MyJLabel);
        MyJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyJFrame.setSize(200, 100);
        MyJFrame.setVisible(true);
    }
}
