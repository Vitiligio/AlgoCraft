package application;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import model.Casillero;
import model.Mapa;
import model.ObjetoDelMapa;
import model.Posicion;

public class GeneradorDeGrilla {
	public GridPane generarVisualizacionDeMapa(Mapa mapa) {
		GridPane grilla = new GridPane();
		HandlerDeImagenes handler = new HandlerDeImagenes();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j< 8; j++) {
				int[] coordenada = {i, j}; 
				Posicion posicion = new Posicion(i,j);
				Casillero contenido = mapa.verPosicion(posicion);
				ObjetoDelMapa objeto = contenido.obtenerContenido();
				int indice;
				if (objeto == null) {
					indice = -1;
				}
				else {
					indice = objeto.getID();
				}
				ImageView image = handler.buscarImagenPorID(indice);
				grilla.add(image, j, i);
			}
		}
		//int[] posJugador = mapa.posicionJugador();
		//Label jugador = new Label();
		//jugador.setText(" J");
		//grilla.add(jugador, posJugador[1], posJugador[0]);
		return grilla;
	}
}
