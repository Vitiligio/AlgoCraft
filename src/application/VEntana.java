package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class VEntana extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("ASD");
		StackPane layout = new StackPane();
		Button button = new Button();
		button.setText("Texto del boton");
		
		button.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent actionEvent) {
				button.setText("QUEEE");
			}
		});
		layout.getChildren().add(button);
		Scene scene = new Scene(layout);
		stage.setScene(scene);
		stage.show();
	}
}
