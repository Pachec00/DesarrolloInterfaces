package app.gui.recuperacion;

import java.security.NoSuchAlgorithmException;

import app.gui.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import modelo.Usuario;
import service.UsuarioService;

public class RecuperarPassController extends AppController {

	@FXML
	private Button confirmar;

	@FXML
	private PasswordField pass1;

	@FXML
	private PasswordField pass2;

	@FXML
	private Button salir;

	@FXML
	private Button consultar;

	@FXML
	private Label lblPass1;

	@FXML
	private Label lblPass2;

	@FXML
	private TextField txtEmail;

	@FXML
	void consultar(ActionEvent event) {
		// Consultar email
		UsuarioService us = new UsuarioService();

		Usuario user = us.consultarEmail(txtEmail.getText());

		if(user.getEmail().equals(txtEmail.getText())) {
			pass1.setDisable(false);
			pass2.setDisable(false);
			confirmar.setDisable(false);
		}
	}

	@FXML
	void confirmar(ActionEvent event) throws NoSuchAlgorithmException {
		UsuarioService us = new UsuarioService();

		String email = txtEmail.getText();
		String pass = pass1.getText();

		// Update en la BBDD

		if (pass1.getText().equals(pass2.getText())) {
			us.updateUsuarioPass(email,pass);
		}

	}

	@FXML
	void salir(ActionEvent event) {
		System.exit(0);
	}
}
