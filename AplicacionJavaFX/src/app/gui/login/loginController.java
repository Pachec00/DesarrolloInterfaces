package app.gui.login;

import java.security.NoSuchAlgorithmException;

import app.gui.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import modelo.Usuario;
import service.UsuarioService;

public class loginController extends AppController {

	@FXML
	private Button entrar;

	@FXML
	private Hyperlink forgot;

	@FXML
	private CheckBox recordar;

	@FXML
	private Button registrar;

	@FXML
	private Button salir;

	@FXML
	private TextField txtNombre;

	@FXML
	private PasswordField txtPass;

	@FXML
	void entrar(ActionEvent event) throws NoSuchAlgorithmException {
		Usuario user = new Usuario();
		UsuarioService us = new UsuarioService();

		user.setNombre(txtNombre.getText());
		user.setPass(txtPass.getText());

		String pass = us.encriptarPass(user.getPass());

		Usuario usuarioCon = new Usuario();
		usuarioCon = us.consultarUsuario(user.getNombre());

		if (usuarioCon.getNombre().equals(user.getNombre()) && usuarioCon.getPass().equals(pass)) {
			if(recordar.isSelected()) {
				//Guardar datos
			}
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

	@FXML
	void registrar(ActionEvent event) {
		cambiarVista(FXML_REGISTRAR);
	}

	@FXML
	void salir(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void restablecer(ActionEvent event) {

	}

	

	public void irProyectos(ActionEvent event) {

	}

}
