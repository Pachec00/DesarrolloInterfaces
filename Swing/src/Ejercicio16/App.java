package Ejercicio16;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class App {

	private JFrame frame;
	private JTable table;
	private JTextField nombreTxt;
	private JTextField apellidoTxt;

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
		frame.setBounds(100, 100, 721, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(156, 108, 384, 227);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		TableModel model = new TableModel();
		table.setModel(model);

		nombreTxt = new JTextField();
		nombreTxt.setBounds(172, 48, 86, 20);
		frame.getContentPane().add(nombreTxt);
		nombreTxt.setColumns(10);

		apellidoTxt = new JTextField();
		apellidoTxt.setBounds(354, 48, 86, 20);
		frame.getContentPane().add(apellidoTxt);
		apellidoTxt.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(180, 23, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(375, 23, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		KeyListener k1 = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (!nombreTxt.getText().isEmpty()) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						e.getComponent().transferFocus();

					}
				}
				
				

			}

		};

		nombreTxt.addKeyListener(k1);
		
		
		
		KeyListener k2 = new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (!apellidoTxt.getText().isEmpty()) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						Usuario u = new Usuario();
						u.setNombre(nombreTxt.getText());
						u.setApellido(apellidoTxt.getText());
						model.getUsuario().add(u);
						model.fireTableDataChanged();
					}
				}
				
			}
		};
		
		
		
		
		
		apellidoTxt.addKeyListener(k2);

		JButton añadir = new JButton("Añadir");
		añadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		añadir.setBounds(528, 47, 89, 23);
		frame.getContentPane().add(añadir);
	}

}
