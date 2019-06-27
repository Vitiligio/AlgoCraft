package application;

import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;

public class VistaMadera extends Vista {

    protected VistaMadera(GridPane grilla, int i, int j) {
        super(grilla, i, j);
        textura.setImage(new Image("file:img/arbol.png"));
    }
}
