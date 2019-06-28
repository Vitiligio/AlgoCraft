package vista;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public abstract class Vista {

    protected ImageView textura;

    protected Vista(GridPane grilla, int i, int j){
        textura = new ImageView();
        grilla.add(textura, i, j);
    }
}
