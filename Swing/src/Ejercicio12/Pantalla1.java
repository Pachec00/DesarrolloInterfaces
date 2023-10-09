package Ejercicio12;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla1 extends View {

	private static final long serialVersionUID = 1L;
	private JTextField txt;

	/**
	 * Create the panel.
	 */
	public Pantalla1(App controller) {
		super(controller);
		setLayout(null);
		
		JButton boton1 = new JButton("1");
		boton1.setBounds(0, 11, 206, 141);
		add(boton1);
		boton1.setEnabled(false);
		
		JButton boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.irPantalla2(txt.getText());
				
			}
		});
		boton2.setBounds(216, 11, 224, 141);
		add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.irPantalla3(txt.getText());
			}
		});
		boton3.setBounds(0, 163, 206, 126);
		add(boton3);
		
		txt = new JTextField();
		txt.setBounds(216, 163, 224, 126);
		add(txt);
		txt.setColumns(10);
		

	}
	
	public void texto(String txt) {
		this.txt.setText(txt);
	}
}
