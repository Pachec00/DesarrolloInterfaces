package Ejercicios;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio2 extends JFrame {

	public void ejercio2() {
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Layout

		GridLayout grid = new GridLayout(4, 2);

		// Label

		JLabel nombre = new JLabel();
		JLabel dni = new JLabel();
		JLabel fecha = new JLabel();

		nombre.setText("Nombre");
		dni.setText("DNI");
		fecha.setText("Fecha de nacimiento");

		// TextField
		JTextField tNombre = new JTextField(20);
		JTextField tDni = new JTextField();
		JTextField tFecha = new JTextField(4);

		// JButton
		JButton aceptar = new JButton();
		JButton cancelar = new JButton();
		aceptar.setText("Aceptar");
		cancelar.setText("Cancelar");

		// Contenedor

		Container c = getContentPane();
		JPanel panelFecha = new JPanel();
		JPanel panelAceptar = new JPanel();
		panelAceptar.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JPanel panelCancelar = new JPanel();
		panelCancelar.setLayout(new FlowLayout(FlowLayout.LEFT));

		c.setLayout(grid);

		c.add(nombre);
		c.add(tNombre);

		c.add(dni);
		c.add(tDni);
		
		c.add(fecha);
		c.add(panelFecha);
		panelFecha.add(new JTextField(2));
		panelFecha.add(new JLabel("/"));
		panelFecha.add(new JTextField(2));
		panelFecha.add(new JLabel("/"));
		panelFecha.add(new JTextField(2));

		c.add(panelAceptar);
		panelAceptar.add(aceptar);
		
		c.add(panelCancelar);
		panelCancelar.add(cancelar);

		setVisible(true);
	}
}
