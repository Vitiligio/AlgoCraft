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
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Posicion posicion = new Posicion(i,j);
				Casillero contenido = mapa.verPosicion(posicion);
				ObjetoDelMapa objeto = contenido.obtenerContenido();
				if (objeto == null) {
					new VistaCasillero(grilla, i, j);
				}
				else {
					generarVistaSegunID(objeto.getID(), grilla, i, j);
				}
			}
		}

		return grilla;
	}

	public void generarVistaSegunID(int ID, GridPane grilla, int i, int j){

		switch(ID){
			case 0:
				new VistaPersonaje(grilla, i, j);
				break;
			case 1:
				new VistaMadera(grilla, i, j);
				break;
			case 2:
				new VistaPiedra(grilla, i, j);
				break;
			case 3:
				new VistaMetal(grilla, i, j);
				break;
			case 4:
				new VistaDiamante(grilla, i, j);
				break;
		}
	}
}
