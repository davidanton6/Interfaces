package DI;

import java.awt.*;
import javax.swing.*;

public class VariosComponentes {
	public static void main(String[] args) {
		new Botones();

	}
}	
	class Botones extends JFrame{
		private JButton b1 = new JButton("Boton 1");
		private JButton b2 = new JButton("Boton 2");
		
		
	public Botones() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 500);
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		
	}

}
