package actividad1.app.gui.login;

import actividad1.app.gui.AppController;
import actividad1.bienvenida.BienvenidaController;
import actividad1.modelo.Usuario;
import actividad1.services.LoginDenegadoException;
import actividad1.services.LoginService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginController extends AppController{
	
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
			Usuario usuario = ls.login(tfNombre.getText(), tfPass.getText());
			alerta.setText("Acceso correcto");
			alerta.setVisible(true);
			irBienvenida(event);
			
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
    
    public void irBienvenida(ActionEvent event) {
    	String nombre = tfNombre.getText();
    	cambiarVista(FXML_BIENVENIDA);
    	
    	BienvenidaController controller = (BienvenidaController) cambiarVista(FXML_BIENVENIDA);
    	controller.setNombreBienvenida(nombre);
    }

}
