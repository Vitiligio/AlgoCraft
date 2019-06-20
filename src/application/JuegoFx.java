package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.*;
import handlers.*;
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class JuegoFx extends Application {
	
	GridPane grilla;
	Juego juego;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public Scene menuPrincipal(Stage stage) {
		Button jugar = new Button();
		jugar.setText("Jugar");
		BotonJugarHandler handler_jugar = new BotonJugarHandler(stage, juego);
		jugar.setOnAction(handler_jugar);
		VBox contenedorInicio = new VBox(jugar);
		Scene scene = new Scene(contenedorInicio);
		return scene;
	}
	
	@Override
	public void start(Stage stage)
	{
		
		juego = new Juego();
		juego.iniciar();

		Scene scene = menuPrincipal(stage);
		stage.setScene(scene);
		stage.show();
	}	
	
}
