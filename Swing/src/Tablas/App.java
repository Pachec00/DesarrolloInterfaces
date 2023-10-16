package Tablas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
		frame.setBounds(100, 100, 639, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(99, 38, 382, 294);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		TableModel model = new TableModel();
		table.setModel(model);
		
		JButton añadir = new JButton("Añadir");
		añadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Paises pais = new Paises();
				pais.setCodigo("ES");
				pais.setNombre("Paña!!");
				pais.setPoblacion(45000000);
				model.getPaises().add(pais);
				model.fireTableDataChanged();
			}
		});
		añadir.setBounds(320, 356, 89, 23);
		frame.getContentPane().add(añadir);
	}
}
