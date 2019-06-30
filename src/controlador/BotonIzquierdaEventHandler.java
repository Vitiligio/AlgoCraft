package controlador;

import model.*;
import vista.GeneradorDeGrilla;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class BotonIzquierdaEventHandler implements EventHandler<ActionEvent> {
	private Mapa mapa;
	private HBox contenedor;
	
	public BotonIzquierdaEventHandler(Mapa mapa, HBox contenedor) {
		this.mapa = mapa;
		this.contenedor = contenedor;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		try {
			ControladorMapa controlador = new ControladorMapa(mapa);
			controlador.moverIzquierda();
			GeneradorDeGrilla generador = new GeneradorDeGrilla();
			GridPane grilla = generador.generarVisualizacionDeMapa(mapa);
			contenedor.getChildren().clear();
			contenedor.getChildren().add(grilla);
		}
		catch (Exception e) {
			System.out.println("No te podes mover ahi!");
		}
	}
}