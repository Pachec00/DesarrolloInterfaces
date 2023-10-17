package interfaz;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
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

		JButton btnLogin = new JButton("Entrar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ir a pantalla de bienvenida
			}
		});
		btnLogin.setBounds(217, 173, 89, 23);
		add(btnLogin);

		JButton btnAlta = new JButton("Solicitar acceso");
		btnAlta.setBounds(248, 266, 89, 23);
		add(btnAlta);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(347, 266, 89, 23);
		add(btnSalir);

		passwordField = new JPasswordField();
		passwordField.setBounds(164, 127, 86, 20);
		add(passwordField);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 11, 101, 22);
		add(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		mnNewMenu.setBounds(-14, 7, 115, 26);
		add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
	}
}
