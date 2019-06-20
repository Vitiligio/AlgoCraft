package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HandlerDeImagenes {

    public ImageView buscarImagenPorID(int ID){

        ImageView imagen = new ImageView();
        switch(ID){

            case 0:
                imagen.setImage(new Image("personaje.png"));
            break;

            case 1:
                imagen.setImage(new Image("arbol.png"));
            break;

            case 2:
                imagen.setImage(new Image("roca.png"));
            break;

            default:
                imagen.setImage(new Image("pasto.png"));
            break;
        }
        return imagen;
    }
}
