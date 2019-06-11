package model.Tests2daEntrega;

import model.*;
import org.junit.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class TestCasillero {

	@Test
	void testCasilleroVacioSePuedeOcuparPorMaterial() {
		
		//madera hereda del tipo material
		Madera madera = new Madera();
		Casillero casillero = new Casillero();
		
		casillero.ocupar(madera);
		assertEquals(casillero.obtenerContenido(),madera);
		
	}
	
	@Test
	void testCasilleroVacioSePuedeOcuparPorJugador() {
		
		Personaje jugador = new Personaje();
		Casillero casillero = new Casillero();
		
		casillero.ocupar(jugador);
		assertEquals(casillero.obtenerContenido(),jugador);
		
	}
	
	@Test
	void testCasilleroOcupadoNoSePuedeOcupar() {
		
		Madera madera = new Madera();
		Casillero casillero = new Casillero();
		
		casillero.ocupar(madera);
		
		Personaje jugador = new Personaje();
		casillero.ocupar(jugador);
		
		assertEquals(casillero.obtenerContenido(),madera);
		
	}

}
