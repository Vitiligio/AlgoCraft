package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PicoTest {

    @Test
    public void TestPicoDeMaderaNuevo(){

        Madera madera = new Madera();
        Pico pico = new Pico (madera);

        assertNotEquals(null, pico);

    }

    @Test
    public void TestPicoDeMaderaConDurabilidadYFuerzaCorrespondiente(){

        Madera madera = new Madera();
        Pico pico = new Pico (madera);

        assertEquals(100, pico.getDurabilidad());
        assertEquals(2, pico.getFuerza());

    }

    @Test
    public void TestPicoDeMetalNuevo(){

        Metal metal = new Metal();
        Pico pico = new Pico (metal);

        assertEquals(400, pico.getDurabilidad());
        assertEquals(12, pico.getFuerza());

    }

}