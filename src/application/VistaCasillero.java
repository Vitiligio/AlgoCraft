package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class VistaCasillero extends Vista{

    public VistaCasillero(GridPane grilla, int i, int j){

        super(grilla, j, i);
        textura.setImage(new Image("img/pasto.png"));
    }
}
