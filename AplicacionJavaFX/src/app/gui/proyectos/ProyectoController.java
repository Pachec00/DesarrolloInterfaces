package app.gui.proyectos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ProyectoController {

	@FXML
    private MenuItem ajustesItem;

    @FXML
    private ComboBox<?> combo;

    @FXML
    private Label lblNombre;

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
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> tableEstadoItem;

    @FXML
    private TableColumn<?, ?> tableProyectoItem;

    @FXML
    void ajustes(ActionEvent event) {

    }

    @FXML
    void consultarProyecto(ActionEvent event) {

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
