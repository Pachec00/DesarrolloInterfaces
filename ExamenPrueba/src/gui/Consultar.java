package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

import modelo.Usuario;

public class Consultar extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTable table;
	private JTextField nombre;
	private JTextField edad;

	public Consultar(App controller) {
		super(controller);
		setLayout(null);

		nombre = new JTextField();
		nombre.setBounds(232, 421, 86, 20);
		add(nombre);
		nombre.setColumns(10);

		edad = new JTextField();
		edad.setText("");
		edad.setBounds(422, 421, 86, 20);
		add(edad);
		edad.setColumns(10);

		JButton consultar = new JButton("Consultar");
		consultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario user = new Usuario(nombre.getText(), edad.getText());
				controller.consultar(user);

			}
		});
		consultar.setBounds(606, 420, 89, 23);
		add(consultar);
	}
}
