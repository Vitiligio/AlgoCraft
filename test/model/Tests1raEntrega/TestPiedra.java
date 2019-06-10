package model.Tests1raEntrega;

import static org.junit.Assert.assertEquals;

import model.DesgasteLineal;
import model.Hacha;
import model.Piedra;
import org.junit.Test;

public class TestPiedra {
	@Test
	public void	testPiedraGolpeadaPorHachaNoReduceDurabilidad() {
		Piedra piedra = new Piedra();
		DesgasteLineal desgaste = new DesgasteLineal(1);
		Hacha hacha = new Hacha(piedra, 200, 5, desgaste);

		int durabilidadPiedra = piedra.getDurabilidad();
		assertEquals(30,durabilidadPiedra);

		hacha.usarContra(piedra);
		assertEquals(piedra.getDurabilidad(), durabilidadPiedra);
	}
}
