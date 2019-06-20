package model.Tests2daEntrega;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import model.*;

public class TestMoverJugador {
	
	@Test
	public void testSePuedeMoverJugadorADerecha() {
		GeneradorDeMapa generador = new GeneradorDeMapa();
		Posicion posicionJugador = new Posicion(0,0);
		Mapa mapa = new Mapa(generador.generarMapa(), posicionJugador);
		assertEquals(mapa.moverJugadorDerecha(), true);
	}
	
	@Test
	public void testNoSePuedeMoverJugadorAbajoOcupado() {
		GeneradorDeMapa generador = new GeneradorDeMapa();
		Posicion posicionJugador = new Posicion(0,0);
		Mapa mapa = new Mapa(generador.generarMapa(), posicionJugador);
		mapa.moverJugadorAbajo();
		Posicion nuevaPosicion = mapa.posicionJugador();
		assertEquals(posicionJugador, nuevaPosicion);
	}
	
}
