package app.gui.proyectos;

import java.util.List;
import java.util.Optional;

import app.gui.AppController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import modelo.Persona;
import service.PersonasService;

public class Pantalla1Controller extends AppController{

	@FXML
	private TableView<Persona> tablaPersonas;

	@FXML
    private TableColumn<Persona, String> columnDni;

    @FXML
    private TableColumn<Persona, Integer> columnEdad;

    @FXML
    private TableColumn<Persona, String> columnNombre;
    
    @FXML
    private ProgressBar progreso;


    private ObservableList<Persona> datos;
    
    
    @FXML
    public void initialize(){
    	columnDni.setCellValueFactory(new PropertyValueFactory<Persona, String>("dni"));
    	columnEdad.setCellValueFactory(new PropertyValueFactory<Persona, Integer>("edad"));
    	columnNombre.setCellValueFactory(new PropertyValueFactory<Persona, String>("nombre"));
    	
    	datos = FXCollections.observableArrayList();
    	tablaPersonas.setItems(datos);
    }
    public void editar() {
    	if(!tablaPersonas.getSelectionModel().isEmpty()) {
    		editarPersonaSeleccionada();
    	}
    }
    
    public void editarPersonaSeleccionada() {
    	Integer index = tablaPersonas.getSelectionModel().getSelectedIndex();
    	Persona persona = tablaPersonas.getItems().get(index);
    	TextInputDialog dialog = new TextInputDialog();
    	dialog.setTitle("Editar");
    	dialog.setHeaderText("Indica el nuevo nombre de la persona");
    	dialog.setContentText("Nombre");
    	Optional<String> result = dialog.showAndWait();
    	if (!result.isEmpty()) {
    		persona.setNombre(result.get());
    		datos.set(index, persona);
    	}
    }
    
    
    public void añadirPersona() {
    	
    	
    	Task<Void> task = new Task<Void>() {
			
    		List<Persona> personas;
    		
			@Override
			protected Void call() throws Exception {
				personas = new PersonasService().getPersonas();
				return null;
			}
			
			@Override
			protected void succeeded() {
				super.succeeded();
				datos.addAll(personas);
				updateProgress(100, 100);
			}
			
			@Override
			protected void failed() {
				super.failed();
				updateProgress(100, 100);
				Alert a = new Alert(AlertType.ERROR);
				a.setHeaderText("Error!!!");
				a.show();
			}
			
		};

		
		new Thread(task).start();
		progreso.progressProperty().bind(task.progressProperty());
    	
    	
    	
    }
    
    public void dobleClick(MouseEvent event) {
    	if (event.getClickCount() == 2) {
    		editarPersonaSeleccionada();
    	}
    }
	
    
    
    
    
	
}
