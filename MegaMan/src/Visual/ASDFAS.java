package Visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ASDFAS {

	private JFrame frame;
	private JLabel lblMover;
	int posX = 190;
	int posY = 90;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ASDFAS window = new ASDFAS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ASDFAS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==38) {
					
				}
				if (e.getKeyCode()==37) {
					posX -= 10;
				}
				if (e.getKeyCode()==39) {
					posX += 10;
				}
				lblMover.setBounds(posX, posY, 63, 81);
			}
		});
		frame.getContentPane().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==37) {
					posX -= 10;
				}
				if (e.getKeyCode()==39) {
					posX += 10;
				}
				lblMover.setBounds(posX, posY, 63, 81);
			}
		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblMover = new JLabel("");
		lblMover.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode()==37) {
					posX -= 10;
				}
				if (arg0.getKeyCode()==39) {
					posX += 10;
				}
				if (arg0.getKeyCode()==38) {
					
				}
				lblMover.setBounds(posX, posY, 63, 81);
			}
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
		});
		lblMover.setIcon(new ImageIcon("G:\\MegaMan\\escalando.gif"));
		lblMover.setBounds(posX, posY, 63, 81);
		frame.getContentPane().add(lblMover);
	}
}
