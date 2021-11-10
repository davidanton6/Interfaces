package DI;

import javax.swing.*;
import java.awt.*;

public class CrearVentanaCentrada {
	public static void main(String[] args) {
		VentanaCentrada miFrame = new VentanaCentrada();
		miFrame.setVisible(true);
		miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class VentanaCentrada extends JFrame {
	public VentanaCentrada() {
		setTitle("Ventana centrada"); //Título del marco
		setResizable(false); //No poder dimensionar la ventana
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension sizePantalla = miPantalla.getScreenSize(); //Dimesiones de la pantalla
		int anchoPantalla = sizePantalla.width; //Ancho de la pantalla
		int altoPantalla = sizePantalla.height; //Alto de la pantalla
		
		setSize(anchoPantalla/2, altoPantalla/2);
		setLocation(anchoPantalla/4, altoPantalla/4);
		
	}
}