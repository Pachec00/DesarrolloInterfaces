package actividad2.app.gui.inicio;

import actividad2.app.gui.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class InicioController extends AppController{

    @FXML
    private MenuItem colorPickerItem;

    @FXML
    private MenuItem comboBoxItem;

    @FXML
    private MenuItem datePickerItem;

    @FXML
    private Label idMensaje;

    @FXML
    private Menu menuApp;

    @FXML
    private Menu menuComponentes;

    @FXML
    private BorderPane panel;

    @FXML
    private MenuItem salirItem;

    @FXML
    private MenuItem sesionItem;

    @FXML
    private MenuItem sliderItem;
    
    
    public void combo(ActionEvent event) {
    	panel.setCenter(cargarVista(FXML_COMBO));
    }
    
    
    public void color(ActionEvent event) {
    	panel.setCenter(cargarVista(FXML_COLOR));
    }
    
    
    public void date(ActionEvent event) {
    	panel.setCenter(cargarVista(FXML_DATE));
    }
    
    
    public void slider(ActionEvent event) {
    	panel.setCenter(cargarVista(FXML_SLIDER));
    }
    
    public void cerrarSesion(ActionEvent event) {
    	panel.setCenter(cargarVista(FXML_LOGIN));
    }
    
    public void salir(ActionEvent event) {
    	System.exit(0);
    }

}