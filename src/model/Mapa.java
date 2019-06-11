package model;

public class Mapa {
	
	Casillero[][] terreno = new Casillero[8][8];
	int[] posicionJugador = new int[2];
	
	public Mapa(Casillero[][] terreno, int[] posicionJugador) {
		
		super();
		this.terreno = terreno;
		this.posicionJugador = posicionJugador;
		
	}

}

