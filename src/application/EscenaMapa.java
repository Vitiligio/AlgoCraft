package application;

import handlers.BotonAbajoEventHandler;
import handlers.BotonArribaEventHandler;
import handlers.BotonDerechaEventHandler;
import handlers.BotonIzquierdaEventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import model.Juego;
import model.Mapa;

public class EscenaMapa {
	Mapa mapa;
	
	private VBox botones (HBox mapaContenedor) {
		Button izq = new Button();
		izq.setText("←");
		BotonIzquierdaEventHandler izq_event = new BotonIzquierdaEventHandler(mapa, mapaContenedor);
		izq.setOnAction(izq_event);
		
		Button arriba = new Button();
		BotonArribaEventHandler arr_event = new BotonArribaEventHandler(mapa, mapaContenedor);
		arriba.setOnAction(arr_event);
		arriba.setText("↑");
		
		Button derecha = new Button();
		BotonDerechaEventHandler der_event = new BotonDerechaEventHandler(mapa, mapaContenedor);
		derecha.setOnAction(der_event);
		derecha.setText("→");
		
		Button abajo = new Button();
		BotonAbajoEventHandler abj_event = new BotonAbajoEventHandler(mapa, mapaContenedor);
		abajo.setOnAction(abj_event);
		abajo.setText("↓");
		
		HBox primerBoton = new HBox(arriba);
		primerBoton.setAlignment(Pos.CENTER);
		HBox segundoBoton = new HBox(izq, derecha);
		segundoBoton.setAlignment(Pos.CENTER);
		HBox tercerBoton = new HBox(abajo);
		tercerBoton.setAlignment(Pos.CENTER);
		VBox botones = new VBox(primerBoton, segundoBoton, tercerBoton);
		return botones;
	}
	
	public Scene generarEscena(Juego juego) {
		mapa = juego.obtenerMapa();
		
		GeneradorDeGrilla generador = new GeneradorDeGrilla();
		GridPane grilla = generador.generarVisualizacionDeMapa(mapa);
		
		StackPane layout = new StackPane();
		layout.getChildren().add(grilla);
		
		HBox mapaContenedor = new HBox(grilla);
		mapaContenedor.setAlignment(Pos.CENTER);
		
		VBox botones = botones(mapaContenedor);
		
		VBox contenedorPrincipal = new VBox(mapaContenedor, botones);
		contenedorPrincipal.setSpacing(10);
		contenedorPrincipal.setAlignment(Pos.BASELINE_CENTER);
		Scene scene = new Scene(contenedorPrincipal);
		return scene;
	}
}
