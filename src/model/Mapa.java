package model;

public class Mapa {
	
	Casillero[][] terreno = new Casillero[8][8];
	Posicion posicionJugador;
	public Personaje jugador = new Personaje();
	
	
	public Mapa(Casillero[][] terreno, Posicion posicionJugador) {
	
		super();
		this.terreno = terreno;
		this.posicionJugador = posicionJugador;
		terreno[posicionJugador.getX()][posicionJugador.getY()].ocupar(jugador);
		
	}
	
	public Posicion posicionJugador() {
		return posicionJugador;
	}
	
	public Casillero verPosicion(Posicion posicion) {
		return terreno[posicion.getX()][posicion.getY()];
	}
	
	private boolean moverJugadorA(Posicion nueva_posicion) {
		/* En teoria esto se deberia validar antes, por afuera del mapa
		if (nueva_posicion[0] > 7)
			return false;
		if (nueva_posicion[0] < 0)
			return false;
		if (nueva_posicion[1] < 0)
			return false;
		if (nueva_posicion[1] > 7)
			return false;*/
		Casillero nuevo_casillero = terreno[nueva_posicion.getX()][nueva_posicion.getY()];
		
		nuevo_casillero.ocupar(jugador);
		Casillero viejo_casillero = terreno[posicionJugador.getX()][posicionJugador.getY()];
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