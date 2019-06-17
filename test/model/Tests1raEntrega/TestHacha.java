package model.Tests1raEntrega;

import model.*;
import org.junit.*;
import static org.junit.Assert.*;
/*
Hacha se usa contra cada uno de los materiales y se reduce su durabilidad correspondiente al material del Hacha
 */
public class TestHacha {

	@Test
	public void testHachaDeMaderaSeCreaConDurabilidadCorrespondiente() {
		
		Madera madera = new Madera();
		DesgasteLineal tipoDesgaste = new DesgasteLineal(1);
		Hacha hacha = new Hacha(madera,100,2,tipoDesgaste, 5);
		
		assertEquals(100,hacha.getDurabilidad(),0);
	}
	
	@Test
	public void testHachaDeMaderaSeCreaConFuerzaCorrespondiente() {
		
		Madera madera = new Madera();
		DesgasteLineal tipoDesgaste = new DesgasteLineal(1);
		Hacha hacha = new Hacha(madera,100,2,tipoDesgaste, 5);
		
		assertEquals(2,hacha.getFuerza());
	}
	
	@Test
	public void testHachaDeMetalSeCreaConDurabilidadCorrespondiente() {
		
		Metal metal = new Metal();
		Desgaste tipoDesgaste = new DesgasteLineal(2);
		Hacha hacha = new Hacha(metal,400,10,tipoDesgaste, 7);
		
		assertEquals(400,hacha.getDurabilidad(),0);
	}

	@Test
	public void testHachaDeMetalSeCreaConFuerzaCorrespondiente() {
		
		Metal metal = new Metal();
		Desgaste tipoDesgaste = new DesgasteLineal(2);
		Hacha hacha = new Hacha(metal,400,10,tipoDesgaste, 7);
		
		assertEquals(10,hacha.getFuerza());
	}
	
	@Test
	public void testHachaDeMaderaUsarContraMadera() {
		
		Madera madera = new Madera();
		DesgasteLineal tipoDesgaste = new DesgasteLineal(1);
		Hacha hacha = new Hacha(madera,100,2,tipoDesgaste, 5);
		
		hacha.usarContra(madera);
		
		assertEquals(98,hacha.getDurabilidad(),0);
	}

}
