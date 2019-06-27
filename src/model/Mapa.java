package model;

public class Mapa {
	
	Casillero[][] terreno = new Casillero[9][16];
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
	

	public void moverJugadorA(Posicion nueva_posicion) {

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

	public void accionA(Posicion destino) {
		
		Casillero nuevo_casillero = terreno[destino.getX()][destino.getY()];
		Material material = (Material) nuevo_casillero.obtenerContenido();
		this.jugador.usarHerramientaEquipada(material);
		
		if (material.getEstado()) {
			nuevo_casillero.desocupar();
		}
	}

}