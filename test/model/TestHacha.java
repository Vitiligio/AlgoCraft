package model;

import static org.junit.Assert.*;
import org.junit.Test;
/*
Hacha se usa contra cada uno de los materiales y se reduce su durabilidad correspondiente al material del Hacha
 */
public class TestHacha {

	@Test
	public void testHachaDeMaderaSeCreaConDurabilidadCorrespondiente() {
		
		Madera madera = new Madera();
		Hacha hacha = new Hacha(madera);
		
		assertEquals(100,hacha.getDurabilidad(),0);
	}
	
	@Test
	public void testHachaDeMaderaSeCreaConFuerzaCorrespondiente() {
		
		Madera madera = new Madera();
		Hacha hacha = new Hacha(madera);
		
		assertEquals(100,hacha.getFuerza());
	}
	
	@Test
	public void testHachaDeMetalSeCreaConDurabilidadCorrespondiente() {
		
		Metal metal = new Metal();
		Hacha hacha = new Hacha(metal);
		
		assertEquals(400,hacha.getDurabilidad(),0);
	}

	@Test
	public void testHachaDeMetalSeCreaConFuerzaCorrespondiente() {
		
		Metal metal = new Metal();
		Hacha hacha = new Hacha(metal);
		
		assertEquals(10,hacha.getFuerza());
	}
	
	@Test
	public void testHachaDeMaderaUsarContraMadera() {
		
		Metal metal = new Metal();
		Madera madera = new Madera();
		Hacha hacha = new Hacha(madera);
		
		hacha.usarContra(madera);
		
		assertEquals(395,hacha.getDurabilidad(),0);
	}
	//CAMBIO CAMBIO

}
