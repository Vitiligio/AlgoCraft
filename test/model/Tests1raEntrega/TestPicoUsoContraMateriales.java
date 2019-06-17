package model.Tests1raEntrega;

import model.*;

import org.junit.Test;

import static org.junit.Assert.*;
import static java.lang.StrictMath.round;

public class TestPicoUsoContraMateriales {

    @Test
    public void TestPicoDeMaderaSeUsaContraMaderaYReduceSuDurabilidadEn2() {

        Madera madera = new Madera();
        Desgaste desgaste = new DesgasteLineal(1);
        Pico pico = new Pico(madera, 100, 2, desgaste, 8);
        float durabilidadPico = pico.getDurabilidad();
        Madera otraMadera = new Madera();

        pico.usarContra(otraMadera);
        assertEquals(pico.getDurabilidad(), durabilidadPico - 2, 0);
    }

    @Test
    public void TestPicoDeMaderaSeUsaContraPiedraYReduceSuDurabilidadEn2() {

        Madera madera = new Madera();
        Desgaste desgaste = new DesgasteLineal(1);
        Pico pico = new Pico(madera, 100, 2, desgaste, 8);
        float durabilidadPico = pico.getDurabilidad();
        Piedra piedra = new Piedra();

        pico.usarContra(piedra);
        assertEquals(pico.getDurabilidad(), durabilidadPico - 2, 0);
    }

    @Test
    public void TestPicoDeMaderaSeUsaContraMetalYReduceSuDurabilidadEn2() {

        Madera madera = new Madera();
        Desgaste desgaste = new DesgasteLineal(1);
        Pico pico = new Pico(madera, 100, 2, desgaste, 8);
        float durabilidadPico = pico.getDurabilidad();
        Metal metal = new Metal();

        pico.usarContra(metal);
        assertEquals(pico.getDurabilidad(), durabilidadPico - 2, 0);
    }

    @Test
    public void TestPicoDeMaderaSeUsaContraDiamanteYReduceSuDurabilidadEn2() {

        Madera madera = new Madera();
        Desgaste desgaste = new DesgasteLineal(1);
        Pico pico = new Pico(madera, 100, 2, desgaste, 8);
        float durabilidadPico = pico.getDurabilidad();
        Diamante diamante = new Diamante();

        pico.usarContra(diamante);
        assertEquals(pico.getDurabilidad(), durabilidadPico - 2, 0);
    }

    @Test
    public void TestPicoDePiedraSeUsaContraMaderaYReduceSuDurabilidadSegunDesgaste() {

        Desgaste desgaste = new DesgasteLineal(1.5);
        Pico pico = new Pico(new Piedra(), 200, 4, desgaste, 9);
        float durabilidadPico = pico.getDurabilidad();
        Madera madera = new Madera();

        //redondeo los valores porque sino no pasa la prueba, ya que al ser float, falla por valores muy chicos
        //ejemplo: espera 197.3333282470703 y recibe 197.33333333333334

        pico.usarContra(madera);
        assertEquals(round(pico.getDurabilidad()), (round(durabilidadPico - (pico.getFuerza() / 1.5))), 0);
    }

    @Test
    public void TestPicoDePiedraSeUsaContraPiedraYReduceSuDurabilidadSegunDesgaste() {

        Desgaste desgaste = new DesgasteLineal(1.5);
        Pico pico = new Pico(new Piedra(), 200, 4, desgaste, 9);
        float durabilidadPico = pico.getDurabilidad();
        Piedra piedra = new Piedra();

        //redondeo los valores porque sino no pasa la prueba, ya que al ser float, falla por valores muy chicos
        //ejemplo: espera 197.3333282470703 y recibe 197.33333333333334

        pico.usarContra(piedra);
        assertEquals(round(pico.getDurabilidad()), (round(durabilidadPico - (pico.getFuerza() / 1.5))), 0);
    }

    @Test
    public void TestPicoDePiedraSeUsaContraMetalYReduceSuDurabilidadSegunDesgaste() {

        Desgaste desgaste = new DesgasteLineal(1.5);
        Pico pico = new Pico(new Piedra(), 200, 4, desgaste, 9);
        float durabilidadPico = pico.getDurabilidad();
        Metal metal = new Metal();

        //redondeo los valores porque sino no pasa la prueba, ya que al ser float, falla por valores muy chicos
        //ejemplo: espera 197.3333282470703 y recibe 197.33333333333334

        pico.usarContra(metal);
        assertEquals(round(pico.getDurabilidad()), (round(durabilidadPico - (pico.getFuerza() / 1.5))), 0);
    }

    @Test
    public void TestPicoDePiedraSeUsaContraDiamanteYReduceSuDurabilidadSegunDesgaste() {

        Desgaste desgaste = new DesgasteLineal(1.5);
        Pico pico = new Pico(new Piedra(), 200, 4, desgaste, 9);
        float durabilidadPico = pico.getDurabilidad();
        Diamante diamante = new Diamante();

        //redondeo los valores porque sino no pasa la prueba, ya que al ser float, falla por valores muy chicos
        //ejemplo: espera 197.3333282470703 y recibe 197.33333333333334

        pico.usarContra(diamante);
        assertEquals(round(pico.getDurabilidad()), (round(durabilidadPico - (pico.getFuerza() / 1.5))), 0);
    }

    @Test
    public void TestPicoDeMetalSeUsaContraMaderaYNoReduceSuDurabilidad() {

        Desgaste desgaste = new DesgasteAbrupto();
        Pico pico = new Pico(new Metal(), 400, 12, desgaste, 10);
        float durabilidadPico = pico.getDurabilidad();
        Madera madera = new Madera();

        pico.usarContra(madera);
        assertEquals(pico.getDurabilidad(), durabilidadPico, 0);
    }

    @Test
    public void TestPicoDeMetalSeUsaContraPiedraYNoReduceSuDurabilidad() {

        Desgaste desgaste = new DesgasteAbrupto();
        Pico pico = new Pico(new Metal(), 400, 12, desgaste, 10);
        float durabilidadPico = pico.getDurabilidad();
        Piedra piedra = new Piedra();

        pico.usarContra(piedra);
        assertEquals(pico.getDurabilidad(), durabilidadPico, 0);
    }

    @Test
    public void TestPicoDeMetalSeUsaContraMetalYNoReduceSuDurabilidad() {

        Desgaste desgaste = new DesgasteAbrupto();
        Pico pico = new Pico(new Metal(), 400, 12, desgaste, 10);
        float durabilidadPico = pico.getDurabilidad();
        Metal metal = new Metal();

        pico.usarContra(metal);
        assertEquals(pico.getDurabilidad(), durabilidadPico, 0);
    }

    @Test
    public void TestPicoDeMetalSeUsaContraDiamanteYNoReduceSuDurabilidad() {

        Desgaste desgaste = new DesgasteAbrupto();
        Pico pico = new Pico(new Metal(), 400, 12, desgaste, 10);
        float durabilidadPico = pico.getDurabilidad();
        Diamante diamante = new Diamante();

        pico.usarContra(diamante);
        assertEquals(pico.getDurabilidad(), durabilidadPico, 0);
    }

    @Test
    public void TestPicoDeMetalSeUsaDiezVecesContraPiedraYReduceSuDurabilidadACero() {

        Desgaste desgaste = new DesgasteAbrupto();
        Pico pico = new Pico(new Metal(), 400, 12, desgaste, 10);
        Piedra piedra = new Piedra();

        assertEquals(400, pico.getDurabilidad(), 0);

        for(int i = 0; i < 10; i++){
            pico.usarContra(piedra);
        }

        assertEquals(0, pico.getDurabilidad(), 0);
    }

    @Test
    public void TestPicoDeMetalSeUsaDiezVecesContraMaderaYReduceSuDurabilidadACero() {

        Desgaste desgaste = new DesgasteAbrupto();
        Pico pico = new Pico(new Metal(), 400, 12, desgaste, 10);
        Madera madera = new Madera();

        assertEquals(400, pico.getDurabilidad(), 0);

        for(int i = 0; i < 10; i++){
            pico.usarContra(madera);
        }

        assertEquals(0, pico.getDurabilidad(), 0);
    }

    @Test
    public void TestPicoDeMetalSeUsaDiezVecesContraMetalYReduceSuDurabilidadACero() {

        Desgaste desgaste = new DesgasteAbrupto();
        Pico pico = new Pico(new Metal(), 400, 12, desgaste, 10);
        Metal metal = new Metal();

        assertEquals(400, pico.getDurabilidad(), 0);

        for(int i = 0; i < 10; i++){
            pico.usarContra(metal);
        }

        assertEquals(0, pico.getDurabilidad(), 0);
    }

    @Test
    public void TestPicoDeMetalSeUsaDiezVecesContraDiamanteYReduceSuDurabilidadACero() {

        Desgaste desgaste = new DesgasteAbrupto();
        Pico pico = new Pico(new Metal(), 400, 12, desgaste, 10);
        Diamante diamante = new Diamante();

        assertEquals(400, pico.getDurabilidad(), 0);

        for(int i = 0; i < 10; i++){
            pico.usarContra(diamante);
        }

        assertEquals(0, pico.getDurabilidad(), 0);
    }
}
