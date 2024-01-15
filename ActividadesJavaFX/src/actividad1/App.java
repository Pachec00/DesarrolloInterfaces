package actividad1;


import actividad1.app.gui.AppController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		AppController c = new AppController(primaryStage);
		
		FXMLLoader loader = new FXMLLoader(App.class.getResource("/app/gui/bienvenida/bienvenida.fxml"));

		Scene scene = new Scene(loader.load());

		primaryStage.setScene(scene);
		
		primaryStage.setResizable(false);

		primaryStage.show();

	}
}
