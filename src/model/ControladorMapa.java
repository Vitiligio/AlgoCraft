package model;

public class ControladorMapa {
	
	Mapa mapa;
	
	public ControladorMapa (Mapa mapa) {
		
	this.mapa = mapa;
		
	}
	
	public void moverArriba() {
		
		Posicion destino = mapa.posicionJugador().obtenerPosicionArriba();
		mapa.moverJugadorA(destino);
		
	}
	
	public void moverAbajo() {
		
		Posicion destino = mapa.posicionJugador().obtenerPosicionAbajo();
		mapa.moverJugadorA(destino);
		
	}
	
	public void moverDerecha() {
		
		Posicion destino = mapa.posicionJugador().obtenerPosicionDerecha();
		mapa.moverJugadorA(destino);
		
	}

	public void moverIzquierda() {
		
		Posicion destino = mapa.posicionJugador().obtenerPosicionIzquierda();
		mapa.moverJugadorA(destino);
		
	}

	public void accionArriba() {
		
		Posicion destino = mapa.posicionJugador().obtenerPosicionArriba();
		mapa.accionA(destino);
		
	}
	
	public void accionAbajo() {
		
		Posicion destino = mapa.posicionJugador().obtenerPosicionAbajo();
		mapa.accionA(destino);
		
	}
	
	public void accionDerecha() {
		
		Posicion destino = mapa.posicionJugador().obtenerPosicionDerecha();
		mapa.accionA(destino);
		
	}

	public void accionIzquierda() {
		
		Posicion destino = mapa.posicionJugador().obtenerPosicionIzquierda();
		mapa.accionA(destino);
		
	} 
	
}
