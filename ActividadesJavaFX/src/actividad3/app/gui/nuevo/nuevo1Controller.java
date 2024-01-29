package actividad3.app.gui.nuevo;

import actividad3.app.gui.AppController;
import actividad3.app.gui.inicio.inicioController;
import actividad3.modelo.Animal;
import actividad3.service.AnimalesServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class nuevo1Controller extends AppController{

	@FXML
    private Button guardar;

    @FXML
    private TextField textEdad;

    @FXML
    private TextField textNombre;
    
    private String tipo;

    @FXML
    void guardar(ActionEvent event) {
    	AnimalesServices as = new AnimalesServices();
    	Animal animal = new Animal();
    	animal.setTipo(tipo);
    	animal.setNombre(textNombre.getText());
    	animal.setEdad(Integer.parseInt(textEdad.getText()));
    	as.addAnimal(animal);
    	
    	
    	inicioController ini = (inicioController) cambiarVista(FXML_INICIO);
    	ini.cargarTipo(tipo);
    	ini.consultar(event);
    	
    }
    
    public void cargarDatos(String t) {
    	tipo = t;
    }
}
