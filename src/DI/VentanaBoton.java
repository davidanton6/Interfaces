package DI;

import javax.swing.*;

public class VentanaBoton extends JFrame{
	public static void main(String[] args) {
		new VentanaBoton();

	}
	
public VentanaBoton() {
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(400, 400);
	this.setLocationRelativeTo(null);
	this.setLayout(null);
	
	JButton boton = new JButton();
		boton.setText("Presióname");
		boton.setBounds(135, 150, 130, 50);
		boton.setVisible(true);
		add(boton);
	}
}
