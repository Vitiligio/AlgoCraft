package model;

public interface AgregableAlInventario {

    int getID();

    int getCantidad();

    void aumentarCantidad(AgregableAlInventario objeto);

    void disminuirCantidad();
}
