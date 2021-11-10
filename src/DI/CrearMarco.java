package DI;

import javax.swing.*;

public class CrearMarco {
	public static void main(String[] args) {
		Ventana miFrame = new Ventana();
		miFrame.setVisible(true);
		miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miFrame.setLocationRelativeTo(null);
	}
}

class Ventana extends JFrame {
	public Ventana() {
		setTitle("T�tulo de la ventana"); //T�tulo del marco
		setResizable(false); //No poder dimensionar la ventana
		//setLocation(100, 100); //Localizaci�n ejes x, y
		setSize(1000, 600); //Tama�o de la ventana
		//setBounds(0,0,1000,500); //ejes x, y , ancho y largo
	}
}

