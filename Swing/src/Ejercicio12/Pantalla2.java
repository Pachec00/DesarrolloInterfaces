package Ejercicio12;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla2 extends View {

	private static final long serialVersionUID = 1L;
	private JTextField txt;

	/**
	 * Create the panel.
	 */
	public Pantalla2(App controller) {
		super(controller);
		setLayout(null);
		
		JButton boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.irPantalla1(txt.getText());
			}
		});
		boton1.setBounds(10, 11, 206, 134);
		add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.setBounds(226, 11, 214, 134);
		add(boton2);
		boton2.setEnabled(false);
		
		JButton boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.irPantalla3(txt.getText());
			}
		});
		boton3.setBounds(10, 156, 206, 133);
		add(boton3);
		
		txt = new JTextField();
		txt.setBounds(226, 156, 214, 131);
		add(txt);
		txt.setColumns(10);

	}

	public void texto(String txt) {
		this.txt.setText(txt);
	}
}
