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

<<<<<<< HEAD
=======
        if(cantidad == 0)
        {
            throw new ItemsInsuficientesExcepcion();
        }
>>>>>>> a39d4e594169475a83914d71a0b096f4dcb97a2b
        if (cantidad > 0)
            cantidad--;

        if(cantidad == 0)
            objeto = new MaterialNulo();

    }
}
