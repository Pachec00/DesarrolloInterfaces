package Tablas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel{
	
	private List<Paises> paises;
	
	public TableModel() {
		paises = new ArrayList<Paises>();
	}
	@Override
	public int getRowCount() {
		return paises.size();
	}

	@Override
	public int getColumnCount() {
		return 3;
	}
	
	public String getColumnName(int column) {
		if (column == 0) {
			return "Codigo";
		}
		if ( column == 1) {
			return "Descripcion";
		}
		return "Poblacion";
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Paises paisFila = paises.get(rowIndex);
		if (columnIndex == 0) {
			return paisFila.getCodigo();
		}
		if (columnIndex == 1) {
			return paisFila.getNombre();
		}
		return paisFila.getPoblacion();
	}
	
	public List<Paises> getPaises(){
		return paises;
	}

}
