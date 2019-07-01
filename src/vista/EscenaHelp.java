package vista;

import controlador.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import model.Inventario;
import model.MesaDeCrafteo;
import model.Personaje;


public class EscenaHelp {

	private HandlerEscenas handlerEscenas;
    
    public EscenaHelp(HandlerEscenas handlerEscenas) {
    	
    	this.handlerEscenas = handlerEscenas;
 
    }
    
    public Scene generarEscena(Scene escenaMapa, Label l){

    	Image imagen = new Image("file:img/help.png");
		ImageView iv = new ImageView(imagen);
		
		StackPane pane = new StackPane();
		pane.getChildren().add(iv);
		
		
		VBox contenedorInicio = new VBox(pane);
		
		Scene scene = new Scene(contenedorInicio,850,450);

		scene.addEventFilter(KeyEvent.KEY_PRESSED,
                event -> {
                    if (event.getCode() == KeyCode.H)
                        handlerEscenas.cambiarEscena(escenaMapa);
                });

		return scene;
    }
}
