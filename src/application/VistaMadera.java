package application;

import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;

public class VistaMadera extends Vista {

    protected VistaMadera(GridPane grilla, int i, int j) {
        super(grilla, j, i);
        textura.setImage(new Image("arbol.png"));
    }
}
