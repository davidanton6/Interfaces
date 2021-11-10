package DI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VNombre {

	public static void main(String[] args) {
		VyC v1 = new VyC();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class VyC extends JFrame {

	public VyC() {
		super();
		setSize(400, 300);
		setLocationRelativeTo(null);

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		JLabel label = new JLabel("Nombre");
		JTextField field = new JTextField(10);
		JButton boton = new JButton("OK");
		cp.add(label);
		cp.add(field);
		cp.add(boton);
	}
}
