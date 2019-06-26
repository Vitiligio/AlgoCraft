package handlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.MesaDeCrafteo;
import model.Piedra;

public class HandlerCrafteoPiedra implements EventHandler<ActionEvent> {
	int[] pos;
	MesaDeCrafteo mesa_actual;
	MenuButton boton;
	
	public HandlerCrafteoPiedra(int[] pos, MesaDeCrafteo mesa_actual, MenuButton boton) {
		this.pos = pos;
		this.mesa_actual = mesa_actual;
		this.boton = boton;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		Piedra unaPiedra = new Piedra();
		mesa_actual.insertarMaterialEnPosicion(unaPiedra, pos[0], pos[1]);
        Image piedra = new Image("img/roca.png");
        ImageView img_piedra = new ImageView(piedra);
		boton.setGraphic(img_piedra);
	}
}
