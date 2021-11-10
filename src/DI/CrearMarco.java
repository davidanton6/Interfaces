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
		setTitle("Título de la ventana"); //Título del marco
		setResizable(false); //No poder dimensionar la ventana
		//setLocation(100, 100); //Localización ejes x, y
		setSize(1000, 600); //Tamaño de la ventana
		//setBounds(0,0,1000,500); //ejes x, y , ancho y largo
	}
}

