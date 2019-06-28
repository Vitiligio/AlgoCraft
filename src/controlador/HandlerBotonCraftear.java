package controlador;

import vista.GeneradorDeMesa;
import vista.GeneradorInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.MesaDeCrafteo;
import model.Personaje;

public class HandlerBotonCraftear implements EventHandler<ActionEvent> {
	MesaDeCrafteo mesa;
	Label respuesta;
	VBox contenedorMesa;
	HBox contenedorInventario;
	Personaje personaje;
	Label l;
	
	public HandlerBotonCraftear(Personaje personaje, Label respuesta, Label l, HBox contenedorInventario, VBox contenedorMesa) {
		this.personaje = personaje;
		this.mesa = personaje.obtenerMesaDeCrafteo();
		this.respuesta = respuesta;
		this.contenedorMesa = contenedorMesa;
		this.contenedorInventario = contenedorInventario;
		this.l = l;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		try {
			personaje.construirHerramienta();
			respuesta.setText("");
		}
		catch (Exception CodigoDeHerramientaInvalidoError) {
			personaje.vaciarMesa();
			respuesta.setText("Error.");
		}
		personaje.reiniciarMesa();
		GeneradorDeMesa generadorMesa = new GeneradorDeMesa(personaje);
		contenedorMesa.getChildren().clear();
		contenedorMesa.getChildren().add(generadorMesa.generarMesa());
		GeneradorInventario generadorInventario = new GeneradorInventario(personaje.obtenerInventario());
		generadorInventario.setl(l);
		contenedorInventario.getChildren().clear();
		contenedorInventario.getChildren().add(generadorInventario.mostrarInventario());
		
	}
}
