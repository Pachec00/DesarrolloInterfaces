package examen.gui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import examen.modelo.Usuario;

public class TableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private List<String> columnas;
	private List<Usuario> user;
	
	public TableModel() {
		user = new ArrayList<Usuario>();
		columnas = new ArrayList<String>();
		columnas.add("Nombre");
		columnas.add("Edad");
	}
	
	@Override
	public int getRowCount() {
		return user.size();
	}

	@Override
	public int getColumnCount() {
		return columnas.size();
	}

	public String getColumnName(int column) {
		return columnas.get(column);
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Usuario u = user.get(rowIndex);
		if(columnIndex == 0) {
			return u.getNombre();
		}
		return u.getEdad();
	}
	
	public List<Usuario> getUser(){
		return user;
	}
	
	public List<String> getColumnas() {
		return columnas;
	}

}
