package vista;

import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;

public class VistaDiamante extends Vista {

    protected VistaDiamante(GridPane grilla, int i, int j) {

        super(grilla, i, j);
        textura.setImage(new Image("file:img/diamante.png"));
    }
}
