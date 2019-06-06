package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestPersonaje {

	@Test
	public void testPersonajeSeInicializaConHachaDeMadera() {
		
		Personaje personaje = new Personaje();		
		Herramienta objetoEquipado = personaje.getObjetoEquipado();
		
		assertEquals(objetoEquipado.getClass(), Hacha.class);
		assertEquals(objetoEquipado.getMaterial().getClass(), Madera.class);
		
	}

}
