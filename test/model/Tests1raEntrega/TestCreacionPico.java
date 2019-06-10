package model.Tests1raEntrega;

import model.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestCreacionPico {

    @Test
    public void TestPicoDeMaderaNuevo() {

        Madera madera = new Madera();
        Desgaste desgaste = new DesgasteLineal(1);
        Pico pico = new Pico(madera, 100, 2, desgaste);

        assertNotEquals(null, pico);

    }

    @Test
    public void TestPicoDeMaderaConDurabilidadYFuerzaCorrespondiente() {

        Madera madera = new Madera();
        Desgaste desgaste = new DesgasteLineal(1);
        Pico pico = new Pico(madera, 100, 2, desgaste);

        assertEquals(100, pico.getDurabilidad(), 0);
        assertEquals(2, pico.getFuerza());

    }

    @Test
    public void TestPicoDePiedraNuevo() {

        Piedra piedra = new Piedra();
        Desgaste desgaste = new DesgasteLineal(1.5);
        Pico pico = new Pico(piedra, 200, 4, desgaste);

        assertNotEquals(null, pico);
    }

    @Test
    public void TestPicoDePiedraConDurabilidadYFuerzaCorrespondiente() {

        Piedra piedra = new Piedra();
        Desgaste desgaste = new DesgasteLineal(1.5);
        Pico pico = new Pico(piedra, 200, 4, desgaste);

        assertEquals(200, pico.getDurabilidad(), 0);
        assertEquals(4, pico.getFuerza());

    }

    @Test
    public void TestPicoDeMetalNuevo() {

        Metal metal = new Metal();
        Desgaste desgaste = new DesgasteAbrupto();
        Pico pico = new Pico(metal, 400, 12, desgaste);

        assertNotEquals(null, pico);
    }

    @Test
    public void TestPicoDeMetalConDurabilidadYFuerzaCorrespondiente() {

        Metal metal = new Metal();
        Desgaste desgaste = new DesgasteAbrupto();
        Pico pico = new Pico(metal, 400, 12, desgaste);

        assertEquals(400, pico.getDurabilidad(), 0);
        assertEquals(12, pico.getFuerza());

    }
}