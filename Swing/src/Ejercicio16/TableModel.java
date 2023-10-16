package Ejercicio16;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel{

	private List<Usuario> usuarios;
	
	public TableModel() {
		usuarios = new ArrayList<Usuario>();
	}
	
	@Override
	public int getRowCount() {
		return usuarios.size();
	}

	@Override
	public int getColumnCount() {
		return 2;
	}
	
	public String getColumnName(int column) {
		if (column == 0) {
			return "Nombre";
		}
		return "Descripcion";
		
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Usuario usuarioFila = usuarios.get(rowIndex);
		if (columnIndex == 0) {
			return usuarioFila.getNombre();
		}
		return usuarioFila.getApellido();
	}
	
	public List<Usuario> getUsuario() {
		return usuarios;
	}

}
