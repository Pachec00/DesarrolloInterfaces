package examen.ejercicio1.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.KeyStroke;

public class App {

	private JFrame frame;
	private JTable table;

	private PBienvenida bienvenida;
	private Alta alta;
	private Consultar consultar;

	// menu
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuAlta;
	private JMenuItem menuConsultar;
	private JMenuItem menu2;
	private JMenuItem menu3;

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
		frame.setBounds(100, 100, 743, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuBar = new JMenuBar();
		menu = new JMenu();
		menuAlta = new JMenuItem();
		menuConsultar = new JMenuItem();
		menu2 = new JMenuItem();
		menu3 = new JMenuItem();
		bienvenida = new PBienvenida(this);
		alta = new Alta(this);
		consultar = new Consultar(this);

		menuBar.setVisible(false);
		frame.setJMenuBar(menuBar);

		menu = new JMenu("Menú");
		menuBar.add(menu);

		// Menu de Alta que manda a Consultar
		menuAlta = new JMenuItem("Consultar");
		menuAlta.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0));
		menuAlta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				irConsultar();
			}
		});
		menu.add(menuAlta);

		// Menu de Consultar que manda a Alta
		menuConsultar = new JMenuItem("Alta");
		menuConsultar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0));
		menuConsultar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				irAlta();
			}
		});
		menu.add(menuConsultar);

		menu2 = new JMenuItem("Cerrar sesión");
		menu2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0));
		menu2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				irBienvenida();
			}
		});
		menu.add(menu2);

		menu3 = new JMenuItem("Salir");
		menu3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0));
		menu3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menu.add(menu3);

		frame.setContentPane(bienvenida);

	}

	public void irAlta() {
		frame.setContentPane(alta);
		menuBar.setVisible(true);
		menuConsultar.setVisible(false);
		menuAlta.setVisible(true);
		frame.revalidate();

	}

	public void irConsultar() {
		frame.setContentPane(consultar);
		menuBar.setVisible(true);
		menuAlta.setVisible(false);
		menuConsultar.setVisible(true);
		frame.revalidate();

	}

	public void irBienvenida() {
		frame.setContentPane(bienvenida);
		menuBar.setVisible(false);
		frame.revalidate();
	}

}
