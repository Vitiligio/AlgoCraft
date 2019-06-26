package handlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.MesaDeCrafteo;
import model.Metal;

public class HandlerCrafteoMetal implements EventHandler<ActionEvent> {
	int[] pos;
	MesaDeCrafteo mesa_actual;
	MenuButton boton;
	
	public HandlerCrafteoMetal(int[] pos, MesaDeCrafteo mesa_actual, MenuButton boton) {
		this.pos = pos;
		this.mesa_actual = mesa_actual;
		this.boton = boton;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		Metal unMetal = new Metal();
		mesa_actual.insertarMaterialEnPosicion(unMetal, pos[0], pos[1]);
        Image imagen = new Image("img/metal.png");
        ImageView img = new ImageView(imagen);
		boton.setGraphic(img);
	}
}
