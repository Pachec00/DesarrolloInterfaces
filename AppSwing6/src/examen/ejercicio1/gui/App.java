package examen.ejercicio1.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class App {

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
					App window = new App();
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
	public App() {
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
		bienvenida = new PBienvenida(this);
		alta = new Alta(this);
		
		menuBar.setVisible(false);
		frame.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Menú");
		menuBar.add(menu);
		
		JMenuItem menuAlta = new JMenuItem("Alta");
		menuAlta.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0));
		menuAlta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				irAlta();
			}
		});
		menu.add(menuAlta);
		
		JMenuItem menuSesion = new JMenuItem("Cerrar sesión");
		menuSesion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0));
		menu.add(menuSesion);
		
		JMenuItem menuSalir = new JMenuItem("Salir");
		menuSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0));
		menuSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menu.add(menuSalir);
		
		frame.setContentPane(bienvenida);
		
	}
	
	public void irAlta() {
		frame.setContentPane(alta);
		menuBar.setVisible(true);
		frame.revalidate();
		
	}

}
