package examen.gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import examen.modelo.Usuario;

public class Consultar extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTable table;
	private TableModel model;
	private JTextField Nombre;
	private JTextField Edad;
	private Usuario u = new Usuario();;

	public Consultar(App controller) {
		super(controller);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(78, 53, 269, 178);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		model = new TableModel();
		table.setModel(model);
		
		Nombre = new JTextField();
		Nombre.setBounds(52, 253, 86, 20);
		add(Nombre);
		Nombre.setColumns(10);
		u.setNombre(Nombre.getText());
		
		Edad = new JTextField();
		Edad.setBounds(167, 253, 86, 20);
		add(Edad);
		Edad.setColumns(10);
		u.setEdad(Edad.getText());
		
		JButton insertar = new JButton("Insertar");
		insertar.setBounds(71, 11, 89, 23);
		add(insertar);
		insertar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				List<Usuario> user = new ArrayList<Usuario>();
				
				model.getColumnas().clear();
				for (int i = 0; i < user.size(); i++) {
					u = user.get(i);
					u.getNombre();
					u.getEdad();
					model.getUser().add(u);
					model.fireTableDataChanged();
				}
			}
		});
		
		JButton clear = new JButton("Limpiar");
		clear.setBounds(238, 11, 89, 23);
		add(clear);
	}
}

