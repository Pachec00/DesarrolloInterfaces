package gui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import modelo.Usuario;

public class TableModel extends AbstractTableModel{

	private List<String> columnas;
	private List<Usuario> user;
	
	public TableModel() {
		user = new ArrayList<Usuario>();
		columnas = new ArrayList<String>();
		columnas.add("Nombre");
		columnas.add("Edad");
	}
	
	
	
	public List<String> getColumnas() {
		return columnas;
	}



	public void setColumnas(List<String> columnas) {
		this.columnas = columnas;
	}



	public List<Usuario> getUser() {
		return user;
	}



	public void setUser(List<Usuario> user) {
		this.user = user;
	}



	@Override
	public int getRowCount() {
		return user.size();
	}

	@Override
	public int getColumnCount() {
		return columnas.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Usuario u = user.get(rowIndex);
		String nombreColumn = columnas.get(columnIndex);
		
		if(nombreColumn.equals("Nombre")) {
			return u.getNombre();
		}
		if(nombreColumn.equals("Edad")) {
			return u.getEdad();
		}
		return "Error";
	}

}
