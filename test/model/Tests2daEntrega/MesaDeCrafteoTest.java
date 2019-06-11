package model.Tests2daEntrega;

import model.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class MesaDeCrafteoTest {

    @Test
    public void TestMesaDeCrafteoNueva(){

        MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
        assertNotEquals(null, mesaDeCrafteo);
    }

    @Test
    public void TestMesaVaciaGeneraCodigo000000000(){

        MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();

        String codigo = mesaDeCrafteo.generarCodigo();
        assertEquals("000000000", codigo);
    }

    @Test
    public void TestMaterialesDevuelvenSuNumeroDeIdentificacionCorrectamente(){

        //es una prueba de materiales, pero como la funcion se implemento a partir
        //de la 2da entrega la incluyo aca

        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Diamante diamante = new Diamante();

        assertEquals(1, madera.getID());
        assertEquals(2, piedra.getID());
        assertEquals(3, metal.getID());
        assertEquals(4, diamante.getID());
    }

    @Test
    public void TestInsertarNumerosEnLaTablaDevuelveCodigoCorrecto(){

        MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();

        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 0, 0);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 0, 1);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(1, 0, 2);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(2, 1, 0);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(2, 1, 1);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(2, 1, 2);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(3, 2, 0);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(3, 2, 1);
        mesaDeCrafteo.insertarIDMaterialEnPosicion(3, 2, 2);

        String codigo = mesaDeCrafteo.generarCodigo();

        assertEquals("111222333", codigo);
    }

}