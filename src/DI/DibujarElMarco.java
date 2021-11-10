package DI;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujarElMarco {

	public static void main(String[] args) {
		MarcoDibujo miFrame = new MarcoDibujo();
		miFrame.setVisible(true);
		miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoDibujo extends JFrame {
	public MarcoDibujo() {
		setTitle("Dibujar marco"); // Título del marco
		setBounds(100, 100, 800, 400); // ejes x, y , ancho y largo

		CapaConFiguras pnlCapa = new CapaConFiguras();
		add(pnlCapa);

	}

	public class CapaConFiguras extends JPanel {
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawRect(50, 50, 100, 50); //localización x,y y tamaño width y height
			g.drawLine(50, 50, 150, 100); //dibujar línea
			//g.drawArc(50, 100, 100, 50, 120, 150); //dibujar arco(posX, posY, ancho, alto,inicio de grado, fin de grado)
			g.drawArc(50, 20, 100, 80, 20, 150);
		}
	}
}
