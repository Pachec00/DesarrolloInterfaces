package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class App {

	private JFrame frame;
	private JTextField txt_nombre;
	private JTextField txt_apellido;

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
		frame.getContentPane().setLayout(null);
		
		JLabel name = new JLabel("Nombre");
		name.setBounds(49, 36, 46, 14);
		frame.getContentPane().add(name);
		
		JLabel apellido = new JLabel("Apellidos");
		apellido.setBounds(49, 94, 46, 14);
		frame.getContentPane().add(apellido);
		
		JLabel resultado = new JLabel("Resultado:");
		resultado.setBounds(49, 175, 131, 14);
		frame.getContentPane().add(resultado);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(118, 33, 86, 20);
		frame.getContentPane().add(txt_nombre);
		txt_nombre.setColumns(10);
		
		txt_apellido = new JTextField();
		txt_apellido.setBounds(118, 91, 86, 20);
		frame.getContentPane().add(txt_apellido);
		txt_apellido.setColumns(10);
		
		JButton Confirmar = new JButton("Botón");
		Confirmar.setBounds(251, 64, 89, 23);
		frame.getContentPane().add(Confirmar);
		
		
		
		
		
	}
}
