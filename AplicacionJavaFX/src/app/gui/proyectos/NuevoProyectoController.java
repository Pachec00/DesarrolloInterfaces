package app.gui.proyectos;

import java.util.ArrayList;
import java.util.List;

import app.gui.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import modelo.Proyecto;
import modelo.Tarea;
import modelo.Usuario;
import service.ProyectoService;

public class NuevoProyectoController extends AppController {

	@FXML
	private Button btnaAceptar;

	@FXML
	private Button btntCancelar;

	@FXML
	private TextField txtTitulo;

	private Usuario usuario;

	@FXML
	void aceptar(ActionEvent event) {
		// Insertar proyecto

		Proyecto proyecto = new Proyecto();
		ProyectoService ps = new ProyectoService();
		List<Tarea> litaT = new ArrayList<>();

		proyecto.setTitulo(txtTitulo.getText());
		proyecto.setUserEmail(usuario.getEmail());
		proyecto.setListaTareas(litaT);

		ps.insertarProyecto(proyecto);

		// Se le pasa de nuevo los datos del usuario para cargar los datos
		ProyectoController controller = (ProyectoController) cambiarVista(FXML_PROYECTOS);
		controller.montarCombo(usuario);
	}

	public void getUserData(Usuario user) {
		usuario = user;
	}

	@FXML
	void cancelar(ActionEvent event) {
		// Se le vuelven a pasar los datos del usuario para cargar los datos
		ProyectoController controller = (ProyectoController) cambiarVista(FXML_PROYECTOS);
		controller.montarCombo(usuario);
	}
}
