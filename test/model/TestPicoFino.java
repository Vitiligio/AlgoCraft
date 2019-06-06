package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestPicoFino {

	@Test
	public void testPicoFinoSeCreaConDurabilidadAdecuada() {
		
		PicoFino picoFino = new PicoFino();
		assertEquals(1000, picoFino.getDurabilidad(), 0);
	}
	
	@Test
	public void testPicoFinoSeCreaConFuerzaAdecuada() {
		
		PicoFino picoFino = new PicoFino();
		assertEquals(20, picoFino.getFuerza(), 0);
	}
	
	@Test
	public void testPicoFinoContraDiamanteReduceDurabilidad() {
		
		Diamante diamante = new Diamante();
		PicoFino picoFino = new PicoFino();
		
		picoFino.usarContra(diamante);
		assertEquals(900, picoFino.getDurabilidad(), 0);
	}
	
	@Test
	public void testPicoFinoContraMetalNoReduceDurabilidad() {
		
		Metal metal = new Metal();
		PicoFino picoFino = new PicoFino();
		
		picoFino.usarContra(metal);
		assertEquals(1000, picoFino.getDurabilidad(), 0);
	}
	
	@Test
	public void testPicoFinoContraPiedraNoReduceDurabilidad() {
		
		Piedra piedra = new Piedra();
		PicoFino picoFino = new PicoFino();
		
		picoFino.usarContra(piedra);
		assertEquals(1000, picoFino.getDurabilidad(), 0);
	}
	
	@Test 
	public void testPicoFinoSeDesgasteBien() {
		
		PicoFino picoFino = new PicoFino();
		
		picoFino.desgastar();
		assertEquals(900, picoFino.getDurabilidad(), 0);
		
		picoFino.desgastar();
		assertEquals(810, picoFino.getDurabilidad(), 0);
	}
}
