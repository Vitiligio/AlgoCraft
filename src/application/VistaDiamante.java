package application;

import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;

public class VistaDiamante extends Vista {

    protected VistaDiamante(GridPane grilla, int i, int j) {

        super(grilla, j, i);
        textura.setImage(new Image("diamante.png"));
    }
}
