import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJFrame extends JFrame {
    private JLabel myLabel;

    public MyJFrame() {
        setTitle("Mi JFrame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        myLabel = new JLabel("Hola Mundoooo:')");
        add(myLabel); 
    }

    public static void main(String[] args) {
        MyJFrame frame = new MyJFrame();
        frame.setVisible(true);
    }
}
