package interfaz;

import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.Usuarios;
import services.usuarioService;
import services.usuarioServiceException;

import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class PAcceso extends View {

	private static final long serialVersionUID = 1L;
	private JTextField email;
	private JPasswordField pass;
	private JPasswordField pass1;
	private JTextField nombre;
	private JTextField apellido;

	/**
	 * Create the panel.
	 */
	public PAcceso(App controller) {
		super(controller);
		setLayout(null);
		
		email = new JTextField();
		email.setBounds(164, 20, 86, 20);
		add(email);
		email.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(164, 51, 86, 20);
		add(pass);
		
		pass1 = new JPasswordField();
		pass1.setBounds(164, 82, 86, 20);
		add(pass1);
		
		nombre = new JTextField();
		nombre.setColumns(10);
		nombre.setBounds(164, 113, 86, 20);
		add(nombre);
		
		apellido = new JTextField();
		apellido.setColumns(10);
		apellido.setBounds(164, 144, 86, 20);
		add(apellido);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(164, 197, 86, 22);
		add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setBounds(79, 23, 46, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Repetir contraseña");
		lblNewLabel_1.setBounds(28, 83, 126, 18);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña");
		lblNewLabel_1_1.setBounds(79, 53, 75, 17);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nombre");
		lblNewLabel_1_2.setBounds(79, 116, 46, 14);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Apellidos");
		lblNewLabel_1_3.setBounds(79, 147, 46, 14);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Ciclo");
		lblNewLabel_1_4.setBounds(79, 201, 46, 14);
		add(lblNewLabel_1_4);
		
		JButton aceptar = new JButton("Aceptar");
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Llamar al servicio
				
				usuarioService us = new usuarioService();
				Usuarios user = new Usuarios();
				char [] a = pass.getPassword();
				char [] b = pass.getPassword();
				String pass = new String(a);
				String pass1 = new String(b);
				if(pass.equals(b)) {
					user.setEmail(email.getText());
					user.setPass(pass);
					user.setNombre(nombre.getText());
					user.setApellidos(apellido.getText());
					user.setActivo(0);
					user.setCiclo("DAM");
					try {
						us.registrarUsuario(user);
						System.out.println("Usuario registrado");
					} catch (SQLException e1) {
						e1.printStackTrace();
					} catch (usuarioServiceException e1) {
						e1.printStackTrace();
					}
				}else {
					//Las contraseñas no coinciden
				}
			}
		});
		aceptar.setBounds(260, 266, 89, 23);
		add(aceptar);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setBounds(351, 266, 89, 23);
		add(cancelar);
		
		
	}
}
