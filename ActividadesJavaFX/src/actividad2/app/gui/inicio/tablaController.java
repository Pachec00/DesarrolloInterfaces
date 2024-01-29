package actividad2.app.gui.inicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import actividad2.app.gui.modelo.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class tablaController {

	@FXML
	private TableView<Persona> table;

	@FXML
	private TableColumn<Persona, Integer> tableEdad;

	@FXML
	private TableColumn<Persona, String> tableNombre;

	private ObservableList<Persona> datos;

	public void initialize() {

		tableNombre.setCellValueFactory(new PropertyValueFactory<Persona, String>("nombre"));
		tableEdad.setCellValueFactory(new PropertyValueFactory<Persona, Integer>("edad"));
		
		datos = FXCollections.observableArrayList();
		table.setItems(datos);
		
		List<Persona> r = consultarPersonas();
		datos.setAll(r);
	}

	private List<Persona> consultarPersonas() {
		Persona p = new Persona();
		List<Persona> lista = new ArrayList<Persona>();
		
		for (int i = 0; i < 40; i++) {
			p.setNombre("Pepe");
			p.setEdad(100);
			lista.add(p);
		}
		return lista;
	}
}
