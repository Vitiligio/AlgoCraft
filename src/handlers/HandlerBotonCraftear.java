package handlers;

import application.GeneradorDeMesa;
import application.GeneradorInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Excepciones.CodigoDeHerramientaInvalidoError;
import model.MesaDeCrafteo;
import model.Personaje;

public class HandlerBotonCraftear implements EventHandler<ActionEvent> {
	MesaDeCrafteo mesa;
	Label respuesta;
	VBox contenedorMesa;
	HBox contenedorInventario;
	GeneradorInventario generadorInventario;
	Personaje personaje;
	
	public HandlerBotonCraftear(Personaje personaje, Label respuesta, HBox contenedorInventario, VBox contenedorMesa, GeneradorInventario generadorInventario) {
		this.personaje = personaje;
		this.mesa = personaje.obtenerMesaDeCrafteo();
		this.respuesta = respuesta;
		this.contenedorMesa = contenedorMesa;
		this.contenedorInventario = contenedorInventario;
		this.generadorInventario = generadorInventario;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		try {
			personaje.construirHerramienta();
		}
		catch (CodigoDeHerramientaInvalidoError e) {
			respuesta.setText("Error.");
			return;
		}
		mesa.reiniciar();
		respuesta.setText("");
		GeneradorDeMesa generadorMesa = new GeneradorDeMesa(personaje);
		contenedorMesa.getChildren().clear();
		contenedorMesa.getChildren().add(generadorMesa.generarMesa());
		contenedorInventario.getChildren().clear();
		contenedorInventario.getChildren().add(new GeneradorInventario(personaje.obtenerInventario()).mostrarInventario());
	}
}
