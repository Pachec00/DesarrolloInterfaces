package actividad1.bienvenida;

import actividad1.app.gui.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class BienvenidaController extends AppController{

	@FXML
	private Label lblBienvenida;
	
	@FXML
	private BorderPane panel;
	
	@FXML
    public void salir(ActionEvent event) {
		cambiarVista(FXML_LOGIN);
    }
	
	public void setNombreBienvenida(String nombre) {
		lblBienvenida.setText("Bienvenido " + nombre);
		
	}
	
	@FXML
    void irPantalla1(ActionEvent event) {
		panel.setCenter(cargarVista(FXML_PANTALLA1));
    }

    @FXML
    void irPantalla2(ActionEvent event) {
    	panel.setCenter(cargarVista(FXML_PANTALLA2));
    }
}
