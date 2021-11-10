package DI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LocalizacionBotones {

	public static void main(String[] args) {
		Brujula v1 = new Brujula();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class Brujula extends JFrame {

	public Brujula() {
		setTitle("Botones con BorderLayout");
		BorderLayout bl = new BorderLayout(5, 5); // (5,5) separación horizontal y vertical
		setLayout(bl);
		setSize(400, 300);
		setLocationRelativeTo(null);

		JButton bt1 = new JButton("NORTE");
		getContentPane().add(bt1, BorderLayout.NORTH);

		JButton bt2 = new JButton("OESTE");
		getContentPane().add(bt2, BorderLayout.WEST);

		JButton bt3 = new JButton("ESTE");
		getContentPane().add(bt3, BorderLayout.EAST);

		JButton bt4 = new JButton("SUR");
		getContentPane().add(bt4, BorderLayout.SOUTH);

		JButton bt5 = new JButton("CENTRAL");
		getContentPane().add(bt5, BorderLayout.CENTER);

	}
}
