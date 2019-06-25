package application;

import javafx.application.Application;
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
	
	public Scene menuPrincipal(Stage stage, HandlerEscenas handlerEscenas) {
		Button jugar = new Button();
		jugar.setText("Jugar");
		BotonJugarHandler handler_jugar = new BotonJugarHandler(stage, juego, handlerEscenas);
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

		HandlerEscenas handlerEscenas = new HandlerEscenas(stage);
		Scene scene = menuPrincipal(stage, handlerEscenas);

		handlerEscenas.cambiarEscena(scene);
		stage.show();
	}	
	
}
