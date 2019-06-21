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
	
	private void moverJugadorA(Posicion nueva_posicion) {

		Casillero nuevo_casillero = terreno[nueva_posicion.getX()][nueva_posicion.getY()];
		
		try {
	
		nuevo_casillero.ocupar(jugador);
		
		}

		catch (Exception e) {
			return;
		}

		Casillero viejo_casillero = terreno[posicionJugador.getX()][posicionJugador.getY()];
		viejo_casillero.desocupar();
		posicionJugador = nueva_posicion;

	}
	
	public void moverJugadorIzquierda() {
		Posicion nueva_posicion = posicionJugador.obtenerPosicionIzquierda();
		moverJugadorA(nueva_posicion);
	}
	public void moverJugadorDerecha() {
		Posicion nueva_posicion = posicionJugador.obtenerPosicionDerecha();
		moverJugadorA(nueva_posicion);
	}
	public void moverJugadorArriba() {
		Posicion nueva_posicion = posicionJugador.obtenerPosicionArriba();
		moverJugadorA(nueva_posicion);
	}
	public void moverJugadorAbajo() {
		Posicion nueva_posicion = posicionJugador.obtenerPosicionAbajo();
		moverJugadorA(nueva_posicion);
	}

}