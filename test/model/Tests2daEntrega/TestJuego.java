package model.Tests2daEntrega;

import model.*;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TestJuego {
	
	@Test
	public void testJuegoSeIniciaConTerrenoConCasillerosOcupados() {
		// Me fijo que por lo menos tenga un casillero ocupado (ademas del que esta el jugador)
		// tratando de ocupar las celdas del mapa, cuando en alguna celda me de falso significa que
		// ya habia un elemento ahi.
		
		Juego juego = new Juego();
		juego.iniciar();
		
		Mapa mapa = juego.obtenerMapa();
		int i = 0;
		int j = 1;
		boolean hayCasilleroOcupado = false;
		Casillero terreno;
		Madera madera = new Madera();
		
		while ((i < 8) && (!hayCasilleroOcupado)) {
			while (j < 8) {
				
				Posicion coordenada = new Posicion(i,j);
				terreno = mapa.verPosicion(coordenada);
				
				try {
					terreno.ocupar(madera);
				}
				catch (Exception NoSePuedeOcuparExcepcion) {
					hayCasilleroOcupado = true;
				} 
				
				j++;
			}
			
			j = 0;
			i++;
		}
		
		assertEquals(hayCasilleroOcupado, true);
	}
	
	@Test
	public void testJuegoIniciaConMaderaEnElCasilleroCorrespondiente() {
		
		Juego juego = new Juego();
		juego.iniciar();
		Mapa mapa = juego.obtenerMapa();
		
		Posicion coordenada = new Posicion(1,0);
		
		Casillero terreno = mapa.verPosicion(coordenada);
		ObjetoDelMapa material = terreno.obtenerContenido();
		
		assertEquals(material.getID(), 1);

	}
	
	@Test
	public void testJuegoIniciaConPiedraEnElCasilleroCorrespondiente() {
		
		Juego juego = new Juego();
		juego.iniciar();
		Mapa mapa = juego.obtenerMapa();
		
		Posicion coordenada = new Posicion(1,7);
		
		Casillero terreno = mapa.verPosicion(coordenada);
		ObjetoDelMapa material = terreno.obtenerContenido();
		
		assertEquals(material.getID(), 2);

	}
	
	@Test
	public void testJuegoIniciaConMetalEnElCasilleroCorrespondiente() {
		
		Juego juego = new Juego();
		juego.iniciar();
		Mapa mapa = juego.obtenerMapa();
		
		Posicion coordenada = new Posicion(2,7);
		
		Casillero terreno = mapa.verPosicion(coordenada);
		ObjetoDelMapa material = terreno.obtenerContenido();
		
		assertEquals(material.getID(), 3);
	}
	
	@Test
	public void testJuegoIniciaConDiamanteEnElCasilleroCorrespondiente() {
		
		Juego juego = new Juego();
		juego.iniciar();
		Mapa mapa = juego.obtenerMapa();
		
		Posicion coordenada = new Posicion(3,7);
		
		Casillero terreno = mapa.verPosicion(coordenada);
		ObjetoDelMapa material = terreno.obtenerContenido();
		
		assertEquals(material.getID(), 4);

	}
	
	
	@Test
	public void testJuegoIniciaConJugadorEquipadoConHachaMadera() {
		
		Juego juego = new Juego();
		juego.iniciar();
		Mapa mapa = juego.obtenerMapa();
		
		Personaje jugador = mapa.jugador;
		Herramienta hachaMadera = jugador.getObjetoEquipado();
		
		assertEquals((hachaMadera.getMaterial()).getID(), 1);

	}
	
	
}
