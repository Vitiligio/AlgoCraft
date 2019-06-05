package model;

import org.junit.jupiter.api.Test;

public class TP2Tests {
	
	@Test
	public void testCrearHachaDeMadera() {
		
	}
	@Test
	public void testCrearPicoMadera() {
		
	}
	@Test
	public void testCrearHachaMetal() {
		
	}
	@Test
	public void testCrearPicoMetal() {
		
	}
	@Test
	public void testCrearPicoFino() {
		
	}
	@Test
	public void testDurabilidadHacha() {
		
	}
	@Test
	public void testDurabilidadPico() {
		
	}
	@Test
	public void testPicoFinoContraDiamante() {
		
	}
	@Test
	public void testPicoFinoContraTodosMenosDiamante() {
		
	}
	@Test
	public void testCrearJugador() {
		
	}
	@Test
	public void testMaderaGolpeadaPorHachaDeMaderaReduceDurabilidad() {
		Madera madera = Madera new;
		Pico pico = new Pico(madera);
		int durabilidadMadera = madera durabilidad;
		pico usarContra(madera):
		assertEquals(durabilidadMadera, durabilidadMadera-2);
	}
	@Test
	public void	testPiedraGolpeadaPorHachaNoReduceDurabilidad() {
		Piedra piedra = Piedra new;
		Hacha hacha = new hacha(piedra);
		int durabilidadPiedra = piedra durabilidad;
		hacha usarContra(piedra):
		assertEquals(durabilidadPiedra, durabilidadPiedra);
		
	}
	@Test
	public void testMetalGolpeadoPorPicoMaderaNoReduceDurabilidad() {
		Metal metal = Metal new;
		Madera madera = Madera new;
		Pico pico = new Pico(madera);
		int durabilidadMetal = metal durabilidad;
		pico usarContra(metal):
		assertEquals(durabilidadMetal, durabilidadMetal);
	}

}
