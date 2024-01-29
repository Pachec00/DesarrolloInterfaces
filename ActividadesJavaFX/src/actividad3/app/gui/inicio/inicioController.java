package actividad3.app.gui.inicio;

import java.util.List;

import actividad3.app.gui.AppController;
import actividad3.modelo.Animal;
import actividad3.service.AnimalesNotFoundException;
import actividad3.service.AnimalesServices;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

public class inicioController extends AppController{

	@FXML
	private Button consultar;

	@FXML
	private TableColumn<Animal, Integer> edadItem;

	@FXML
	private TableColumn<Animal, String> nombreItem;

	@FXML
	private Button nuevo;

	@FXML
	private BorderPane panel;

	@FXML
	private ProgressBar progressBar;

	@FXML
	private TableView<Animal> table;

	@FXML
	private TextField textField;

	@FXML
	private TableColumn<Animal, String> tipoItem;

	public ObservableList<Animal> datos;

	public void initialize() {
		tipoItem.setCellValueFactory(new PropertyValueFactory<Animal, String>("tipo"));
		nombreItem.setCellValueFactory(new PropertyValueFactory<Animal, String>("nombre"));
		edadItem.setCellValueFactory(new PropertyValueFactory<Animal, Integer>("edad"));

		datos = FXCollections.observableArrayList();
		table.setItems(datos);
	}

	@FXML
	public void consultar(ActionEvent event) {

		try {
			AnimalesServices as = new AnimalesServices();
			
			List<Animal> r =as.consultarAnimales(cargarTipo(textField.getText()));
			datos.setAll(r);
		} catch (AnimalesNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String cargarTipo(String tipo) {
		textField.setText(tipo);
		return tipo;
	}

	@FXML
	void nuevo(ActionEvent event) {
		cambiarVista(FXML_NUEVO);
	}

	@FXML
	void table(ActionEvent event) {

	}
}
