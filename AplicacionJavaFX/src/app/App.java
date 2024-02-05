package app;


import app.gui.AppController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App  extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		AppController controller = new AppController(primaryStage);

		FXMLLoader loader = new FXMLLoader(App.class.getResource("/app/gui/login/login.fxml"));

		Scene scene = new Scene(loader.load());

		primaryStage.setScene(scene);

		primaryStage.setResizable(false);

		primaryStage.show();
		
		
	}
}
