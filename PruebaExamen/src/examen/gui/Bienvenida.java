package examen.gui;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Bienvenida extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField nombre;
	private JTextField codigo;

	public Bienvenida(App controller) {
		super(controller);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(122, 81, 46, 14);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Codigo");
		lblNewLabel_1.setBounds(122, 143, 46, 14);
		add(lblNewLabel_1);

		nombre = new JTextField();
		nombre.setBounds(178, 78, 86, 20);
		add(nombre);
		nombre.setColumns(10);
		nombre.setEnabled(false);

		codigo = new JTextField();
		codigo.setBounds(178, 140, 86, 20);
		add(codigo);
		codigo.setColumns(10);
		codigo.setEnabled(false);

		JButton login = new JButton("Entrar");
		login.setBounds(362, 322, 89, 23);
		add(login);
		login.setEnabled(false);

		JRadioButton iden = new JRadioButton("Identificacion");
		iden.setBounds(366, 204, 109, 23);
		add(iden);

		JRadioButton anonimo = new JRadioButton("Anonimo");
		anonimo.setBounds(366, 240, 109, 23);
		add(anonimo);

		iden.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(iden.isSelected()) {
					
				}
			}
		});
		
		anonimo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(anonimo.isSelected()) {
					login.setEnabled(true);
				}
			}
		});
	}
}
