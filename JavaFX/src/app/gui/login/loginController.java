package app.gui.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loginController {

    @FXML
    private Label alerta;

    @FXML
    private TextField tfNombre;

    @FXML
    void escribirTexto(ActionEvent event) {
    	if(tfNombre.getText().isBlank()) {
    		alerta.setText("Escribe algo");
    		alerta.setVisible(true);
    	}else {
    		System.out.println(tfNombre.getText());
    		alerta.setVisible(false);
    	}
    }
    
    

}