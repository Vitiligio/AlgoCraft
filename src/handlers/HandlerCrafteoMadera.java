package handlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Madera;
import model.MesaDeCrafteo;
import model.Personaje;

public class HandlerCrafteoMadera implements EventHandler<ActionEvent> {
	int pos[];
	Personaje personaje;
	MenuButton boton;
	Label mensaje_error;
	
	public HandlerCrafteoMadera(int[] pos, Personaje personaje, MenuButton boton, Label mensaje_error) {
		this.pos = pos;
		this.personaje = personaje;
		this.boton = boton;
		this.mensaje_error = mensaje_error;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		try { 
			Madera unaMadera = new Madera();
			personaje.insertarMaterialEnMesaDeCrafteoEnPosicion(unaMadera, pos[0], pos[1]);
	        Image maderas = new Image("img/arbol.png");
	        ImageView img_madera = new ImageView(maderas);
			boton.setGraphic(img_madera);
		}
		catch(Exception ItemsInsuficientesExcepcion) {
			mensaje_error.setText("No tienes suficientes items");
		}
	}
}
