package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMetal {
	@Test
	public void testMetalGolpeadoPorPicoMaderaNoReduceDurabilidad() {
		Metal metal = new Metal();
		Madera madera = new Madera();
		DesgasteLineal desgaste = new DesgasteLineal(1);
		Pico pico = new Pico(madera, 100, 2, desgaste);

		int durabilidadMetal = metal.getDurabilidad();

		pico.usarContra(metal);
		assertEquals(metal.getDurabilidad(), durabilidadMetal);
	}
}
