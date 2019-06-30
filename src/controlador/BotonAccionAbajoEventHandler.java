package controlador;

import model.*;
import vista.GeneradorDeGrilla;

import java.io.File;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;


public class BotonAccionAbajoEventHandler implements EventHandler<ActionEvent> {
	private Mapa mapa;
	private HBox contenedor;
	
	public BotonAccionAbajoEventHandler(Mapa mapa, HBox contenedor) {
		this.mapa = mapa;
		this.contenedor = contenedor;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		try {
			ControladorMapa controlador = new ControladorMapa(mapa);
			controlador.accionAbajo();
			GeneradorDeGrilla generador = new GeneradorDeGrilla();
			GridPane grilla = generador.generarVisualizacionDeMapa(mapa);
			contenedor.getChildren().clear();
			contenedor.getChildren().add(grilla);
			AudioClip note = new AudioClip("file:img/hit.wav");
			note.play();
		}
		catch (Exception e) {
			System.out.println("No podes tocar eso");
		}
	}
}
