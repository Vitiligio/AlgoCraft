package controlador;

import vista.HandlerEscenas;
import model.*;
import vista.EscenaMapa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class BotonJugarHandler implements EventHandler<ActionEvent> {
	private Stage stage;
	private Juego juego;
	private HandlerEscenas handlerEscenas;
	
	public BotonJugarHandler(Stage stage, Juego juego, HandlerEscenas handlerEscenas) {
		this.stage = stage;
		this.juego = juego;
		this.handlerEscenas = handlerEscenas;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		EscenaMapa escena = new EscenaMapa(handlerEscenas);
		Scene scene = escena.generarEscena(juego);
		handlerEscenas.cambiarEscena(scene);
	}
}
