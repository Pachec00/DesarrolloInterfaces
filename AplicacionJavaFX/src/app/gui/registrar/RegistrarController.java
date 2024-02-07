package app.gui.registrar;

import app.gui.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistrarController extends AppController {

	@FXML
	private Button login;

	@FXML
	private Button salir;

	@FXML
	private TextField txtEmail;

	@FXML
	private TextField txtNombre;

	@FXML
	private PasswordField txtPass;

	@FXML
	void continuar(ActionEvent event) {
		/*
		 * Si el correo o usuario ya existe avisar con pop up
		 * Si todo esta correcto iniciar sesion directamente
		 * 
		 */
	}

	@FXML
	void login(ActionEvent event) {
		cambiarVista(FXML_LOGIN);
	}

	@FXML
	void salir(ActionEvent event) {
		System.exit(0);
	}
}
