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
    
    @FXML
    private MenuItem tableItem;
    
    @FXML
    public void combo(ActionEvent event) {
    	panel.setCenter(cargarVista(FXML_COMBO));
    }
    
    @FXML
    public void color(ActionEvent event) {
    	panel.setCenter(cargarVista(FXML_COLOR));
    }
    
    @FXML
    public void date(ActionEvent event) {
    	panel.setCenter(cargarVista(FXML_DATE));
    }
    
    @FXML
    public void slider(ActionEvent event) {
    	panel.setCenter(cargarVista(FXML_SLIDER));
    }
    
    @FXML
    public void cerrarSesion(ActionEvent event) {
    	panel.setCenter(cargarVista(FXML_LOGIN));
    }
    
    @FXML
    public void table(ActionEvent e) {
    	panel.setCenter(cargarVista(FXML_TABLE));
    }
    
    @FXML
    public void salir(ActionEvent event) {
    	System.exit(0);
    }

}