package model.Tests2daEntrega;

import model.*;
import model.Excepciones.CodigoDeHerramientaInvalidoError;

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

        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 0, 0);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 0, 1);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 0, 2);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 1, 1);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 2, 1);
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

        mesaDeCrafteo.insertarMaterialEnPosicion(new Piedra(), 0, 0);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Piedra(), 0, 1);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Piedra(), 0, 2);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 1, 1);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 2, 1);
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

        mesaDeCrafteo.insertarMaterialEnPosicion(new Metal(), 0, 0);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Metal(), 0, 1);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Metal(), 0, 2);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 1, 1);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 2, 1);
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

        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 0, 0);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 0, 1);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 1, 0);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 1, 1);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 2, 1);
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

        mesaDeCrafteo.insertarMaterialEnPosicion(new Piedra(), 0, 0);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Piedra(), 0, 1);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Piedra(), 1, 0);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 1, 1);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 2, 1);
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

        mesaDeCrafteo.insertarMaterialEnPosicion(new Metal(), 0, 0);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Metal(), 0, 1);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Metal(), 1, 0);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 1, 1);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 2, 1);
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

        mesaDeCrafteo.insertarMaterialEnPosicion(new Metal(), 0, 0);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Metal(), 0, 1);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Metal(), 0, 2);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Piedra(), 1, 0);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 1, 1);
        mesaDeCrafteo.insertarMaterialEnPosicion(new Madera(), 2, 1);
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

    @Test
    public void TestConstruyoHerramientaYDisminuyenLosMateriales(){

        Personaje personaje = new Personaje();
        Inventario inventario = personaje.obtenerInventario();
        MesaDeCrafteo mesaDeCrafteo = personaje.obtenerMesaDeCrafteo();
        Pico pico = new Pico(new Madera(), 100, 2, new DesgasteLineal(1), 8);

        Madera madera = new Madera();
        personaje.agregarAlInventario(madera);
        personaje.agregarAlInventario(madera);
        personaje.agregarAlInventario(madera);
        personaje.agregarAlInventario(madera);
        personaje.agregarAlInventario(madera);
        assertEquals(0, mesaDeCrafteo.cantidadTotal());
        assertEquals(5, inventario.getCantidad(madera));

        personaje.insertarMaterialEnMesaDeCrafteoEnPosicion(new Madera(), 0, 0);
        personaje.insertarMaterialEnMesaDeCrafteoEnPosicion(new Madera(), 0, 1);
        personaje.insertarMaterialEnMesaDeCrafteoEnPosicion(new Madera(), 0, 2);
        personaje.insertarMaterialEnMesaDeCrafteoEnPosicion(new Madera(), 1, 1);
        personaje.insertarMaterialEnMesaDeCrafteoEnPosicion(new Madera(), 2, 1);

        assertEquals(0, inventario.getCantidad(madera));
        assertEquals(5, mesaDeCrafteo.cantidadTotal());

        personaje.construirHerramienta();
        assertEquals(0, mesaDeCrafteo.cantidadTotal());
        assertEquals(1, inventario.getCantidad(pico));
    }

    @Test
    public void TestNoConstruyoHerramientaYNoDisminuyenLosMateriales(){

        Personaje personaje = new Personaje();
        Inventario inventario = personaje.obtenerInventario();
        MesaDeCrafteo mesaDeCrafteo = personaje.obtenerMesaDeCrafteo();
        Pico pico = new Pico(new Madera(), 100, 2, new DesgasteLineal(1), 8);

        Madera madera = new Madera();
        personaje.agregarAlInventario(madera);
        personaje.agregarAlInventario(madera);
        personaje.agregarAlInventario(madera);
        personaje.agregarAlInventario(madera);
        personaje.agregarAlInventario(madera);
        assertEquals(0, mesaDeCrafteo.cantidadTotal());
        assertEquals(5, inventario.getCantidad(madera));

        //esto genera un codigo invalido, no voy a poder construir el pico
        personaje.insertarMaterialEnMesaDeCrafteoEnPosicion(new Madera(), 0, 0);
        personaje.insertarMaterialEnMesaDeCrafteoEnPosicion(new Madera(), 0, 1);
        personaje.insertarMaterialEnMesaDeCrafteoEnPosicion(new Madera(), 0, 2);
        personaje.insertarMaterialEnMesaDeCrafteoEnPosicion(new Madera(), 1, 1);
        personaje.insertarMaterialEnMesaDeCrafteoEnPosicion(new Madera(), 2, 2);

        assertEquals(0, inventario.getCantidad(madera));
        assertEquals(5, mesaDeCrafteo.cantidadTotal());

        try {
            personaje.construirHerramienta();
        }
        catch(CodigoDeHerramientaInvalidoError excepcion){ }

        assertEquals(5, mesaDeCrafteo.cantidadTotal());
        assertEquals(0, inventario.getCantidad(pico));
    }
}