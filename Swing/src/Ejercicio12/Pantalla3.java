package Ejercicio12;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla3 extends View {

	private static final long serialVersionUID = 1L;
	private JTextField txt;

	/**
	 * Create the panel.
	 */
	public Pantalla3(App controller) {
		super(controller);
		setLayout(null);
		
		JButton boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.irPantalla1(txt.getText());
			}
		});
		boton1.setBounds(10, 11, 213, 139);
		add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.irPantalla2(txt.getText());
			}
		});
		boton2.setBounds(233, 11, 207, 139);
		add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.setBounds(10, 161, 213, 128);
		add(boton3);
		boton3.setEnabled(false);
		
		txt = new JTextField();
		txt.setBounds(243, 161, 197, 126);
		add(txt);
		txt.setColumns(10);

	}
	
	public void texto(String txt) {
		this.txt.setText(txt);
	}

}
