package actividad2.app.gui;

import java.io.IOException;

import actividad2.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppController {

	public static final String FXML_LOGIN ="/app2/gui/login/login.fxml";
	public static final String FXML_INICIO ="/app2/gui/inicio/inicio.fxml";
	public static final String FXML_COMBO ="/app2/gui/inicio/comboBox.fxml";
	public static final String FXML_DATE ="/app2/gui/inicio/datePicker.fxml";
	public static final String FXML_COLOR ="/app2/gui/inicio/coloPicker.fxml";
	public static final String FXML_SLIDER ="/app2/gui/inicio/slider.fxml";
	
	
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
