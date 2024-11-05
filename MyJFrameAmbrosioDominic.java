import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Ventana");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel myLabel = new JLabel("Hola Mundo");
        frame.add(myLabel);
        frame.setVisible(true);
    }
}
