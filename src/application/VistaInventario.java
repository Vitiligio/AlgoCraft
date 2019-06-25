package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import model.CasilleroDeObjetos;

public class VistaInventario extends Rectangle {

    private ImageView textura;
    private CasilleroDeObjetos casillero;

    public VistaInventario(CasilleroDeObjetos casillero){

        textura = new ImageView();
        this.casillero = casillero;
        setTextura(casillero.getIDObjeto());
    }

    public ImageView getTextura(){

        return textura;
    }

    private void setTextura(int ID){

        switch (ID){

            case 0:
                textura.setImage(new Image("inventario_vacio.png"));
            break;

            case 5:
                textura.setImage(new Image("personaje.png"));
            break;
        }
    }

}
