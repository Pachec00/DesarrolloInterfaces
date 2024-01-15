package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import modelo.Usuario;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class App {

	private JFrame frame;
	private JTable table;

	private Consultar c;
	private PBienvenida b;

	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem item;
	private JMenuItem item1;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c = new Consultar(this);
		b = new PBienvenida(this);

		table = new JTable();

		menuBar = new JMenuBar();
		menu = new JMenu();
		item = new JMenuItem();
		item1 = new JMenuItem();

		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		menuBar.setVisible(false);

		menu = new JMenu("Menu");
		menuBar.add(menu);

		item = new JMenuItem("Cerrar sesion");
		item.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				irBienvenida();
			}
		});
		menu.add(item);

		item1 = new JMenuItem("Salir");
		item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menu.add(item1);

		frame.setContentPane(b);
	}

	public void consultar(Usuario user) {
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(94, 11, 510, 314);
		frame.getContentPane().add(scrollPane);

		TableModel model = new TableModel();
		scrollPane.setViewportView(table);
		table.setModel(model);

		model.getUser().add(user);
		model.fireTableDataChanged();

	}

	public void irConsultar() {
		frame.setContentPane(c);
		menuBar.setVisible(true);
		item.setVisible(true);
		item1.setVisible(true);
		frame.revalidate();
	}

	public void irBienvenida() {
		frame.setContentPane(b);
		menuBar.setVisible(false);
		item.setVisible(false);
		item1.setVisible(false);
		frame.revalidate();
	}

}
