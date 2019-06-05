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
		Madera madera = new Madera();
		Pico pico = new Pico(madera);
		int durabilidadMadera = madera.getDurabilidad();
		pico.usarContra(madera):
		assertEquals(durabilidadMadera, durabilidadMadera-2);
	}
	@Test
	public void	testPiedraGolpeadaPorHachaNoReduceDurabilidad() {
		Piedra piedra = new Piedra();
		Hacha hacha = new Hacha(piedra);
		int durabilidadPiedra = piedra getDurabilidad();
		hacha usarContra(piedra):
		assertEquals(durabilidadPiedra, durabilidadPiedra);
		
	}
	@Test
	public void testMetalGolpeadoPorPicoMaderaNoReduceDurabilidad() {
		Metal metal = new Metal();
		Madera madera = new Madera();
		Pico pico = new Pico(madera);
		int durabilidadMetal = metal getDurabilidad();
		pico usarContra(metal):
		assertEquals(durabilidadMetal, durabilidadMetal);
	}

}
