package model.Tests2daEntrega;

import model.*;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TestJugador {
	
	@Test
	public void testSeInicializaJugadorEnElMapaCorrectamente() {
		GeneradorDeMapa generador = new GeneradorDeMapa();
		int posicionJugador[] = {0,0};
		Mapa mapa = new Mapa(generador.generarMapa(), posicionJugador);
		assertEquals(mapa.posicionJugador(), posicionJugador);
	}
	
	@Test
	public void testSePuedeMoverJugadorEnTodasDireccionesVacias() {
		
	}
}
