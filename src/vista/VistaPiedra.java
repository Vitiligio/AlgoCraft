package vista;

import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;

public class VistaPiedra extends Vista {

    protected VistaPiedra(GridPane grilla, int i, int j) {
        super(grilla, i, j);
        textura.setImage(new Image("file:img/roca.png"));
    }
}
