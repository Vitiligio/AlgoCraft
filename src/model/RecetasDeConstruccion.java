package model;

import java.util.HashMap;

public class RecetasDeConstruccion {

    private HashMap<String, Herramienta> recetas;
    private final String PATRON_HACHA_MADERA = "110110010";
    private final String PATRON_HACHA_PIEDRA = "220210010";
    private final String PATRON_HACHA_METAL = "330310010";
    private final String PATRON_PICO_MADERA = "111010010";
    private final String PATRON_PICO_PIEDRA = "222010010";
    private final String PATRON_PICO_METAL = "333010010";
    private final String PATRON_PICO_FINO = "333210010";

    public RecetasDeConstruccion(){

        generarTabla();
    }

    public void generarTabla(){

        recetas = new HashMap<>();

        recetas.put(PATRON_HACHA_MADERA, new Hacha(new Madera(), 100, 2, new DesgasteLineal(1), 5));
        recetas.put(PATRON_HACHA_PIEDRA, new Hacha(new Piedra(), 200, 5, new DesgasteLineal(1), 6));
        recetas.put(PATRON_HACHA_METAL, new Hacha(new Metal(), 400, 10, new DesgasteLineal(2), 7));
        recetas.put(PATRON_PICO_MADERA, new Pico(new Madera(), 100, 2, new DesgasteLineal(1), 8));
        recetas.put(PATRON_PICO_PIEDRA, new Pico(new Piedra(), 200, 4, new DesgasteLineal(1.5), 9));
        recetas.put(PATRON_PICO_METAL, new Pico(new Metal(), 400, 12, new DesgasteAbrupto(), 10));
        recetas.put(PATRON_PICO_FINO, new PicoFino(1000, 20, new DesgasteFino()));
    }

    public Herramienta obtenerHerramienta(String codigo) {

        Herramienta herramienta;
        herramienta = recetas.get(codigo);

        if (herramienta == null)
            throw new CodigoDeHerramientaInvalidoError();

        generarTabla();
        return herramienta;
    }

}
