package vista;

import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;

public class VistaCasillero extends Vista{

    public VistaCasillero(GridPane grilla, int i, int j){

        super(grilla, i, j);
        textura.setImage(new Image("file:img/pasto.png"));
    }
}
