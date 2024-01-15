package examen.ejercicio1.gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import examen.ejercicio1.modelo.Coche;

public class Consultar extends View {

	private JTable table;
	
	private static final long serialVersionUID = 1L;

	public Consultar(App controller) {
		super(controller);
		setLayout(null);
		
		
		
		JButton consultar = new JButton("Consultar");
		consultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.consultar();
				
			}
		});
		consultar.setBounds(211, 338, 89, 23);
		add(consultar);
		
		
		
		
	}
}
