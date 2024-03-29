package model;

import model.Excepciones.CodigoDeHerramientaInvalidoError;

public class MesaDeCrafteo {

    private CasilleroDeObjetos [][] tabla;
    private RecetasDeConstruccion recetas;

    public MesaDeCrafteo(){

        tabla = new CasilleroDeObjetos [3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tabla[i][j] = new CasilleroDeObjetos();
            }
        }

        recetas = new RecetasDeConstruccion();
    }
    
    public void reiniciar() {

       new MesaDeCrafteo();
    }

    public String generarCodigo(){

        String codigo = "";

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                codigo = codigo.concat(Integer.toString(tabla[i][j].getIDObjeto()));
            }
        }

        return codigo;
    }

    public void insertarMaterialEnPosicion(Material material, int fila, int columna){


        tabla[fila][columna].asignarObjeto(material);
    }

    public Herramienta construirHerramienta() {

        String codigo = generarCodigo();
        return recetas.obtenerHerramienta(codigo);
    }

    public void disminuirCantidadEnTodasLasPosiciones(){

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
            	try {
            		tabla[i][j].disminuirCantidad();
            	}
            	catch (Exception ItemsInsuficentesExcepcion) {
            		continue;
            	}
            }
        }
    }

    public int cantidadTotal(){

        int contador = 0;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                contador += tabla[i][j].getCantidadObjeto();
            }
        }

        return contador;
    }

    public CasilleroDeObjetos getCasillero(int i, int j){

        return tabla[i][j];
    }
}
