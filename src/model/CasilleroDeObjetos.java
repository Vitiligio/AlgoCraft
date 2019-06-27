package model;

import model.Excepciones.ItemsInsuficientesExcepcion;

public class CasilleroDeObjetos {

    private AgregableAlInventario objeto;
    private int cantidad;

    public CasilleroDeObjetos(){

        objeto = new MaterialNulo();
        cantidad = 0;
    }

    public int getIDObjeto() {

        return objeto.getID();
    }

    public void aumentarCantidad() {

        cantidad++;
    }

    public void asignarObjeto(AgregableAlInventario objeto) {

        if(cantidad == 0)
            this.objeto = objeto;


        aumentarCantidad();
    }

    public int getCantidadObjeto() {

        return cantidad;
    }

    public void disminuirCantidad() {

        if (cantidad > 0)
            cantidad--;

        if(cantidad == 0)
            objeto = new MaterialNulo();

    }
}
