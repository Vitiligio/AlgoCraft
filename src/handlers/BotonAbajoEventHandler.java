package handlers;

import model.*;
import application.GeneradorDeGrilla;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class BotonAbajoEventHandler implements EventHandler<ActionEvent> {
	private Mapa mapa;
	private HBox contenedor;
	
	public BotonAbajoEventHandler(Mapa mapa, HBox contenedor) {
		this.mapa = mapa;
		this.contenedor = contenedor;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		try { 
			ControladorMapa controlador = new ControladorMapa(mapa);
			controlador.moverAbajo();
			GeneradorDeGrilla generador = new GeneradorDeGrilla();
			GridPane grilla = generador.generarVisualizacionDeMapa(mapa);
			contenedor.getChildren().clear();
			contenedor.getChildren().add(grilla);
		}
		catch (Exception e) {
			System.out.println("No te podes mover ahi");
		}
		
	}
}
