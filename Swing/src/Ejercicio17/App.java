package Ejercicio17;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Ejercicio1.modelo.Pelicula;
import Ejercicio1.service.PeliculasServiceException;
import Ejercicio1.service.PeliculasServices;

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
		scrollPane.setBounds(147, 11, 442, 246);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		TableModel model = new TableModel();
		table.setModel(model);

		JCheckBox chcId = new JCheckBox("Id");
		chcId.setBounds(172, 328, 97, 23);
		frame.getContentPane().add(chcId);
		chcId.setSelected(true);

		JCheckBox chcTiTulo = new JCheckBox("Titulo");
		chcTiTulo.setBounds(319, 328, 97, 23);
		frame.getContentPane().add(chcTiTulo);
		chcTiTulo.setSelected(true);

		JCheckBox chcLong = new JCheckBox("Longitud");
		chcLong.setBounds(450, 328, 97, 23);
		frame.getContentPane().add(chcLong);
		chcLong.setSelected(true);

		JButton consultar = new JButton("Consultar");
		consultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PeliculasServices ps = new PeliculasServices();
				Pelicula p = new Pelicula();
				List<Pelicula> pe = new ArrayList<Pelicula>();

				model.getColumnas().clear();
				if (chcId.isSelected()) {
					model.getColumnas().add("ID");
				}
				if (chcTiTulo.isSelected()) {
					model.getColumnas().add("NOMBRE");
				}
				if (chcLong.isSelected()) {
					model.getColumnas().add("LONGITUD");
				}
				model.fireTableStructureChanged();
				model.fireTableDataChanged();

				try {
					pe = ps.consultarPeliculas();
					for (int i = 0; i < pe.size(); i++) {
						p = pe.get(i);
						p.getId();
						p.getTitulo();
						p.getLongitud();
						model.getPelicula().add(p);
						model.fireTableDataChanged();
					}

				} catch (PeliculasServiceException e1) {
					e1.printStackTrace();
				}
			}
		});
		consultar.setBounds(641, 30, 89, 23);
		frame.getContentPane().add(consultar);

		MouseListener mouseListener = new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				Integer column = table.columnAtPoint(e.getPoint());
				model.ordenar(column);
			}
		};
		table.getTableHeader().addMouseListener(mouseListener);
	}
}
