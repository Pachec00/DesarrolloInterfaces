package Ejercicio12;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel1 extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Panel1() {
		setSize(600,600);
		
		// Layout
		
		GridLayout grid = new GridLayout(3,3);
		
		// Button
		
		JButton boton1 = new JButton();
		boton1.setEnabled(true);
		
		JButton boton2 = new JButton();
		JButton boton3 = new JButton();
		
		boton1.setText("1");
		boton2.setText("2");
		boton3.setText("3");
		
		// TextField
		
		JTextField txt = new JTextField();
		
		// Contenedor
		
		Container c = getRootPane();
		
		c.setLayout(grid);
		c.add(boton1);
		c.add(boton2);
		c.add(boton3);
	}

}
