package actividad2.app.gui.inicio;

import actividad2.app.gui.AppController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ComboBoxController extends AppController {

	@FXML
	private ComboBox<String> combo;

	@FXML
	private Button imprimirtext;

	@FXML
	private Button limpiar;

	@FXML
	private TextField resultado;

	public void initialize() {

		combo.getItems().add("Blas");
		combo.getItems().add("Laura");
		combo.getItems().add("Oliver");

	}

	@FXML
	public void imprimir() {

		resultado.setText(combo.getSelectionModel().getSelectedItem());

	}

	@FXML
	public void limpiar() {

		resultado.setText("");
		combo.getSelectionModel().clearSelection();

	}

}
