package Vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pantallas {
	
	public String ingresarvalor(String titulo)
	{
		JFrame frame = new JFrame();
		String valoringresado=JOptionPane.showInputDialog(frame, titulo,"");
		return valoringresado;
	}
	
	public void mostrarmensaje(String mensaje)
	{
		JFrame JFrame = new JFrame();
		JOptionPane.showMessageDialog(JFrame, mensaje);
	}
}

