package actividad3.app.gui.nuevo;

import actividad3.app.gui.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class nuevoController extends AppController {

	@FXML
	private Button continuar;

	@FXML
	private TextField textField;

	@FXML
	void continuar(ActionEvent event) {
		nuevo1Controller n =  (nuevo1Controller) cambiarVista(FXML_NUEVO1);
		
		n.cargarDatos(textField.getText());
	}
}
