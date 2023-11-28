package gui;
import javax.swing.JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PBienvenida extends View{
	private JTextField nombre;
	private JTextField pass;
	private JRadioButton anonimo;

	public PBienvenida(App controller) {
		super(controller);
		setLayout(null);
		
		anonimo = new JRadioButton("Anonimo");
		anonimo.setBounds(279, 192, 109, 23);
		add(anonimo);
		
		JRadioButton iden = new JRadioButton("Identificar");
		iden.setBounds(279, 229, 109, 23);
		add(iden);
		
		JButton entrar = new JButton("Entrar");
		entrar.setBounds(317, 36, 89, 23);
		add(entrar);
		
		nombre = new JTextField();
		nombre.setBounds(96, 37, 86, 20);
		add(nombre);
		nombre.setColumns(10);
		
		pass = new JTextField();
		pass.setBounds(96, 120, 86, 20);
		add(pass);
		pass.setColumns(10);
		
		nombre.setEnabled(false);
		pass.setEnabled(false);
		
		anonimo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(anonimo.isSelected()) {
					nombre.setEnabled(false);
					pass.setEnabled(false);
				}
			}
		});
		
		iden.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(iden.isSelected()) {
					nombre.setEnabled(true);
					pass.setEnabled(true);
				}
			}
		});
		
		entrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(iden.isSelected()) {
					if(nombre.getText().equals("admin") && pass.getText().equals("123")) {
						controller.irConsultar();
					}else if (!nombre.getText().equals("admin") || !pass.getText().equals("123")) {
						JOptionPane.showMessageDialog(null, JOptionPane.ERROR_MESSAGE);
					}
				}else if (anonimo.isSelected()) {
					controller.irConsultar();
				}
			}
		});
		
		
	}
}
