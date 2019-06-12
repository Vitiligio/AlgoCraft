package model.Tests2daEntrega;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.*;

public class TestMoverJugador {
	
	@Test
	public void testSePuedeMoverJugadorADerecha() {
		GeneradorDeMapa generador = new GeneradorDeMapa();
		int posicionJugador[] = {0,0};
		Mapa mapa = new Mapa(generador.generarMapa(), posicionJugador);
		assertEquals(mapa.moverJugadorDerecha(), true);
	}
	
	@Test
	public void testNoSePuedeMoverJugadorAbajoOcupado() {
		GeneradorDeMapa generador = new GeneradorDeMapa();
		int posicionJugador[] = {0,0};
		Mapa mapa = new Mapa(generador.generarMapa(), posicionJugador);
		assertEquals(mapa.moverJugadorAbajo(), false);
	}
	
	@Test
	public void testNoSePuedeMoverJugadorIzquierdaInexistente() {
		GeneradorDeMapa generador = new GeneradorDeMapa();
		int posicionJugador[] = {0,0};
		Mapa mapa = new Mapa(generador.generarMapa(), posicionJugador);
		assertEquals(mapa.moverJugadorIzquierda(), false);
	}
	
	@Test
	public void testNoSePuedeMoverJugadorArribaInexistente() {
		GeneradorDeMapa generador = new GeneradorDeMapa();
		int posicionJugador[] = {0,0};
		Mapa mapa = new Mapa(generador.generarMapa(), posicionJugador);
		assertEquals(mapa.moverJugadorArriba(), false);
	}
	
}
