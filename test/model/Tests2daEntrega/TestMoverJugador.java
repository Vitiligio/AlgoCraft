package model.Tests2daEntrega;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.*;

public class TestMoverJugador {
	
	@Test
	public void testSePuedeMoverJugadorADerecha() {
		GeneradorDeMapa generador = new GeneradorDeMapa();
		Posicion posicionJugador = new Posicion(0,0);
		Mapa mapa = new Mapa(generador.generarMapa(), posicionJugador);
		mapa.moverJugadorDerecha();
		Posicion nuevaPosicion = mapa.posicionJugador();
		assertEquals(nuevaPosicion.getX(), posicionJugador.getX()+1);
	}
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testNoSePuedeMoverJugadorAbajoOcupado() {
		GeneradorDeMapa generador = new GeneradorDeMapa();
		Posicion posicionJugador = new Posicion(0,0);
		Mapa mapa = new Mapa(generador.generarMapa(), posicionJugador);
		mapa.moverJugadorAbajo();/*
		Posicion nuevaPosicion = mapa.posicionJugador();
		assertEquals(nuevaPosicion.getY(), posicionJugador.getY());*/
	}
	
}
