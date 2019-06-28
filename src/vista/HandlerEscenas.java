package vista;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class HandlerEscenas {

    private Stage stage;

    public HandlerEscenas(Stage stage){

        this.stage = stage;
    }

    public void cambiarEscena(Scene scene){

        stage.setScene(scene);
    }
}
