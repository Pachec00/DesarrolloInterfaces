package Ejercicio17;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import Ejercicio1.modelo.Pelicula;

public class TableModel extends AbstractTableModel {

	private List<Pelicula> peliculas;

	public TableModel() {
		peliculas = new ArrayList<Pelicula>();
	}

	@Override
	public int getRowCount() {
		return peliculas.size();
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	public String getColumnName(int column) {
		if (column == 0) {
			return "Id";
		}
		if (column == 1) {
			return "Titulo";
		}
		return "Longitud";
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Pelicula peliculaFila = peliculas.get(rowIndex);
		if (columnIndex == 0) {
			return peliculaFila.getId();
		}
		if (columnIndex == 1) {
			return peliculaFila.getTitulo();
		}
		return peliculaFila.getLongitud();
	}

	public List<Pelicula> getPelicula() {
		return peliculas;
	}

}
