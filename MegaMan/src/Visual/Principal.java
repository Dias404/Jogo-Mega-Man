package Visual;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal extends JFrame{

	ImageIcon iconMegaParadoDireito = new ImageIcon(getClass().getResource("/paradoDireito.png"));
	ImageIcon iconMegaParadoEsquerdo = new ImageIcon(getClass().getResource(""));
	//ImageIcon iconMegaCorrendoDireita = new ImageIcon(getClass().getResource(""));
	//ImageIcon iconMegaCorrendoEsquerda = new ImageIcon(getClass().getResource(""));
	
	JLabel lblMegaMan = new JLabel(iconMegaParadoDireito);
	
	int posMegaX = 20;
	int posMegaY = 130;
	
	public Principal() {
		editarJanela();
		editarComponentes();
		addMovimento();
	}
	
	public void addMovimento() {
		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				
			}
			
			public void keyReleased(KeyEvent e) {
				
			}
			
			public void keyPressed(KeyEvent e) {
				/*
				if (e.getKeyCode()==38) {
					posMegaY -= 10;
				}
				if (e.getKeyCode()==40) {
					posMegaY += 10;
				}
				*/
				if (e.getKeyCode()==37) {
					posMegaX -= 10;
					lblMegaMan.setIcon(new ImageIcon(getClass().getResource("/paradoEsquerdo.png")));
				}
				if (e.getKeyCode()==39) {
					posMegaX += 10;
					lblMegaMan.setIcon(new ImageIcon(getClass().getResource("/paradoDireito.png")));
				}
				lblMegaMan.setBounds(posMegaX, posMegaY, 48, 48);
			}
		});
	}
	
	public void editarComponentes() {
		lblMegaMan.setBounds(posMegaX, posMegaY, 48, 48);
	}
	
	public void editarJanela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 250);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		add(lblMegaMan);
	}
	
	public static void main(String[] args) {
		new Principal();
	}
	
}
