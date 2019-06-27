package model.Tests2daEntrega;

import static org.junit.Assert.assertEquals;

<<<<<<< HEAD
import model.Excepciones.CodigoDeHerramientaInvalidoError;
=======
>>>>>>> a39d4e594169475a83914d71a0b096f4dcb97a2b
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import model.*;
import org.junit.rules.ExpectedException;

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
<<<<<<< HEAD

		assertEquals(nuevaPosicion.getY(), posicionEsperada.getY());
		assertEquals(nuevaPosicion.getX(), posicionEsperada.getX());
=======
		
		assertEquals(nuevaPosicion.getY(), posicionEsperada.getY());
>>>>>>> a39d4e594169475a83914d71a0b096f4dcb97a2b
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testSePuedeMoverJugadorAIzquierda() {
		
		GeneradorDeMapa generador = new GeneradorDeMapa();
<<<<<<< HEAD
		Posicion posicionJugador = new Posicion(0,1);
=======
		Posicion posicionJugador = new Posicion(3,3);
>>>>>>> a39d4e594169475a83914d71a0b096f4dcb97a2b
		Mapa mapa = new Mapa(generador.generarMapa(), posicionJugador);
		ControladorMapa controlador = new ControladorMapa(mapa);
		
		Posicion posicionEsperada = posicionJugador.obtenerPosicionIzquierda();
		
		controlador.moverIzquierda();
		Posicion nuevaPosicion = mapa.posicionJugador();
<<<<<<< HEAD

		assertEquals(nuevaPosicion.getY(), posicionEsperada.getY());
		assertEquals(nuevaPosicion.getX(), posicionEsperada.getX());
=======
		
		assertEquals(nuevaPosicion.getY(), posicionEsperada.getY());
>>>>>>> a39d4e594169475a83914d71a0b096f4dcb97a2b
	}
	
	@Test
	public void testSePuedeMoverJugadorAArriba() {
		
		GeneradorDeMapa generador = new GeneradorDeMapa();
<<<<<<< HEAD
		Posicion posicionJugador = new Posicion(1,1);//Para que no este en el limite del mapa
=======
		Posicion posicionJugador = new Posicion(2,2);//Para que no este en el limite del mapa
>>>>>>> a39d4e594169475a83914d71a0b096f4dcb97a2b
		Mapa mapa = new Mapa(generador.generarMapa(), posicionJugador);
		ControladorMapa controlador = new ControladorMapa(mapa);
		
		Posicion posicionEsperada = posicionJugador.obtenerPosicionArriba();
		
		controlador.moverArriba();
		Posicion nuevaPosicion = mapa.posicionJugador();
		
<<<<<<< HEAD
		assertEquals(nuevaPosicion.getY(), posicionEsperada.getY());
=======
>>>>>>> a39d4e594169475a83914d71a0b096f4dcb97a2b
		assertEquals(nuevaPosicion.getX(), posicionEsperada.getX());
	}
	
	@Test
	public void testSePuedeMoverJugadorAAbajo() {
		
		GeneradorDeMapa generador = new GeneradorDeMapa();
<<<<<<< HEAD
		Posicion posicionJugador = new Posicion(2,0);
=======
		Posicion posicionJugador = new Posicion(5,5);
>>>>>>> a39d4e594169475a83914d71a0b096f4dcb97a2b
		Mapa mapa = new Mapa(generador.generarMapa(), posicionJugador);
		ControladorMapa controlador = new ControladorMapa(mapa);
		
		Posicion posicionEsperada = posicionJugador.obtenerPosicionAbajo();
		
		controlador.moverAbajo();
		Posicion nuevaPosicion = mapa.posicionJugador();
<<<<<<< HEAD

		assertEquals(nuevaPosicion.getY(), posicionEsperada.getY());
		assertEquals(nuevaPosicion.getX(), posicionEsperada.getX());
	}
	
	@Test
=======
		
		assertEquals(nuevaPosicion.getX(), posicionEsperada.getX());
	}
	
	@Test 
>>>>>>> a39d4e594169475a83914d71a0b096f4dcb97a2b
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
