package model.Tests2daEntrega;

import model.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestInventario {

    @Test
    public void TestAgrego10InstanciasDeAlgunMaterialAlInventarioYAumentaSuNumeroEn10(){

        Inventario inventario = new Inventario();
        Piedra piedra0 = new Piedra();
        Piedra piedra1 = new Piedra();
        Piedra piedra2 = new Piedra();
        Piedra piedra3 = new Piedra();
        Piedra piedra4 = new Piedra();
        Piedra piedra5 = new Piedra();
        Piedra piedra6 = new Piedra();
        Piedra piedra7 = new Piedra();
        Piedra piedra8 = new Piedra();
        Piedra piedra9 = new Piedra();

        inventario.agregarAlInventario(piedra0);
        inventario.agregarAlInventario(piedra1);
        inventario.agregarAlInventario(piedra2);
        inventario.agregarAlInventario(piedra3);
        inventario.agregarAlInventario(piedra4);
        inventario.agregarAlInventario(piedra5);
        inventario.agregarAlInventario(piedra6);
        inventario.agregarAlInventario(piedra7);
        inventario.agregarAlInventario(piedra8);
        inventario.agregarAlInventario(piedra9);

        assertEquals(10, inventario.getCantidad(piedra0));
        assertEquals(10, inventario.getCantidad(piedra7));
    }

    @Test
    public void TestAgrego10InstanciasDeAlgunaHerramientaAlInventarioYAumentaSuNumeroEn10(){

        Inventario inventario = new Inventario();
        Pico pico0 = new Pico(new Madera(), 100, 2, new DesgasteLineal(1), 8);
        Pico pico1 = new Pico(new Madera(), 100, 2, new DesgasteLineal(1), 8);
        Pico pico2 = new Pico(new Madera(), 100, 2, new DesgasteLineal(1), 8);
        Pico pico3 = new Pico(new Madera(), 100, 2, new DesgasteLineal(1), 8);
        Pico pico4 = new Pico(new Madera(), 100, 2, new DesgasteLineal(1), 8);
        Pico pico5 = new Pico(new Madera(), 100, 2, new DesgasteLineal(1), 8);
        Pico pico6 = new Pico(new Madera(), 100, 2, new DesgasteLineal(1), 8);
        Pico pico7 = new Pico(new Madera(), 100, 2, new DesgasteLineal(1), 8);
        Pico pico8 = new Pico(new Madera(), 100, 2, new DesgasteLineal(1), 8);
        Pico pico9 = new Pico(new Madera(), 100, 2, new DesgasteLineal(1), 8);

        inventario.agregarAlInventario(pico0);
        inventario.agregarAlInventario(pico1);
        inventario.agregarAlInventario(pico2);
        inventario.agregarAlInventario(pico3);
        inventario.agregarAlInventario(pico4);
        inventario.agregarAlInventario(pico5);
        inventario.agregarAlInventario(pico6);
        inventario.agregarAlInventario(pico7);
        inventario.agregarAlInventario(pico8);
        inventario.agregarAlInventario(pico9);

        assertEquals(10, inventario.getCantidad(pico0));
        assertEquals(10, inventario.getCantidad(pico7));
    }

    @Test
    public void TestCantidadDeUnElementoInexistenteEnElInventarioEsCero(){

        Inventario inventario = new Inventario();
        Piedra piedra = new Piedra();

        assertEquals(0, inventario.getCantidad(piedra));

        Madera madera0 = new Madera();
        Madera madera1 = new Madera();
        Metal metal = new Metal();

        inventario.agregarAlInventario(madera0);
        inventario.agregarAlInventario(madera1);
        inventario.agregarAlInventario(metal);

        assertEquals(0, inventario.getCantidad(piedra));
    }

    @Test
    public void TestSaco2InstanciasDeAlgunObjetoDelInventarioYDisminuyeSuNumeroEn2(){

        Inventario inventario = new Inventario();
        Piedra piedra0 = new Piedra();
        Piedra piedra1 = new Piedra();
        Piedra piedra2 = new Piedra();
        Piedra piedra3 = new Piedra();
        Piedra piedra4 = new Piedra();

        inventario.agregarAlInventario(piedra0);
        inventario.agregarAlInventario(piedra1);
        inventario.agregarAlInventario(piedra2);
        inventario.agregarAlInventario(piedra3);
        inventario.agregarAlInventario(piedra4);

        assertEquals(5, inventario.getCantidad(piedra4));

        inventario.sacarDelInventario(piedra4);
        inventario.sacarDelInventario(piedra3);

        assertEquals(3, inventario.getCantidad(piedra0));
        assertEquals(3, inventario.getCantidad(piedra2));

        inventario.sacarDelInventario(piedra2);
        inventario.sacarDelInventario(piedra1);
        inventario.sacarDelInventario(piedra0);

        assertEquals(0, inventario.getCantidad(piedra0));
    }

    @Test
    public void TestSacoDelInventarioYPuedoVolverAAgregar(){

        Inventario inventario = new Inventario();
        Herramienta herramienta = inventario.getObjetoEquipado();

        inventario.sacarDelInventario(herramienta);
        assertEquals(0, inventario.getCantidad(herramienta));

        inventario.agregarAlInventario(herramienta);
        assertEquals(1, inventario.getCantidad(herramienta));
    }
}
