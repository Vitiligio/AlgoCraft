package model;

import java.util.HashMap;

public class RecetasDeConstruccion {

    private HashMap<String, Herramienta> recetas;

    public RecetasDeConstruccion(){

        recetas = new HashMap<String, Herramienta>();

        recetas.put("110110010", new Hacha(new Madera(), 100, 2, new DesgasteLineal(1)));
        recetas.put("220210010", new Hacha(new Piedra(), 200, 5, new DesgasteLineal(1)));
        recetas.put("330310010", new Hacha(new Metal(), 400, 10, new DesgasteLineal(2)));
        recetas.put("111010010", new Pico(new Madera(), 100, 2, new DesgasteLineal(1)));
        recetas.put("222010010", new Pico(new Piedra(), 200, 4, new DesgasteLineal(1.5)));
        recetas.put("333010010", new Pico(new Metal(), 400, 12, new DesgasteAbrupto()));
        recetas.put("333210010", new PicoFino(1000, 20, new DesgasteFino()));
    }

    public Herramienta obtenerHerramienta(String codigo){

        Herramienta herramienta;
        herramienta = recetas.get(codigo);
        return herramienta;
    }
}
