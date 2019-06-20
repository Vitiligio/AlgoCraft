package handlers;

import model.*;
import application.GeneradorDeGrilla;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class BotonJugarHandler implements EventHandler<ActionEvent> {
	private Stage stage;
	private VBox contenedor;
	
	public BotonJugarHandler(Stage stage, VBox contenedor) {
		this.stage = stage;
		this.contenedor = contenedor;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		Scene scene = new Scene(contenedor);
		stage.setScene(scene);
	}
}
