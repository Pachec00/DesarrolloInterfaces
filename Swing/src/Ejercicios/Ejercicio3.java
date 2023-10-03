package Ejercicios;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio3 extends JFrame {

	public void ejercicio3() {
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Layout

		GridLayout grid = new GridLayout(4, 1);

		// Button

		JButton boton1 = new JButton();
		JButton boton2 = new JButton();
		JButton boton3 = new JButton();

		boton1.setText("1");
		boton2.setText("2");
		boton3.setText("3");

		// Label
		JLabel resultado = new JLabel();

		// Contenedor

		Container c = getContentPane();
		c.setLayout(grid);

		c.add(boton1);
		c.add(boton2);
		c.add(boton3);
		c.add(resultado);

		// Acciones
		
		boton1.addActionListener(new BotonPulsadoListener(resultado));
		boton2.addActionListener(new BotonPulsadoListener(resultado));
		boton3.addActionListener(new BotonPulsadoListener(resultado));
		
		
		

		setVisible(true);
	}

}
