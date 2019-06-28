package controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Metal;
import model.Personaje;

public class HandlerCrafteoMetal implements EventHandler<ActionEvent> {
	int[] pos;
	Personaje personaje;
	MenuButton boton;
	Label mensaje_error;
	
	public HandlerCrafteoMetal(int[] pos, Personaje personaje, MenuButton boton, Label mensaje_error) {
		this.pos = pos;
		this.personaje = personaje;
		this.boton = boton;
		this.mensaje_error = mensaje_error;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		try {
			Metal unMetal = new Metal();
			personaje.insertarMaterialEnMesaDeCrafteoEnPosicion(unMetal, pos[0], pos[1]);
		}
		catch(Exception ItemsInsuficientesExcepcion) {
			mensaje_error.setText("No tienes suficientes items");
			return;
		}
		Image imagen = new Image("file:img/inventario_metal.png");
		ImageView img = new ImageView(imagen);
		boton.setGraphic(img);
		mensaje_error.setText("");
	}
}
