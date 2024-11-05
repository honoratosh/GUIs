package com.clase051124;



import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * 
 * @author Ambriz Cano Diego Emilio
 */
public class Clase051124 extends JFrame {
    private JLabel myLabel;

    public Clase051124() {
   
        myLabel = new JLabel();
        myLabel.setText("Hola Mundo");

        add(myLabel);

        setTitle("Mi JFrame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
    }

    public static void main(String[] args) {
        Clase051124 frame = new Clase051124();
        frame.setVisible(true);
    }
}
