package app.gui;

import java.io.IOException;

import app.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppController {

	public static final String FXML_LOGIN = "/app/gui/login/login.fxml";
	public static final String FXML_REGISTRAR = "/app/gui/registrar/registrar.fxml";
	public static final String FXML_PRUEBA = "/app/gui/proyectos/pantalla1.fxml";
	public static final String FXML_PROYECTOS = "/app/gui/proyectos/proyecto.fxml";
	public static final String FXML_RESTAURARPASS = "/app/gui/recuperar/recuperar.fxml";
	public static final String FXML_NUEVO_PROYECTOS = "/app/gui/proyectos/nuevoProyecto.fxml";
	public static final String FXML_NUEVA_TAREA = "/app/gui/tarea/nuevaTarea.fxml";
	public static final String FXML_EDITAR_TAREA = "/app/gui/tarea/editarTarea.fxml";

	private static Stage stage;

	public AppController() {

	}

	public AppController(Stage primaryStage) {
		stage = primaryStage;
	}

	public AppController cambiarVista(String fxml) {
		try {

			FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml));

			Scene scene = new Scene(loader.load());

			stage.setScene(scene);

			return loader.getController();
		} catch (IOException e) {

			System.err.println("No se ha podido cambiar de vista");

			System.err.println("Vista destino " + fxml);

			e.printStackTrace();

		}
		return null;
	}

	public Parent cargarVista(String fxml) {

		try {

			FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml));

			return loader.load();

		} catch (IOException e) {

			System.err.println("No se ha podido cambiar de vista");

			System.err.println("Vista destino " + fxml);

			e.printStackTrace();
		}
		return null;
	}
}
