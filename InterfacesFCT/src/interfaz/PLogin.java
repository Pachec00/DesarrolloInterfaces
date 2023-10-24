package interfaz;

import javax.swing.JTextField;

import modelo.Usuarios;
import services.usuarioService;
import services.usuarioServiceException;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class PLogin extends View {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public PLogin(App controller) {
		super(controller);
		setLayout(null);

		textField = new JTextField();
		textField.setBounds(164, 57, 86, 20);
		add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(164, 127, 86, 20);
		add(passwordField);

		JButton btnLogin = new JButton("Entrar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char a [] = passwordField.getPassword();
				String pass = new String(a);
				String email = textField.getText();
				controller.login(email, pass);
				
			}
		});
		btnLogin.setBounds(217, 173, 89, 23);
		add(btnLogin);

		JButton btnAlta = new JButton("Solicitar acceso");
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.irAcceso();
			}
		});
		btnAlta.setBounds(248, 266, 89, 23);
		add(btnAlta);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(347, 266, 89, 23);
		add(btnSalir);

	}

}
