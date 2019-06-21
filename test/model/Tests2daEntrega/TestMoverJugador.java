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
		ControladorMapa controlador = new ControladorMapa(mapa);
		
		Posicion posicionEsperada = posicionJugador.obtenerPosicionDerecha();
		
		controlador.moverDerecha();
		Posicion nuevaPosicion = mapa.posicionJugador();
		
		assertEquals(nuevaPosicion, posicionEsperada);
	}
	
	@Test
	public void testSePuedeMoverJugadorAIzquierda() {
		
		GeneradorDeMapa generador = new GeneradorDeMapa();
		Posicion posicionJugador = new Posicion(0,0);
		Mapa mapa = new Mapa(generador.generarMapa(), posicionJugador);
		ControladorMapa controlador = new ControladorMapa(mapa);
		
		Posicion posicionEsperada = posicionJugador.obtenerPosicionIzquierda();
		
		controlador.moverIzquierda();
		Posicion nuevaPosicion = mapa.posicionJugador();
		
		assertEquals(nuevaPosicion, posicionEsperada);
	}
	
	@Test
	public void testSePuedeMoverJugadorAArriba() {
		
		GeneradorDeMapa generador = new GeneradorDeMapa();
		Posicion posicionJugador = new Posicion(1,0);//Para que no este en el limite del mapa
		Mapa mapa = new Mapa(generador.generarMapa(), posicionJugador);
		ControladorMapa controlador = new ControladorMapa(mapa);
		
		Posicion posicionEsperada = posicionJugador.obtenerPosicionArriba();
		
		controlador.moverArriba();
		Posicion nuevaPosicion = mapa.posicionJugador();
		
		assertEquals(nuevaPosicion, posicionEsperada);
	}
	
	@Test
	public void testSePuedeMoverJugadorAAbajo() {
		
		GeneradorDeMapa generador = new GeneradorDeMapa();
		Posicion posicionJugador = new Posicion(0,0);
		Mapa mapa = new Mapa(generador.generarMapa(), posicionJugador);
		ControladorMapa controlador = new ControladorMapa(mapa);
		
		Posicion posicionEsperada = posicionJugador.obtenerPosicionAbajo();
		
		controlador.moverAbajo();
		Posicion nuevaPosicion = mapa.posicionJugador();
		
		assertEquals(nuevaPosicion, posicionEsperada);
	}
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testNoSePuedeMoverJugadorAbajoOcupado() {
		GeneradorDeMapa generador = new GeneradorDeMapa();
		Posicion posicionJugador = new Posicion(0,0);
		Mapa mapa = new Mapa(generador.generarMapa(), posicionJugador);
		ControladorMapa controlador = new ControladorMapa(mapa);
		controlador.moverAbajo();
		Posicion nuevaPosicion = mapa.posicionJugador();
		assertEquals(nuevaPosicion.getY(), posicionJugador.getY());
	}
	
}
