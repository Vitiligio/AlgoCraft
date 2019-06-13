package model;

public class Juego {
	
	Mapa mapa;
	GeneradorDeMapa generador = new GeneradorDeMapa();

	public void iniciar(){
		
		int posicionJugador[] = {0,0};
		mapa = new Mapa(generador.generarMapa(), posicionJugador);
	}
	
	public Mapa obtenerMapa(){
		return this.mapa;
	}
}
