package model.Tests2daEntrega;

import model.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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

    @Test
    public void TestInsertoMaterialesCorrectamenteEnLaTablaYObtengoPicoDeMadera(){

        MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
        RecetasDeConstruccion recetas = new RecetasDeConstruccion();

        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 0, 0);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 0, 1);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 0, 2);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 1, 1);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 2, 1);
        String codigo = mesaDeCrafteo.generarCodigo();

        Herramienta herramienta = recetas.obtenerHerramienta(codigo);
        Material material = herramienta.getMaterial();

        assertEquals(100, herramienta.getDurabilidad(), 0);
        assertEquals(2, herramienta.getFuerza());
        assertEquals(10, material.getDurabilidad());
    }

    @Test
    public void TestInsertoMaterialesCorrectamenteEnLaTablaYObtengoPicoDePiedra(){

        MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
        RecetasDeConstruccion recetas = new RecetasDeConstruccion();

        mesaDeCrafteo.insertarIDMaterialEnPosicion(2, 0, 0);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(2, 0, 1);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(2, 0, 2);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 1, 1);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 2, 1);
        String codigo = mesaDeCrafteo.generarCodigo();

        Herramienta herramienta = recetas.obtenerHerramienta(codigo);
        Material material = herramienta.getMaterial();

        assertEquals(200, herramienta.getDurabilidad(), 0);
        assertEquals(4, herramienta.getFuerza());
        assertEquals(30, material.getDurabilidad());
    }

    @Test
    public void TestInsertoMaterialesCorrectamenteEnLaTablaYObtengoPicoDeMetal(){

        MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
        RecetasDeConstruccion recetas = new RecetasDeConstruccion();

        mesaDeCrafteo.insertarIDMaterialEnPosicion(3, 0, 0);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(3, 0, 1);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(3, 0, 2);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 1, 1);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 2, 1);
        String codigo = mesaDeCrafteo.generarCodigo();

        Herramienta herramienta = recetas.obtenerHerramienta(codigo);
        Material material = herramienta.getMaterial();

        assertEquals(400, herramienta.getDurabilidad(), 0);
        assertEquals(12, herramienta.getFuerza());
        assertEquals(50, material.getDurabilidad());
    }

    @Test
    public void TestInsertoMaterialesCorrectamenteEnLaTablaYObtengoHachaDeMadera(){

        MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
        RecetasDeConstruccion recetas = new RecetasDeConstruccion();

        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 0, 0);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 0, 1);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 1, 0);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 1, 1);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 2, 1);
        String codigo = mesaDeCrafteo.generarCodigo();

        Herramienta herramienta = recetas.obtenerHerramienta(codigo);
        Material material = herramienta.getMaterial();

        assertEquals(100, herramienta.getDurabilidad(), 0);
        assertEquals(2, herramienta.getFuerza());
        assertEquals(10, material.getDurabilidad());
    }

    @Test
    public void TestInsertoMaterialesCorrectamenteEnLaTablaYObtengoHachaDePiedra(){

        MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
        RecetasDeConstruccion recetas = new RecetasDeConstruccion();

        mesaDeCrafteo.insertarIDMaterialEnPosicion(2, 0, 0);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(2, 0, 1);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(2, 1, 0);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 1, 1);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 2, 1);
        String codigo = mesaDeCrafteo.generarCodigo();

        Herramienta herramienta = recetas.obtenerHerramienta(codigo);
        Material material = herramienta.getMaterial();

        assertEquals(200, herramienta.getDurabilidad(), 0);
        assertEquals(5, herramienta.getFuerza());
        assertEquals(30, material.getDurabilidad());
    }

    @Test
    public void TestInsertoMaterialesCorrectamenteEnLaTablaYObtengoHachaDeMetal(){

        MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
        RecetasDeConstruccion recetas = new RecetasDeConstruccion();

        mesaDeCrafteo.insertarIDMaterialEnPosicion(3, 0, 0);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(3, 0, 1);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(3, 1, 0);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 1, 1);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 2, 1);
        String codigo = mesaDeCrafteo.generarCodigo();

        Herramienta herramienta = recetas.obtenerHerramienta(codigo);
        Material material = herramienta.getMaterial();

        assertEquals(400, herramienta.getDurabilidad(), 0);
        assertEquals(10, herramienta.getFuerza());
        assertEquals(50, material.getDurabilidad());
    }

    @Test
    public void TestInsertoMaterialesCorrectamenteEnLaTablaYObtengoPicoFino(){

        MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
        RecetasDeConstruccion recetas = new RecetasDeConstruccion();

        mesaDeCrafteo.insertarIDMaterialEnPosicion(3, 0, 0);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(3, 0, 1);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(3, 0, 2);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(2, 1, 0);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 1, 1);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 2, 1);
        String codigo = mesaDeCrafteo.generarCodigo();

        Herramienta herramienta = recetas.obtenerHerramienta(codigo);

        assertEquals(1000, herramienta.getDurabilidad(), 0);
        assertEquals(20, herramienta.getFuerza());
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void TestCodigoInvalidoLanzaExcepcion(){

        RecetasDeConstruccion recetas = new RecetasDeConstruccion();
        String codigo = "123123123";

        thrown.expect(CodigoDeHerramientaInvalidoError.class);
        Herramienta herramienta = recetas.obtenerHerramienta(codigo);
    }

    @Test
    public void TestCreoDosHachasDeMaderaSeguidasYNoSonLaMisma(){

        RecetasDeConstruccion recetas = new RecetasDeConstruccion();
        String codigo = "110110010";

        Herramienta hacha1 = recetas.obtenerHerramienta(codigo);
        Herramienta hacha2 = recetas.obtenerHerramienta(codigo);

        hacha1.usarContra(new Madera());
        assertEquals(98, hacha1.getDurabilidad(), 0);
        assertEquals(100, hacha2.getDurabilidad(), 0);
    }
}