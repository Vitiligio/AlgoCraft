package model.Tests2daEntrega;

import model.*;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TestInicializarJugador {
	
	@Test
	public void testSeInicializaJugadorEnElMapaCorrectamente() {
		GeneradorDeMapa generador = new GeneradorDeMapa();
		Posicion posicionJugador = new Posicion(0,0);
		Mapa mapa = new Mapa(generador.generarMapa(), posicionJugador);
		assertEquals(mapa.posicionJugador(), posicionJugador);
	}

}
