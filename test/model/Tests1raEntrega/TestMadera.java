package model.Tests1raEntrega;

import static org.junit.Assert.assertEquals;

import model.DesgasteLineal;
import model.Hacha;
import model.Madera;
import org.junit.Test;

public class TestMadera {
	@Test
	public void testMaderaGolpeadaPorHachaDeMaderaReduceDurabilidad() {
		
		Madera madera = new Madera();
		DesgasteLineal desgaste = new DesgasteLineal(1);
		Hacha hacha = new Hacha(madera, 100, 2, desgaste, 5);

		int durabilidadMadera = madera.getDurabilidad();
		assertEquals(10, durabilidadMadera);

		hacha.usarContra(madera);
		assertEquals(madera.getDurabilidad(), durabilidadMadera - 2);
	}
}
