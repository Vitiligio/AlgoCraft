package handlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Diamante;
import model.Madera;
import model.MesaDeCrafteo;
import model.Piedra;

public class HandlerCrafteoDiamante implements EventHandler<ActionEvent> {
	int[] pos;
	MesaDeCrafteo mesa_actual;
	MenuButton boton;
	
	public HandlerCrafteoDiamante(int[] pos, MesaDeCrafteo mesa_actual, MenuButton boton) {
		this.pos = pos;
		this.mesa_actual = mesa_actual;
		this.boton = boton;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		Diamante unDiamante = new Diamante();
		mesa_actual.insertarMaterialEnPosicion(unDiamante, pos[0], pos[1]);
        Image imagen = new Image("img/diamante.png");
        ImageView img = new ImageView(imagen);
		boton.setGraphic(img);
	}
}
