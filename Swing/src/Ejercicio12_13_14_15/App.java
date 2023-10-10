package Ejercicio12_13_14_15;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class App {

	private JFrame frame;

	private Pantalla1 p1;
	private Pantalla2 p2;
	private Pantalla3 p3;
	private PBienvenida b;
	private JMenuBar menuBar;

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
		p1 = new Pantalla1(this);
		p2 = new Pantalla2(this);
		p3 = new Pantalla3(this);
		b = new PBienvenida(this);
		
		menuBar.setVisible(false);
		frame.setJMenuBar(menuBar);
		
		
		JMenu JMenu = new JMenu("Ventana");
		menuBar.add(JMenu);
		
		JMenuItem Item1 = new JMenuItem("1");
		Item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		Item1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				irPantalla1(null);
			}
		});
		JMenu.add(Item1);
		
		
		JMenuItem Item2 = new JMenuItem("2");
		Item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		Item2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				irPantalla2(null);
			}
		});
		JMenu.add(Item2);
		
		JMenuItem Item3 = new JMenuItem("3");
		Item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		Item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				irPantalla3(null);
			}
		});
		JMenu.add(Item3);
		
		JMenu mSalir = new JMenu("Salir");
		menuBar.add(mSalir);
		
		JMenuItem salir = new JMenuItem("Salir");
		salir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		salir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mSalir.add(salir);
		
		JMenu mVolver = new JMenu("Volver");
		menuBar.add(mVolver);
		
		JMenuItem volver = new JMenuItem("Volver al inicio");
		mVolver.add(volver);
		volver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setContentPane(b);
			}
		});
		
		frame.setContentPane(b);
	}

	public void irPantalla1(String texto) {
		p1.texto(texto);
		frame.setContentPane(p1);
		menuBar.setVisible(true);
		frame.revalidate();
	}

	public void irPantalla2(String texto) {
		p2.texto(texto);
		frame.setContentPane(p2);
		menuBar.setVisible(true);
		frame.revalidate();
	}

	public void irPantalla3(String texto) {
		p3.texto(texto);
		frame.setContentPane(p3);
		menuBar.setVisible(true);
		frame.revalidate();
	}

}
