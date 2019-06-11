package model.Tests2daEntrega;

import model.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestConstruccionDeHerramientas {

    @Test
    public void TestRecetaDeHachaDeMaderaInicializadaCorrectamente(){

        RecetasDeConstruccion recetas = new RecetasDeConstruccion();
        String codigo = "110110010";

        Herramienta herramienta = recetas.obtenerHerramienta(codigo);
        assertNotEquals(null, herramienta);

        Material material = herramienta.getMaterial();
        assertNotEquals(null, material);

        assertEquals(100, herramienta.getDurabilidad(), 0);
        assertEquals(2, herramienta.getFuerza());
        assertEquals(10, material.getDurabilidad());
    }

    @Test
    public void TestRecetaDeHachaDePiedraInicializadaCorrectamente(){

        RecetasDeConstruccion recetas = new RecetasDeConstruccion();
        String codigo = "220210010";

        Herramienta herramienta = recetas.obtenerHerramienta(codigo);
        assertNotEquals(null, herramienta);

        Material material = herramienta.getMaterial();
        assertNotEquals(null, material);

        assertEquals(200, herramienta.getDurabilidad(), 0);
        assertEquals(5, herramienta.getFuerza());
        assertEquals(30, material.getDurabilidad());
    }

    @Test
    public void TestRecetaDeHachaDeMetalInicializadaCorrectamente(){

        RecetasDeConstruccion recetas = new RecetasDeConstruccion();
        String codigo = "330310010";

        Herramienta herramienta = recetas.obtenerHerramienta(codigo);
        assertNotEquals(null, herramienta);

        Material material = herramienta.getMaterial();
        assertNotEquals(null, material);

        assertEquals(400, herramienta.getDurabilidad(), 0);
        assertEquals(10, herramienta.getFuerza());
        assertEquals(50, material.getDurabilidad());
    }

    @Test
    public void TestRecetaDePicoDeMaderaInicializadoCorrectamente(){

        RecetasDeConstruccion recetas = new RecetasDeConstruccion();
        String codigo = "111010010";

        Herramienta herramienta = recetas.obtenerHerramienta(codigo);
        assertNotEquals(null, herramienta);

        Material material = herramienta.getMaterial();
        assertNotEquals(null, material);

        assertEquals(100, herramienta.getDurabilidad(), 0);
        assertEquals(2, herramienta.getFuerza());
        assertEquals(10, material.getDurabilidad());
    }

    @Test
    public void TestRecetaDePicoDePiedraInicializadoCorrectamente(){

        RecetasDeConstruccion recetas = new RecetasDeConstruccion();
        String codigo = "222010010";

        Herramienta herramienta = recetas.obtenerHerramienta(codigo);
        assertNotEquals(null, herramienta);

        Material material = herramienta.getMaterial();
        assertNotEquals(null, material);

        assertEquals(200, herramienta.getDurabilidad(), 0);
        assertEquals(4, herramienta.getFuerza());
        assertEquals(30, material.getDurabilidad());
    }

    @Test
    public void TestRecetaDePicoDeMetalInicializadoCorrectamente(){

        RecetasDeConstruccion recetas = new RecetasDeConstruccion();
        String codigo = "333010010";

        Herramienta herramienta = recetas.obtenerHerramienta(codigo);
        assertNotEquals(null, herramienta);

        Material material = herramienta.getMaterial();
        assertNotEquals(null, material);

        assertEquals(400, herramienta.getDurabilidad(), 0);
        assertEquals(12, herramienta.getFuerza());
        assertEquals(50, material.getDurabilidad());
    }

    @Test
    public void TestRecetaDePicoFinoInicializadoCorrectamente(){

        RecetasDeConstruccion recetas = new RecetasDeConstruccion();
        String codigo = "333210010";

        Herramienta herramienta = recetas.obtenerHerramienta(codigo);
        assertNotEquals(null, herramienta);

        assertEquals(1000, herramienta.getDurabilidad(), 0);
        assertEquals(20, herramienta.getFuerza());
    }
}