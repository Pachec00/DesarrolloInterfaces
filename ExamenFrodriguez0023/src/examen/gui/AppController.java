package examen.gui;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import examen.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class AppController {
	
	//Cambiar por el fxml que se quiera poner al principio
	public static final String FXML_INICIO = "";

private static Stage primaryStage;
	
	public AppController() {
		
	}
	
	public AppController(Stage stage){
		primaryStage = stage;
		stage.setUserData(new HashMap<String, Object>());
	}
	
	
	public Object getUserDataObject(String key) {
		@SuppressWarnings("unchecked")
		Map<String, Object> map = (Map<String, Object>) primaryStage.getUserData();
		return map.get(key);
	}
	
	public void putUserDataObject(String key, Object data) {
		@SuppressWarnings("unchecked")
		Map<String, Object> map = (Map<String, Object>) primaryStage.getUserData();
		map.put(key, data);
	}
	
	public AppController cambiarVista(String fxml) {
		try {
			URL url = App.class.getResource(fxml);
			FXMLLoader loader = new FXMLLoader(url);
			Scene scene = new Scene(loader.load());
			primaryStage.setScene(scene);
			return loader.getController();
		}
		catch(IOException e) {
			throw new RuntimeException("No se ha podido cargar fxml con ruta " + fxml, e);
		}
	}
	
	
	public Parent cargarVista(String fxml) {
		try {
			URL url = App.class.getResource(fxml);
			FXMLLoader loader = new FXMLLoader(url);
			return loader.load();
		}
		catch(IOException e) {
			throw new RuntimeException("No se ha podido cargar fxml con ruta " + fxml, e);
		}
	}
	
	public void mostrarError(String mensaje) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setHeaderText(null);
		alert.setTitle("Error");
		alert.setContentText(mensaje);
		alert.showAndWait();
	}
}
