package com.mycompany.myjframe;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MyJFrame extends JFrame {
    public MyJFrame() {
        setTitle("Ventana de Ejemplo");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel etiqueta = new JLabel("Hola Mundo", SwingConstants.CENTER);

        add(etiqueta);
    }

    public static void main(String[] args) {
        MyJFrame ventana = new MyJFrame();
        ventana.setVisible(true);
    }
}
