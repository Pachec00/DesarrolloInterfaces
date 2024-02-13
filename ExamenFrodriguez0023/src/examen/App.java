package examen;

import examen.gui.AppController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		AppController controller = new AppController(primaryStage);
		controller.cambiarVista(AppController.FXML_LOGIN);
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();
	}
}
