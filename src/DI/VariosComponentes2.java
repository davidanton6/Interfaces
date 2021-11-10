package DI;

import java.awt.*;
import javax.swing.*;

public class VariosComponentes2 {
	public static void main(String[] args) {
		new Botones2();

	}
}

class Botones2 extends JFrame {
	//private JButton b1 = new JButton("Boton 1");
	//private JButton b2 = new JButton("Boton 2");

	public Botones2() {
		setVisible(true);
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		GridLayout gl = new GridLayout(4,3);
			gl.setHgap(5);
			gl.setVgap(5);
			cp.setLayout(gl);
		for(int i=1; i<=9; i++) {
			cp.add(new JButton(String.valueOf(i)));
		}
		
		cp.add(new JButton(String.valueOf("*")));
		cp.add(new JButton(String.valueOf("0")));
		cp.add(new JButton(String.valueOf("#")));
		
		/*
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		*/
	}

}
