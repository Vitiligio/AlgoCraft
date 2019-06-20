package handlers;

import model.*;
import application.EscenaMapa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class BotonJugarHandler implements EventHandler<ActionEvent> {
	private Stage stage;
	private Juego juego;
	
	public BotonJugarHandler(Stage stage, Juego juego) {
		this.stage = stage;
		this.juego = juego;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		EscenaMapa escena = new EscenaMapa();
		Scene scene = escena.generarEscena(juego);
		stage.setScene(scene);
	}
}
