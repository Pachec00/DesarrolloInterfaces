package examen.gui.login;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import examen.gui.AppController;
import examen.gui.bienvenido.BienvenidoController;
import examen.services.ExamenService;
import examen.services.LoginIncorrectoException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.util.converter.LocalDateStringConverter;

public class LoginController extends AppController {

	ExamenService es = new ExamenService();

	@FXML
	private Button acceder;

	@FXML
	private CheckBox chkBox;

	@FXML
	private DatePicker date;

	@FXML
	private TextField txtNombre;

	@FXML
	private PasswordField txtPass;

	private DateTimeFormatter formatter;

	@FXML
	void login(ActionEvent event) {
		try {

			es.login(txtNombre.getText(), txtPass.getText());
			irBienvenido(event);
		} catch (LoginIncorrectoException e) {
			Alert alerta = new Alert(AlertType.ERROR);
			alerta.setContentText("Usuario/Contraseña incorrectos");
			alerta.setTitle("Error en login");
			alerta.setHeaderText("Login incorrecto");
			alerta.showAndWait();
		}
	}

	@FXML
	void aceptar(ActionEvent event) {
		if (chkBox.isSelected()) {
			acceder.setDisable(false);
		} else {
			acceder.setDisable(true);
		}
	}

	@FXML
	public void initialize() {
		formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		date.setConverter(new LocalDateStringConverter(formatter, formatter));

		LocalDate fecha = LocalDate.now();
		date.setValue(fecha);

	}

	public void irBienvenido(ActionEvent event) {
		String nombre = txtNombre.getText();
		cargarVista(FXML_BIENVENIDO);

		BienvenidoController controller = (BienvenidoController) cambiarVista(FXML_BIENVENIDO);
		controller.setNombreYFecha(nombre, date.getValue());

	}

}
