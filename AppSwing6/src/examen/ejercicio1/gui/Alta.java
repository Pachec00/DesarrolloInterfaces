package examen.ejercicio1.gui;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;

public class Alta extends View{
	
	private JMenuBar menuBar;
	

	
	private static final long serialVersionUID = 1L;
	private JTextField txtMarca;

	public Alta(App controller) {
		super(controller);
		setLayout(null);
		
		menuBar = new JMenuBar();
		
		JLabel lblNewLabel = new JLabel("Nombre marca");
		lblNewLabel.setBounds(83, 116, 85, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Marcas");
		lblNewLabel_1.setBounds(83, 178, 46, 14);
		add(lblNewLabel_1);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(168, 113, 86, 20);
		add(txtMarca);
		txtMarca.setColumns(10);
		
		JComboBox comboMarca = new JComboBox();
		comboMarca.setBounds(139, 178, 63, 22);
		add(comboMarca);
		comboMarca.addItem("Seat");
		comboMarca.addItem("Toyota");
		comboMarca.addItem("Renault");
		
		JButton añadir = new JButton("Añadir");
		añadir.setBounds(316, 149, 89, 23);
		add(añadir);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 11, 101, 22);
		add(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem menuConsultar = new JMenuItem("Consultar");
		menuConsultar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0));
		mnMenu.add(menuConsultar);
		
		JMenuItem menuCerrar = new JMenuItem("Cerrar sesión");
		menuCerrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0));
		mnMenu.add(menuCerrar);
		
		JMenuItem menuSalir = new JMenuItem("Salir");
		menuSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0));
		mnMenu.add(menuSalir);
	}
}
