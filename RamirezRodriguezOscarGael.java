/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ramirezrodriguezoscargael;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Warrior HP
 */
public class RamirezRodriguezOscarGael {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel myLabel = new JLabel("Hola Mundo :)");
        
        frame.add(myLabel);
        frame.setTitle("Ejemplo de JFrame");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
