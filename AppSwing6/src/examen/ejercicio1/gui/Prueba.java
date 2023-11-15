package examen.ejercicio1.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import examen.ejercicio1.modelo.Coche;
import examen.ejercicio1.services.ExamenService;

public class Prueba {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba window = new Prueba();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(77, 39, 295, 142);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		TableModel model = new TableModel();
		table.setModel(model);
		
		JButton boton = new JButton("New button");
		boton.setBounds(178, 214, 89, 23);
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ExamenService es = new ExamenService();
				List<Coche> c = es.consultarCoches();
				for ( int i = 0; i < c.size(); i++) {
					model.getCoches().add(c.get(i));
					model.fireTableDataChanged();
				}
			}
		});
		frame.getContentPane().add(boton);
	}

}
