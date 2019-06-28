package controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Personaje;
import model.Piedra;

public class HandlerCrafteoPiedra implements EventHandler<ActionEvent> {
	int[] pos;
	Personaje personaje;
	MenuButton boton;
	Label mensaje_error;
	
	public HandlerCrafteoPiedra(int[] pos, Personaje personaje, MenuButton boton, Label mensaje_error) {
		this.pos = pos;
		this.personaje = personaje;
		this.boton = boton;
		this.mensaje_error = mensaje_error;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		try { 
			Piedra unaPiedra = new Piedra();
			personaje.insertarMaterialEnMesaDeCrafteoEnPosicion(unaPiedra, pos[0], pos[1]);
		}
		catch(Exception ItemsInsuficientesExcepcion) {
			mensaje_error.setText("No tienes suficientes items");
			return;
		}
		Image piedra = new Image("file:img/inventario_piedra.png");
		ImageView img_piedra = new ImageView(piedra);
		boton.setGraphic(img_piedra);
		mensaje_error.setText("");
	}
}
