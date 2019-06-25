package application;

import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;

public class VistaPersonaje extends Vista {

    protected VistaPersonaje(GridPane grilla, int i, int j) {
        super(grilla, j, i);
        textura.setImage(new Image("personaje.png"));
    }
}
