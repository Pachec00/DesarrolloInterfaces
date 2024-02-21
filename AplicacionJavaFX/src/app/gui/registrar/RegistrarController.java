package app.gui.registrar;

import java.security.NoSuchAlgorithmException;

import app.gui.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import modelo.Usuario;
import service.UsuarioService;

public class RegistrarController extends AppController {

	@FXML
    private Hyperlink login;

	@FXML
	private Button salir;

	@FXML
	private TextField txtEmail;

	@FXML
	private TextField txtNombre;

	@FXML
	private PasswordField txtPass;

	@FXML
	void continuar(ActionEvent event) throws NoSuchAlgorithmException {
		/*
		 * Si el correo o usuario ya existe avisar con pop up
		 * Si todo esta correcto iniciar sesion directamente
		 * No dejar insertar con alguno de los campos vacios 
		 */
		
		if(!txtNombre.getText().isEmpty() && !txtPass.getText().isEmpty()) {
			Usuario user = new Usuario();
			user.setNombre(txtNombre.getText());
			user.setEmail(txtEmail.getText());
			user.setPass(txtPass.getText());
			
			UsuarioService us = new UsuarioService();
			us.insertarUsuario(user);
		}else {
			//Lanzar popup
		}
		
		
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
