package DI;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BotonesHasta12 {
	public static void main(String[] args) {
		new Botones12();

	}
}

class Botones12 extends JFrame {

	public Botones12() {
		setTitle("12 Botones");
		setVisible(true);
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		GridLayout gl = new GridLayout(3, 4);
		gl.setHgap(5); // distancia lateral
		gl.setVgap(5); // distancia vertical
		cp.setLayout(gl);
		for (int i = 1; i <= 12; i++) {
			cp.add(new JButton(String.valueOf(i)));
		}
	}
}
