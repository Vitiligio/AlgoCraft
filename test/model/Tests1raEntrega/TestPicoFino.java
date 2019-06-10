package model.Tests1raEntrega;

import model.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPicoFino {

	@Test
	public void testPicoFinoSeCreaConDurabilidadAdecuada() {
		
		PicoFino picoFino = new PicoFino(1000, 20, new DesgasteFino());
		assertEquals(1000, picoFino.getDurabilidad(), 0);
	}
	
	@Test
	public void testPicoFinoSeCreaConFuerzaAdecuada() {

		PicoFino picoFino = new PicoFino(1000, 20, new DesgasteFino());
		assertEquals(20, picoFino.getFuerza(), 0);
	}
	
	@Test
	public void testPicoFinoContraDiamanteReduceDurabilidad() {
		
		Diamante diamante = new Diamante();
		PicoFino picoFino = new PicoFino(1000, 20, new DesgasteFino());
		
		picoFino.usarContra(diamante);
		assertEquals(900, picoFino.getDurabilidad(), 0);
	}
	
	@Test
	public void testPicoFinoContraMetalNoReduceDurabilidad() {
		
		Metal metal = new Metal();
		PicoFino picoFino = new PicoFino(1000, 20, new DesgasteFino());
		
		picoFino.usarContra(metal);
		assertEquals(1000, picoFino.getDurabilidad(), 0);
	}
	
	@Test
	public void testPicoFinoContraPiedraNoReduceDurabilidad() {
		
		Piedra piedra = new Piedra();
		PicoFino picoFino = new PicoFino(1000, 20, new DesgasteFino());
		
		picoFino.usarContra(piedra);
		assertEquals(1000, picoFino.getDurabilidad(), 0);
	}
	
	@Test 
	public void testPicoFinoSeDesgasteBien() {

		Diamante diamante = new Diamante();
		PicoFino picoFino = new PicoFino(1000, 20, new DesgasteFino());
		
		picoFino.usarContra(diamante);
		assertEquals(900, picoFino.getDurabilidad(), 0);
		
		picoFino.usarContra(diamante);
		assertEquals(810, picoFino.getDurabilidad(), 0);
	}
}
