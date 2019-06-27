package application;

import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;

public class VistaPersonaje extends Vista {

    protected VistaPersonaje(GridPane grilla, int i, int j) {
        super(grilla, i, j);
        textura.setImage(new Image("file:img/personaje.png"));
    }
}
