package examen.ejercicio1.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;

public class Alta1 {

	private JFrame frame;
	
	private PBienvenida bienvenida;
	private JMenuBar menuBar;
	private Alta alta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alta1 window = new Alta1();
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
	public Alta1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuBar = new JMenuBar();
		//bienvenida = new PBienvenida(this);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("New menu");
		menuBar.add(menu);
		
		JMenuItem menuConsultar = new JMenuItem("Consultar");
		menuConsultar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0));
		menu.add(menuConsultar);
		
		JMenuItem menuCerrar = new JMenuItem("Cerrar sesión");
		menuCerrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0));
		menu.add(menuCerrar);
		
		JMenuItem menuSalir = new JMenuItem("Salir");
		menuSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0));
		menu.add(menuSalir);
		
		frame.setContentPane(alta);
		
	}
	
	public void irBienvenida() {
		frame.setContentPane(bienvenida);
		
	}

}
