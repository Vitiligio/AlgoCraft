package model;

public class Mapa {
	
	Casillero[][] terreno = new Casillero[8][8];
	int[] posicionJugador = new int[2];
	public Personaje jugador = new Personaje();
	
	public Mapa(Casillero[][] terreno, int[] posicionJugador) {
	
		super();
		this.terreno = terreno;
		this.posicionJugador = posicionJugador;
		terreno[posicionJugador[0]][posicionJugador[1]].ocupar(jugador);
		
	}
	
	public int[] posicionJugador() {
		return posicionJugador;
	}
	
	public Casillero verPosicion(int[] posicion) {
		return terreno[posicion[0]][posicion[1]];
	}
	
	private boolean moverJugadorA(int[] nueva_posicion) {
		/* En teoria esto se deberia validar antes, por afuera del mapa
		if (nueva_posicion[0] > 7)
			return false;
		if (nueva_posicion[0] < 0)
			return false;
		if (nueva_posicion[1] < 0)
			return false;
		if (nueva_posicion[1] > 7)
			return false;*/
		Casillero nuevo_casillero = terreno[nueva_posicion[0]][nueva_posicion[1]];
		if (!nuevo_casillero.ocupar(jugador))
			return false;
		Casillero viejo_casillero = terreno[posicionJugador[0]][posicionJugador[1]];
		viejo_casillero.desocupar();
		posicionJugador = nueva_posicion;
		return true;
	}
	
	public boolean moverJugadorIzquierda() {
		int[] nueva_posicion = {posicionJugador[0], posicionJugador[1]-1};
		return moverJugadorA(nueva_posicion);
	}
	public boolean moverJugadorDerecha() {
		int[] nueva_posicion = {posicionJugador[0], posicionJugador[1]+1};
		return moverJugadorA(nueva_posicion);
	}
	public boolean moverJugadorArriba() {
		int[] nueva_posicion = {posicionJugador[0]-1, posicionJugador[1]};
		return moverJugadorA(nueva_posicion);
	}
	public boolean moverJugadorAbajo() {
		int[] nueva_posicion = {posicionJugador[0]+1, posicionJugador[1]};
		return moverJugadorA(nueva_posicion);
	}

}