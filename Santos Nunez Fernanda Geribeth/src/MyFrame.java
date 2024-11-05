import javax.swing.JFrame; //JFrame es para el Frame que es la ventana 
import javax.swing.JLabel; //JLabel es para la etiqueta 

public class MyFrame {
	public static void main(String[] args) {
		JFrame MyJFrame = new JFrame("MyJFrame!");
		//JFrame Representa una ventana básica, capaz de contener otros componente
	   
		JLabel MyJLabel = new JLabel("Hola mundo");
		//JLabel es una etiqueta, creamos un objeto tipo etiqueta 
		MyJFrame.add(MyJLabel);
		MyJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyJFrame.setVisible(true);
		MyJFrame.setSize(400, 400);
	   
	 }
}


