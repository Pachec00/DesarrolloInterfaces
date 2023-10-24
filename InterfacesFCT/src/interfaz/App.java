package interfaz;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import modelo.Usuarios;
import services.usuarioService;
import services.usuarioServiceException;

public class App {

	private JFrame frame;

	private PLogin pLogin;
	private PBienvenida pBienvenida;
	private JMenuBar menuBar;
	private PConsultarRegistro pRegistro;
	private PCrearRegistro pNRegistro;
	private PAcceso pAcceso; 
	private Usuarios user;

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
	 *
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

		menuBar.setVisible(false);
		frame.setJMenuBar(menuBar);

		JMenu JMenu = new JMenu("App");
		JMenu JMenu1 = new JMenu("Registros");
		menuBar.add(JMenu);
		menuBar.add(JMenu1);

		JMenuItem item1 = new JMenuItem("Cerrar sesion");
		JMenuItem item2 = new JMenuItem("Salir");
		JMenuItem item3 = new JMenuItem("Crear nuevo registro");
		JMenuItem item4 = new JMenuItem("Consultar registro");
		JMenu.add(item1);
		JMenu.add(item2);
		JMenu1.add(item3);
		JMenu1.add(item4);
		
		
		
		
		
		item1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		item2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				irCrearRegistro();
			}
		});
		
		item4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		pLogin = new PLogin(this);
		pBienvenida = new PBienvenida(this);
		pAcceso = new PAcceso(this);
		pNRegistro = new PCrearRegistro(this);

		frame.setContentPane(pLogin);

	}

	public void irBienvenida() {
		pBienvenida.actualizar(user.getNombre());
		frame.setContentPane(pBienvenida);
		menuBar.setVisible(true);
		frame.revalidate();
		
	}
	
	public void irAcceso() {
		frame.setContentPane(pAcceso);
		frame.revalidate();
	}
	
	public void irCrearRegistro() {
		frame.setContentPane(pNRegistro);
		menuBar.setVisible(true);
		frame.revalidate();
	}
	public void irConsultarRegistro() {
		frame.setContentPane(pNRegistro);
		menuBar.setVisible(true);
		frame.revalidate();
		
	}
	public void login(String email , String pass) {
		try {
			// Llamar al servicio
			usuarioService us = new usuarioService();
			user = us.servicioLogin(email,pass);
			irBienvenida();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (usuarioServiceException e1) {
			e1.printStackTrace();
			System.out.println("Email o contraseña no coinciden");
		}
		
	}
	
	
	
	
}
