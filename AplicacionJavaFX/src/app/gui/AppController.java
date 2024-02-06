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
