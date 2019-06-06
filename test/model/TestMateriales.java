package model;

import org.junit.*;
import static org.junit.Assert.*;

public class TestMateriales {

	@Test
	public void testMaderaGolpeadaPorHachaDeMaderaReduceDurabilidad() {

		Madera madera = new Madera();
		Hacha hacha = new Hacha(madera);

		int durabilidadMadera = madera.getDurabilidad();
		assertEquals(10, durabilidadMadera);

		hacha.usarContra(madera);
		assertEquals(madera.getDurabilidad(), durabilidadMadera - 2);

	}
	
	@Test
	public void	testPiedraGolpeadaPorHachaNoReduceDurabilidad() {
		Piedra piedra = new Piedra();
		Hacha hacha = new Hacha(piedra);

		int durabilidadPiedra = piedra.getDurabilidad();
		assertEquals(30,durabilidadPiedra);

		hacha.usarContra(piedra);
		assertEquals(piedra.getDurabilidad(), durabilidadPiedra);
	}
	
	@Test
	public void testMetalGolpeadoPorPicoMaderaNoReduceDurabilidad() {
		Metal metal = new Metal();
		Madera madera = new Madera();
		Pico pico = new Pico(madera);

		int durabilidadMetal = metal.getDurabilidad();

		pico.usarContra(metal);
		assertEquals(metal.getDurabilidad(), durabilidadMetal);
	}
}
