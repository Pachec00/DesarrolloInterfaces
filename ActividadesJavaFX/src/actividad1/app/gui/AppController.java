package actividad1.app.gui;

import java.io.IOException;

import actividad1.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppController {

	public static final String FXML_LOGIN = "/app/gui/login/login.fxml";
	public static final String FXML_BIENVENIDA = "/app/gui/bienvenida/bienvenida.fxml";
	public static final String FXML_PANTALLA1 = "/app/gui/bienvenida/pantalla1.fxml";
	public static final String FXML_PANTALLA2 = "/app/gui/bienvenida/pantalla2.fxml";

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
