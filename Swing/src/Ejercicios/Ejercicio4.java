package Ejercicios;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio4 extends JFrame{

	public void ejercicio4() {
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
		ActionListener l1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				b.setText(b.getText() + "!");

				resultado.setText("Has pulsado el boton " + e.getActionCommand());

			}
		};
		
		
		MouseListener m = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				b.setBackground(null);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				b.setBackground(Color.YELLOW);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		boton1.addMouseListener(m);
		boton2.addMouseListener(m);
		boton3.addMouseListener(m);
		boton1.addActionListener(l1);
		boton2.addActionListener(l1);
		boton3.addActionListener(l1);

		setVisible(true);

	}
	
	

	
}
