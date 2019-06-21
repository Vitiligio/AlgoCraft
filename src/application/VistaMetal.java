package application;

import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;

public class VistaMetal extends Vista{

    protected VistaMetal(GridPane grilla, int i, int j) {
        super(grilla, j, i);
        textura.setImage(new Image("img/metal.png"));
    }
}
