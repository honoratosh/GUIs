package com.mycompany.myjframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame extends JFrame {
    private JLabel myLabel;
    private JTextField inputField;
    private JButton submitButton;

    public MyJFrame() {
        setTitle("Ejemplo de Entrada de Número");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel instructionLabel = new JLabel("Escriba un número:");

        inputField = new JTextField(10); 

        submitButton = new JButton("Enviar");

        myLabel = new JLabel("Número ingresado: ");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputField.getText();
                myLabel.setText("Número ingresado: " + inputText);
            }
        });

        add(instructionLabel);
        add(inputField);
        add(submitButton);
        add(myLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyJFrame();
    }
}
