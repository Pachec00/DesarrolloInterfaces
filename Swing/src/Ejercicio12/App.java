package Ejercicio12;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class App {

	private JFrame frame;

	private Pantalla1 p1;
	private Pantalla2 p2;
	private Pantalla3 p3;

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

		p1 = new Pantalla1(this);
		p2 = new Pantalla2(this);
		p3 = new Pantalla3(this);
		
		frame.setContentPane(p1);
	}

	public void irPantalla1(String texto) {
		p1.texto(texto);
		frame.setContentPane(p1);
		frame.revalidate();
	}

	public void irPantalla2(String texto) {
		p2.texto(texto);
		frame.setContentPane(p2);
		frame.revalidate();
	}

	public void irPantalla3(String texto) {
		p3.texto(texto);
		frame.setContentPane(p3);
		frame.revalidate();
	}

}
