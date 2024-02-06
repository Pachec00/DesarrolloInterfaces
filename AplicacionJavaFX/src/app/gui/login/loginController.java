package app.gui.login;

import app.gui.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginController extends AppController {

	@FXML
	private Button entrar;

	@FXML
	private Button registrar;

	@FXML
	private Button salir;

	@FXML
	private TextField txtNombre;

	@FXML
	private PasswordField txtPass;

	@FXML
	void entrar(ActionEvent event) {
		
	}

	@FXML
	void registrar(ActionEvent event) {
		cambiarVista(FXML_REGISTRAR);
	}

	@FXML
	void salir(ActionEvent event) {
		System.exit(0);
	}

	public void irProyectos(ActionEvent event) {

	}
	
	
}
