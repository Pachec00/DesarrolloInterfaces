package Ejercicio17;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Ejercicio1.modelo.Pelicula;
import Ejercicio1.service.PeliculasServiceException;
import Ejercicio1.service.PeliculasServices;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class App {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
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
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 790, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(145, 111, 442, 246);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		TableModel model = new TableModel();
		table.setModel(model);
		
		JButton consultar = new JButton("Consultar");
		consultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PeliculasServices ps = new PeliculasServices();
				Pelicula p = new Pelicula();
				List<Pelicula> pe = new ArrayList<Pelicula>();
				try {
					pe = ps.consultarPeliculas();
				} catch (PeliculasServiceException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		consultar.setBounds(308, 38, 89, 23);
		frame.getContentPane().add(consultar);
	}

}
