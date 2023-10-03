package Ejercicio12;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel1 extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 * 
	 * @param main
	 */
	public Panel1(Main main) {

		// Layout

		GridLayout grid = new GridLayout(3, 3);

		// Button

		JButton boton1 = new JButton();
		boton1.setEnabled(false);
		add(boton1);
		boton1.setText("1");

		JButton boton2 = new JButton();
		boton2.setEnabled(true);
		add(boton2);
		boton2.setText("2");
		
		JButton boton3 = new JButton();
		boton3.setEnabled(true);
		add(boton3);
		boton3.setText("3");


		// TextField

		JTextField txt = new JTextField();
		add(txt);

		setLayout(grid);
		

//		setVisible(true);
	}

}
