package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPersonaje {

	@Test
	void testPersonajeSeInicializaConHachaDeMadera() {
		
		Personaje personaje = new Personaje();		
		Herramienta objetoEquipado = personaje.getObjetoEquipado();
		
		assertEquals(objetoEquipado.getClass(),Hacha.class);
		assertEquals(objetoEquipado.getMaterial(),Madera.class);
		
	}

}
