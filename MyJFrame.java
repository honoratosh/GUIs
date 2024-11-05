/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sandbox.myjframe;

/**
 *
 * @author Cano Roman
 */

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJFrame extends JFrame{
    public JLabel myLabel;
    
    public MyJFrame(){
        myLabel.setText("Hola Mundo");
        this.add(myLabel);
    }
    
    public static void main(String[] args) {
        MyJFrame frame = new MyJFrame();
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
    }
}
