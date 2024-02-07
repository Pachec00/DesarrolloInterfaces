package app.gui.proyectos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import modelo.Proyecto;

public class ProyectoController {

	 @FXML
	    private MenuItem ajustesItem;

	    @FXML
	    private Menu menuAjustes;

	    @FXML
	    private Menu menuPerfil;

	    @FXML
	    private Menu menuProyecto;

	    @FXML
	    private MenuItem perfilItem;

	    @FXML
	    private MenuItem proyectoItem;

	    @FXML
	    private MenuItem salirItem;

	    @FXML
	    private MenuItem sesionItem;

	    @FXML
	    private TableView<Proyecto> table;

	    @FXML
	    private TableColumn<Proyecto, String> tableEstadoItem;

	    @FXML
	    private TableColumn<Proyecto, String> tableProyectoItem;

	    @FXML
	    void ajustes(ActionEvent event) {

	    }

	    @FXML
	    void editar(ActionEvent event) {

	    }

	    @FXML
	    void nuevo(ActionEvent event) {

	    }

	    @FXML
	    void salir(ActionEvent event) {

	    }

	    @FXML
	    void sesion(ActionEvent event) {

	    }
}
