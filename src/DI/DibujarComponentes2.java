package DI;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujarComponentes2 {

	public static void main(String[] args) {
		FijarMarco framePrincipal = new FijarMarco();
		framePrincipal.setVisible(true);
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePrincipal.setLocationRelativeTo(null);

	}
}

class FijarMarco extends JFrame {
	public FijarMarco() {
		setTitle("Ventana con gráficos 2D"); // Título del marco
		setSize(1000, 500);
		
		FijarCapa pnlCapa = new FijarCapa();
		add(pnlCapa);

	}

	class FijarCapa extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 500, 150);
			g2.draw(rectangulo);
			Line2D linea = new Line2D.Double(100, 100, 600, 250);
			g2.draw(linea);
			Ellipse2D elipse = new Ellipse2D.Double(50, 50, 500, 150);
			g2.draw(elipse);
			Ellipse2D elipse2 = new Ellipse2D.Double(100, 100, 500, 150);
			g2.draw(elipse2);
		}

	}
}
