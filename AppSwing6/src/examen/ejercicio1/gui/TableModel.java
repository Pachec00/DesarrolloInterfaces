package examen.ejercicio1.gui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import examen.ejercicio1.modelo.Coche;
import examen.ejercicio1.services.ExamenService;

public class TableModel extends AbstractTableModel {

	private List<String> columnas;
	private List<Coche> coches;

	public TableModel() {
		coches = new ArrayList<Coche>();
		columnas = new ArrayList<String>();
		columnas.add("Marca");
		columnas.add("Modelo");
		columnas.add("Matricula");
		columnas.add("Año");
		columnas.add("Disponible");
	}

	@Override
	public int getRowCount() {
		return coches.size();
	}

	@Override
	public int getColumnCount() {
		return columnas.size();
	}

	public List<String> getColumnas() {
		return columnas;
	}

	public void setColumnas(List<String> columnas) {
		this.columnas = columnas;
	}

	public List<Coche> getCoches() {
		return coches;
	}

	public void setCoches(List<Coche> coches) {
		this.coches = coches;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		ExamenService es = new ExamenService();
		coches = es.consultarCoches();
		Coche coche = coches.get(rowIndex);
		String nombreColumn = columnas.get(columnIndex);
		return "Error";
	}

}
