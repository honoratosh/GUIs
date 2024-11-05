package com.clase051124;



import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * 
 * @author Ambriz Cano Diego Emilio
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
