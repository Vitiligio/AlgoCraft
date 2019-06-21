package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

public class VistaInventario extends Rectangle {

    public VistaInventario(){

        ImageView textura = new ImageView();
        textura.setImage(new Image("img/inventario_vacio.png"));
    }
}
