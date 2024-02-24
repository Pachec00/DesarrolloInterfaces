package app.gui.login;

import java.security.NoSuchAlgorithmException;

import app.gui.AppController;
import app.gui.proyectos.ProyectoController;
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
	private Hyperlink registrar;

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

		Usuario u = us.consultarUsuario(user.getNombre());

		String pass = us.encriptarPass(user.getPass());

		if (u.getNombre().equals(user.getNombre()) && u.getPass().equals(pass)) {
			ProyectoController controller = (ProyectoController) cambiarVista(FXML_PROYECTOS);
			controller.montarCombo(u);

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
		cambiarVista(FXML_RESTAURARPASS);

	}

}
