package examen.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import examen.services.AutenticacionException;
import examen.services.ExamenService;

public class App {

	private JFrame frame;
	
	//Pantallas
	private Bienvenida bienvenida;
	private Consultar consultar;

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
		
		bienvenida = new Bienvenida(this);
		consultar = new Consultar(this);
		
		frame.setContentPane(consultar);
		
		
	}
	
	public void irBienvenida() {
		frame.setContentPane(bienvenida);
		frame.revalidate();
	}
	
	public void irConsultar(String codigo) throws AutenticacionException {
		ExamenService es = new ExamenService();
		es.login(codigo);
		
		frame.setContentPane(consultar);
		frame.revalidate();
	}

}
