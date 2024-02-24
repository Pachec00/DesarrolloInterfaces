package app.gui.tareas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import app.gui.AppController;
import app.gui.proyectos.ProyectoController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import modelo.Proyecto;
import modelo.Tarea;
import modelo.Usuario;
import service.ProyectoService;

public class TareaController extends AppController {

	@FXML
	private Button aceptar;

	@FXML
	private TextField txtTitulo;

	@FXML
	private Button volver;

	@FXML
	private Button btntBorrar;

	@FXML
	private ColorPicker colorPicker;

	@FXML
	private ComboBox<String> comboEs;

	@FXML
	private ComboBox<String> comboImp;

	@FXML
	private TextField txtDesc;

	@FXML
	private DatePicker FM;

	@FXML
	private TextField txtFR;

	private Proyecto proyecto;

	private String userEmail;

	private List<Proyecto> listaP;

	private Usuario user;

	private DateTimeFormatter formatter;

	@FXML
	void aceptar(ActionEvent event) {
		// Se borrar el proyecto
		// Se crea uno nuevo con la lista actualizada

		ProyectoService ps = new ProyectoService();
		// ps.borrarProyecto(proyecto.getId().toString());

		List<Tarea> listaT = new ArrayList<>();
		Tarea t = new Tarea();
		t.setNombre(txtTitulo.getText());
		t.setDescripcion(txtDesc.getText());

		LocalDate date = FM.getValue();
		t.setFin(date.toString());

		t.setInicio(LocalDate.now().toString());

		// comboBox Estado

		t.setEstado(comboEs.getSelectionModel().getSelectedItem());

		// comboBox Importancia

		t.setImportancia(comboImp.getSelectionModel().getSelectedItem());

		// color

		t.setColor(colorPicker.getValue().toString());

		listaT.add(t);

		ps.updateTarea(t, proyecto.getTitulo());

		ProyectoController controller = (ProyectoController) cambiarVista(FXML_PROYECTOS);
		controller.montarCombo(user);

	}

	@FXML
	void volver(ActionEvent event) {
		ProyectoController controller = (ProyectoController) cambiarVista(FXML_PROYECTOS);
		controller.montarCombo(user);
	}

	public void getData(Proyecto pr, String email, Usuario u) {
		proyecto = pr;
		user = u;

		// comboBox estado
		comboEs.getItems().add("PENDIENTE");
		comboEs.getItems().add("EN PROCESO");
		comboEs.getItems().add("TERMINADA");

		// comboBox Importancia
		comboImp.getItems().add("CRITICA");
		comboImp.getItems().add("ALTA");
		comboImp.getItems().add("MEDIA");
		comboImp.getItems().add("LEVE");

	}

	@FXML
	void borrarTarea(ActionEvent event) {

	}

}
