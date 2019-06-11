package model;

public class MesaDeCrafteo {

    private int [][] tabla;

    public MesaDeCrafteo(){

        tabla = new int [3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tabla[i][j] = 0;
            }
        }
    }

    public String generarCodigo(){

        String codigo = "";

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                codigo = codigo.concat(Integer.toString(tabla[i][j]));
            }
        }

        return codigo;
    }

    public void insertarIDMaterialEnPosicion(int IDMaterial, int fila, int columna){

        tabla[fila][columna] = IDMaterial;
    }
}
