package Ejercicio12_13_14_15;

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
		boton1.setBounds(71, 161, 63, 38);
		add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.irPantalla2(txt.getText());
			}
		});
		boton2.setBounds(197, 161, 63, 38);
		add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.setBounds(331, 161, 63, 38);
		add(boton3);
		boton3.setEnabled(false);
		
		txt = new JTextField();
		txt.setBounds(131, 73, 186, 30);
		add(txt);
		txt.setColumns(10);

	}
	
	public void texto(String txt) {
		this.txt.setText(txt);
	}

}
