package model.Tests1raEntrega;

import static org.junit.Assert.assertEquals;

import model.DesgasteLineal;
import model.Madera;
import model.Metal;
import model.Pico;
import org.junit.Test;

public class TestMetal {
	@Test
	public void testMetalGolpeadoPorPicoMaderaNoReduceDurabilidad() {
		Metal metal = new Metal();
		Madera madera = new Madera();
		DesgasteLineal desgaste = new DesgasteLineal(1);
		Pico pico = new Pico(madera, 100, 2, desgaste, 8);

		int durabilidadMetal = metal.getDurabilidad();

		pico.usarContra(metal);
		assertEquals(metal.getDurabilidad(), durabilidadMetal);
	}
}
