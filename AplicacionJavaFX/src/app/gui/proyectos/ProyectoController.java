package app.gui.proyectos;

import java.util.ArrayList;
import java.util.List;

import app.gui.AppController;
import app.gui.tareas.TareaController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import modelo.Proyecto;
import modelo.Tarea;
import modelo.Usuario;
import service.ProyectoService;

public class ProyectoController extends AppController {

	@FXML
	private MenuItem ajustesItem;

	@FXML
	private ComboBox<String> combo;

	@FXML
	private TableColumn<Tarea, String> descColumn;

	@FXML
	private TableColumn<Tarea, String> estadoColumn;

	@FXML
	private TableColumn<Tarea, String> finColumn;

	@FXML
	private TableColumn<Tarea, String> inicioColumn;

	@FXML
	private TableColumn<Tarea, String> colorColumn;

	@FXML
	private Label lblNombre;

	@FXML
	private Menu menuAjustes;

	@FXML
	private Menu menuPerfil;

	@FXML
	private Menu menuProyecto;

	@FXML
	private TableColumn<Tarea, String> nombreColumn;

	@FXML
	private MenuItem perfilItem;

	@FXML
	private MenuItem proyectoItem;

	@FXML
	private MenuItem salirItem;

	@FXML
	private MenuItem sesionItem;

	@FXML
	private TableView<Tarea> table;

	@FXML
	private TableColumn<Tarea, String> importanciaColumn;

	@FXML
	private Button nuevaTarea;

	@FXML
	private Button btnEditar;

	private ObservableList<Tarea> datos;

	private Usuario usuario;

	private List<Proyecto> listaProyectos;

	private String titulo;

	@FXML
	void ajustes(ActionEvent event) {

	}

	@FXML
	public void initialize() {
		PropertyValueFactory<Tarea, String> factoryNombre = new PropertyValueFactory<>("nombre");
		PropertyValueFactory<Tarea, String> factoryDesc = new PropertyValueFactory<>("descripcion");
		PropertyValueFactory<Tarea, String> factoryEstado = new PropertyValueFactory<>("estado");
		PropertyValueFactory<Tarea, String> factoryImportancia = new PropertyValueFactory<>("importancia");
		PropertyValueFactory<Tarea, String> factoryInicio = new PropertyValueFactory<>("inicio");
		PropertyValueFactory<Tarea, String> factoryFin = new PropertyValueFactory<>("fin");
		PropertyValueFactory<Tarea, String> factoryColor = new PropertyValueFactory<>("color");

		nombreColumn.setCellValueFactory(factoryNombre);
		descColumn.setCellValueFactory(factoryDesc);
		estadoColumn.setCellValueFactory(factoryEstado);
		importanciaColumn.setCellValueFactory(factoryImportancia);
		finColumn.setCellValueFactory(factoryInicio);
		inicioColumn.setCellValueFactory(factoryFin);
		colorColumn.setCellValueFactory(factoryColor);

		// Pasar fechas a string

		datos = FXCollections.observableArrayList();
		table.setItems(datos);

	}

	@FXML
	void consultarProyecto(ActionEvent event) {
		titulo = combo.getSelectionModel().getSelectedItem();
		lblNombre.setText(titulo.toUpperCase());

		List<Tarea> listaT = new ArrayList<>();

		for (Proyecto p : listaProyectos) {
			if (p.getTitulo().equals(titulo)) {
				for (Tarea t : p.getListaTareas()) {
					listaT.add(t);
				}
			}
		}

		datos.setAll(listaT);

	}

	public void montarCombo(Usuario user) {
		ProyectoService ps = new ProyectoService();
		List<Proyecto> lista = ps.consultarProyecto(user.getEmail());
		listaProyectos = lista;

		for (Proyecto p : lista) {
			combo.getItems().add(p.getTitulo());
		}

		lblNombre.setText("Bienvenido " + user.getNombre());

		usuario = user;

	}

	@FXML
	void editar(ActionEvent event) {

	}

	@FXML
	void nuevo(ActionEvent event) {
		NuevoProyectoController controller = (NuevoProyectoController) cambiarVista(FXML_NUEVO_PROYECTOS);
		controller.getUserData(usuario);

	}

	@FXML
	void salir(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void sesion(ActionEvent event) {
		cambiarVista(FXML_LOGIN);
	}

	@FXML
	void tareaNueva(ActionEvent event) {
		TareaController controller = (TareaController) cambiarVista(FXML_NUEVA_TAREA);

		for (Proyecto p : listaProyectos) {
			if (p.getTitulo().equals(combo.getSelectionModel().getSelectedItem())) {
				controller.getData(p, usuario.getEmail(), usuario);

			}
		}
	}

	@FXML
	void editarTarea(ActionEvent event) {
		TareaController controller = (TareaController) cambiarVista(FXML_NUEVA_TAREA);

		for (Proyecto p : listaProyectos) {
			if (p.getTitulo().equals(combo.getSelectionModel().getSelectedItem())) {
				controller.getData(p, usuario.getEmail(), usuario);

			}
		}
	}

}
