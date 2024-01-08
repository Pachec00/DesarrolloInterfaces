package actividad1.app.gui.login;

import actividad1.services.LoginDenegadoException;
import actividad1.services.LoginService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginController {
	
	LoginService ls = new LoginService();
	
    @FXML
    private TextField tfNombre;

    @FXML
    private PasswordField tfPass;
    
    @FXML
    private Label alerta;

    @FXML
    void login(ActionEvent event) {
    	try {
			ls.login(tfNombre.getText(), tfPass.getText());
			alerta.setText("Acceso correcto");
			alerta.setVisible(true);
		} catch (LoginDenegadoException e) {
			alerta.setText("Acceso incorrecto");
			alerta.setVisible(true);
			e.printStackTrace();
		}
    }

    @FXML
    void salir(ActionEvent event) {

    }

}
