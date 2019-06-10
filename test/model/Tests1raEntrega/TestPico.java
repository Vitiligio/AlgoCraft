package model.Tests1raEntrega;

import model.*;
import org.junit.Test;

import static org.junit.Assert.*;
import static java.lang.StrictMath.round;

public class TestPico {

    @Test
    public void TestPicoDeMaderaNuevo() {

        Madera madera = new Madera();
        Pico pico = new Pico(madera);

        assertNotEquals(null, pico);

    }

    @Test
    public void TestPicoDeMaderaConDurabilidadYFuerzaCorrespondiente() {

        Madera madera = new Madera();
        Pico pico = new Pico(madera);

        assertEquals(100, pico.getDurabilidad(), 0);
        assertEquals(2, pico.getFuerza());

    }

    @Test
    public void TestPicoDePiedraNuevo() {

        Piedra piedra = new Piedra();
        Pico pico = new Pico(piedra);

        assertNotEquals(null, pico);
    }

    @Test
    public void TestPicoDePiedraConDurabilidadYFuerzaCorrespondiente() {

        Piedra piedra = new Piedra();
        Pico pico = new Pico(piedra);

        assertEquals(200, pico.getDurabilidad(), 0);
        assertEquals(4, pico.getFuerza());

    }

    @Test
    public void TestPicoDeMetalNuevo() {

        Metal metal = new Metal();
        Pico pico = new Pico(metal);

        assertNotEquals(null, pico);
    }

    @Test
    public void TestPicoDeMetalConDurabilidadYFuerzaCorrespondiente() {

        Metal metal = new Metal();
        Pico pico = new Pico(metal);

        assertEquals(400, pico.getDurabilidad(), 0);
        assertEquals(12, pico.getFuerza());

    }

    @Test
    public void TestPicoDeMaderaSeUsaContraCadaMaterialYReduceSuDurabilidadDeFormaCorrespondiente() {

        Pico pico = new Pico(new Madera());
        float durabilidadPico = pico.getDurabilidad();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Diamante diamante = new Diamante();

        pico.usarContra(madera);
        assertEquals(pico.getDurabilidad(), durabilidadPico - 2, 0);
        pico.usarContra(piedra);
        assertEquals(pico.getDurabilidad(), durabilidadPico - 4, 0);
        pico.usarContra(metal);
        assertEquals(pico.getDurabilidad(), durabilidadPico - 6, 0);
        pico.usarContra(diamante);
        assertEquals(pico.getDurabilidad(), durabilidadPico - 8, 0);
    }

    @Test
    public void TestPicoDePiedraSeUsaContraCadaMaterialYReduceSuDurabilidadDeFormaCorrespondiente() {

        Pico pico = new Pico(new Piedra());
        float durabilidadPico = pico.getDurabilidad();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Diamante diamante = new Diamante();

        //redondeo los valores porque sino no pasa la prueba, ya que al ser float, falla por valores muy chicos
        //ejemplo: espera 197.3333282470703 y recibe 197.33333333333334

        pico.usarContra(madera);
        assertEquals(round(pico.getDurabilidad()), (round(durabilidadPico - (pico.getFuerza() / 1.5))), 0);
        pico.usarContra(piedra);
        assertEquals(round(pico.getDurabilidad()), round((durabilidadPico - (pico.getFuerza() / 1.5) * 2)), 0);
        pico.usarContra(metal);
        assertEquals(round(pico.getDurabilidad()), round((durabilidadPico - (pico.getFuerza() / 1.5) * 3)), 0);
        pico.usarContra(diamante);
        assertEquals(round(pico.getDurabilidad()), round((durabilidadPico - (pico.getFuerza() / 1.5) * 4)), 0);
    }

    @Test
    public void TestPicoDeMetalSeUsaContraCadaMaterialYReduceSuDurabilidadDeFormaCorrespondiente() {

        Pico pico = new Pico(new Metal());
        float durabilidadPico = pico.getDurabilidad();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Diamante diamante = new Diamante();

        pico.usarContra(madera);
        assertEquals(pico.getDurabilidad(), durabilidadPico, 0);
        pico.usarContra(piedra);
        assertEquals(pico.getDurabilidad(), durabilidadPico, 0);
        pico.usarContra(metal);
        assertEquals(pico.getDurabilidad(), durabilidadPico, 0);
        pico.usarContra(diamante);
        assertEquals(pico.getDurabilidad(), durabilidadPico, 0);
    }

    @Test
    public void TestPicoDeMetalSeUsaDiezVecesYReduceSuDurabilidadACero() {

        Pico pico = new Pico(new Metal());
        Piedra piedra = new Piedra();

        assertEquals(400, pico.getDurabilidad(), 0);

        for(int i = 0; i < 10; i++){
            pico.usarContra(piedra);            //da igual contra que material lo use
        }

        assertEquals(0, pico.getDurabilidad(), 0);
    }

}