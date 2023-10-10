package Ejercicio12_13_14_15;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

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
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton1.setBounds(49, 168, 66, 32);
		add(boton1);
		boton1.setEnabled(false);
		
		JButton boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.irPantalla2(txt.getText());
				
			}
		});
		boton2.setBounds(160, 168, 66, 32);
		add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.irPantalla3(txt.getText());
			}
		});
		boton3.setBounds(286, 167, 85, 34);
		add(boton3);
		
		txt = new JTextField();
		txt.setBounds(112, 69, 175, 49);
		add(txt);
		txt.setColumns(10);
		

	}
	
	public void texto(String txt) {
		this.txt.setText(txt);
	}
}
