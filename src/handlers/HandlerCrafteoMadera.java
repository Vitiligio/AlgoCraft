package handlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Madera;
import model.MesaDeCrafteo;

public class HandlerCrafteoMadera implements EventHandler<ActionEvent> {
	int pos[];
	MesaDeCrafteo mesa_actual;
	MenuButton boton;
	
	public HandlerCrafteoMadera(int[] pos, MesaDeCrafteo mesa_actual, MenuButton boton) {
		this.pos = pos;
		this.mesa_actual = mesa_actual;
		this.boton = boton;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		Madera unaMadera = new Madera();
		mesa_actual.insertarMaterialEnPosicion(unaMadera, pos[0], pos[1]);
        Image maderas = new Image("img/arbol.png");
        ImageView img_madera = new ImageView(maderas);
		boton.setGraphic(img_madera);
	}
}
