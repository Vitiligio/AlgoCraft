package model.Tests1raEntrega;

import static org.junit.Assert.assertEquals;

import model.DesgasteLineal;
import model.Hacha;
import model.Madera;
import model.Material;

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
	
	@Test
	public void testHachaDeMaderaUsarContraMaderaYNoLaRompe() {
		
		Madera madera = new Madera();
		DesgasteLineal tipoDesgaste = new DesgasteLineal(1);
		Hacha hacha = new Hacha(madera,100,2,tipoDesgaste, 5);
		Material material;
		
		material = hacha.usarContra(madera); 
		assertEquals(material.getID(), 0);
	} 
	

	@Test
	public void testHachaDeMaderaUsarContraMaderaYLaRompe() {
		
		Madera madera = new Madera();
		DesgasteLineal tipoDesgaste = new DesgasteLineal(1);
		Hacha hacha = new Hacha(madera,100,2,tipoDesgaste, 5);
		Material material;
		
		material = hacha.usarContra(madera);
		hacha.usarContra(madera);
		hacha.usarContra(madera);
		hacha.usarContra(madera);
		hacha.usarContra(madera);
		
		hacha.usarContra(madera);
		hacha.usarContra(madera);
		hacha.usarContra(madera);
		hacha.usarContra(madera);
		material = hacha.usarContra(madera);
		
		assertEquals(material.getID(), 1);
	} 
}
