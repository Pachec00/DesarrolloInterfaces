package actividad2.app.gui.login;

import actividad2.app.gui.AppController;
import actividad2.app.gui.inicio.InicioController;
import actividad2.app.gui.modelo.Usuario;
import actividad2.services.LoginDenegadoException;
import actividad2.services.LoginService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginController extends AppController {

	LoginService ls = new LoginService();

	@FXML
	private TextField tfNombre;

	@FXML
	private PasswordField tfPass;

	@FXML
	private Label alerta;

	@FXML
	private Label completo;

	@FXML
	void login(ActionEvent event) {
		try {
			// Usuario usuario = ls.login(tfNombre.getText(), tfPass.getText());
			Usuario usuario = ls.login(tfNombre.getText(), tfPass.getText());
			alerta.setText("Acceso correcto");
			alerta.setVisible(true);
			irInicio(event);

			completo.setText(usuario.getNombre() + "--" + usuario.getFechaRegistro());
		} catch (LoginDenegadoException e) {
			alerta.setText("Acceso incorrecto");
			alerta.setVisible(true);

		}
	}

	@FXML
	void salir(ActionEvent event) {
		System.exit(0);
	}

	public void irInicio(ActionEvent event) {

		cambiarVista(FXML_INICIO);

	}

}
