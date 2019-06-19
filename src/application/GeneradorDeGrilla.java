package application;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import model.Casillero;
import model.Mapa;
import model.ObjetoDelMapa;

public class GeneradorDeGrilla {
	public GridPane generarVisualizacionDeMapa(Mapa mapa) {
		GridPane grilla = new GridPane();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j< 8; j++) {
				int[] coordenada = {i, j}; 
				Casillero contenido = mapa.verPosicion(coordenada);
				ObjetoDelMapa objeto = contenido.obtenerContenido();
				String indice;
				if (objeto == null) {
					indice = "  ";
				}
				else {
					indice = Integer.toString(objeto.getID());
				}
				Label item = new Label(indice);
				item.setStyle("-fx-border-color: black;");
				grilla.add(item, j, i);
			}
		}
		//int[] posJugador = mapa.posicionJugador();
		//Label jugador = new Label();
		//jugador.setText(" J");
		//grilla.add(jugador, posJugador[1], posJugador[0]);
		return grilla;
	}
}
