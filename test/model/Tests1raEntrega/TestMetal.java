package model.Tests1raEntrega;

import static org.junit.Assert.assertEquals;

import model.Desgaste;
import model.DesgasteLineal;
import model.Madera;
import model.Material;
import model.MaterialNulo;
import model.Metal;
import model.Pico;
import model.Piedra;

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
	
	@Test
	public void testMetalGolpeadoPorPicoMaderaDevuelveMaterialNulo() {
		
		Material material;
		Metal metal = new Metal();
		Madera madera = new Madera();
		DesgasteLineal desgaste = new DesgasteLineal(1);
		Pico pico = new Pico(madera, 100, 2, desgaste, 8);
		
		material = pico.usarContra(metal);
		assertEquals(material.getID(), 0);
	}
	
	@Test
	public void testMetalAlRomperseDevuelveMetal() {
		
		int i = 0;
		Material material = new MaterialNulo();
		Metal metal = new Metal();
		Piedra piedra = new Piedra();
		Desgaste desgaste = new DesgasteLineal(1.5);
		Pico pico = new Pico(piedra, 100, 2, desgaste, 8);
		
		while (i < 100 && (material.getID() == 0)) {
			material = pico.usarContra(metal);
			i++;
		}
		
		assertEquals(material.getID(), 3);
	}
}
