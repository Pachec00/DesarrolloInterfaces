package Ejercicios;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio5 extends JFrame {

	public void ejercicio5() {
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Container

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// Button

		JButton boton = new JButton();
		boton.setText("+");

		// Label

		JLabel r = new JLabel();

		c.add(boton);
		c.add(r);

		// Acciones
		boton.addActionListener(new Ejercicio5Listener(r));
		
		setVisible(true);
	}

}
