package Ejercicio17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import Ejercicio1.modelo.Pelicula;

public class TableModel extends AbstractTableModel {

	private List<Pelicula> peliculas;
	private List<String> columnas;
	private Comparator<Pelicula> comparadorId = new Comparator<Pelicula>() {

		@Override
		public int compare(Pelicula o1, Pelicula o2) {
			return o1.getId().compareTo(o2.getId());
		}
	};
	private Comparator<Pelicula> comparadorNombre = new Comparator<Pelicula>() {

		@Override
		public int compare(Pelicula o1, Pelicula o2) {
			return o1.getTitulo().compareTo(o2.getTitulo());
		}
	};
	private Comparator<Pelicula> comparadorLong = new Comparator<Pelicula>() {

		@Override
		public int compare(Pelicula o1, Pelicula o2) {
			return o1.getLongitud().compareTo(o2.getLongitud());
		}
	};

	public TableModel() {
		peliculas = new ArrayList<Pelicula>();
		columnas = new ArrayList<String>();
		columnas.add("ID");
		columnas.add("NOMBRE");
		columnas.add("LONGITUD");
	}

	@Override
	public int getRowCount() {
		return peliculas.size();
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
		Pelicula peliculaFila = peliculas.get(rowIndex);
		String nombreColumn = columnas.get(columnIndex);
		if (nombreColumn.equals("ID")) {
			return peliculaFila.getId();
		}
		if (nombreColumn.equals("NOMBRE")) {
			return peliculaFila.getTitulo();
		}
		if (nombreColumn.equals("LONGITUD")) {
			return peliculaFila.getLongitud();
		}
		return "ERROR";
	}

	public List<Pelicula> getPelicula() {
		return peliculas;
	}

	public List<String> getColumnas() {
		return columnas;
	}

	public void ordenar(Integer column) {
		String nombreColumn = columnas.get(column);
		if (nombreColumn.equals("ID")) {
			peliculas.sort(comparadorId);
		}
		if (nombreColumn.equals("NOMBRE")) {
			peliculas.sort(comparadorNombre);
		}
		if (nombreColumn.equals("LONGITUD")) {
			peliculas.sort(comparadorLong);
		}
	}

}
