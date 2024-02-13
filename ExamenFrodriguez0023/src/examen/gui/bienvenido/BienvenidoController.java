package examen.gui.bienvenido;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import examen.gui.AppController;
import examen.modelo.Coche;
import examen.services.ExamenService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class BienvenidoController extends AppController {

	@FXML
	private Button btnFiltro;

	@FXML
	private Button btnSalir;

	@FXML
	private ComboBox<String> combo;

	@FXML
	private Label lblFecha;

	@FXML
	private Label lblUser;

	@FXML
	private TableView<Coche> table;

	@FXML
	private TextField txtFiltro;

	@FXML
	private TableColumn<Coche, String> marca;

	@FXML
	private TableColumn<Coche, String> matricula;

	@FXML
	private TableColumn<Coche, String> modelo;

	public ObservableList<Coche> datos;

	@FXML
	void filtrar(ActionEvent event) {
		ExamenService es = new ExamenService();

		List<Coche> lista = es.consultarCoches(combo.getSelectionModel().getSelectedItem(), txtFiltro.getText());
		datos.setAll(lista);
	}

	@FXML
	void salir(ActionEvent event) {
		irLogin();
	}

	@FXML
	public void initialize() {
		marca.setCellValueFactory(new PropertyValueFactory<Coche, String>("marca"));
		matricula.setCellValueFactory(new PropertyValueFactory<Coche, String>("matricula"));
		modelo.setCellValueFactory(new PropertyValueFactory<Coche, String>("modelo"));

		datos = FXCollections.observableArrayList();
		table.setItems(datos);

		combo.getItems().add("Toyota");
		combo.getItems().add("Seat");
		combo.getItems().add("Renault");
	}

	@FXML
	void consultar(ActionEvent event) {
		ExamenService es = new ExamenService();

		List<Coche> lista = es.consultarCoches(combo.getSelectionModel().getSelectedItem(), txtFiltro.getText());
		datos.setAll(lista);
		btnFiltro.setDisable(false);
	}

	public void setNombreYFecha(String nombre, LocalDate fecha) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
		String formattedString = fecha.format(formatter);
		lblUser.setText(nombre + " - " + fecha);
	}

	public void irLogin() {
		cambiarVista(FXML_LOGIN);
	}
}
