package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestPico {

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

        assertEquals(100, pico.getDurabilidad(),0);
        assertEquals(2, pico.getFuerza());

    }

    @Test
    public void TestPicoDePiedraNuevo(){

        Piedra piedra = new Piedra();
        Pico pico = new Pico(piedra);

        assertNotEquals(null, pico);
    }

    @Test
    public void TestPicoDePiedraConDurabilidadYFuerzaCorrespondiente(){

        Piedra piedra = new Piedra();
        Pico pico = new Pico (piedra);

        assertEquals(200, pico.getDurabilidad(),0);
        assertEquals(4, pico.getFuerza());

    }

    @Test
    public void TestPicoDeMetalNuevo(){

        Metal metal = new Metal();
        Pico pico = new Pico (metal);

        assertNotEquals(null, pico);
    }

    @Test
    public void TestPicoDeMetalConDurabilidadYFuerzaCorrespondiente(){

        Metal metal = new Metal();
        Pico pico = new Pico (metal);

        assertEquals(400, pico.getDurabilidad(),0);
        assertEquals(12, pico.getFuerza());

    }

}