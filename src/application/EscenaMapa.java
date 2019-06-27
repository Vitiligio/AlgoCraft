package application;

import handlers.BotonAbajoEventHandler;
import handlers.BotonAccionAbajoEventHandler;
import handlers.BotonAccionArribaEventHandler;
import handlers.BotonAccionDerechaEventHandler;
import handlers.BotonAccionIzquierdaEventHandler;
import handlers.BotonArribaEventHandler;
import handlers.BotonDerechaEventHandler;
import handlers.BotonIzquierdaEventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.*;

public class EscenaMapa {
	Mapa mapa;
	private HandlerEscenas handlerEscenas;
	private EscenaInventario generadorEscenaInventario;
	Scene escenaInventario;

	public EscenaMapa(HandlerEscenas handlerEscenas){

		this.handlerEscenas = handlerEscenas;
	}
	
	private VBox botones_herr (HBox mapaContenedor) {
		Text tipo_herramienta = new Text("Herramienta");
		Button accion_izq = new Button();
		BotonAccionIzquierdaEventHandler acc_izq_event = new BotonAccionIzquierdaEventHandler(mapa, mapaContenedor);
		accion_izq.setOnAction(acc_izq_event);
		accion_izq.setText("<");
		
		Button accion_der = new Button();
		BotonAccionDerechaEventHandler acc_der_event = new BotonAccionDerechaEventHandler(mapa, mapaContenedor);
		accion_der.setOnAction(acc_der_event);
		accion_der.setText(">");
		
		Button accion_arr = new Button();
		BotonAccionArribaEventHandler acc_arr_event = new BotonAccionArribaEventHandler(mapa, mapaContenedor);
		accion_arr.setOnAction(acc_arr_event);
		accion_arr.setText("^");
		
		Button accion_abj = new Button();
		BotonAccionAbajoEventHandler acc_abj_event = new BotonAccionAbajoEventHandler(mapa, mapaContenedor);
		accion_abj.setOnAction(acc_abj_event);
		accion_abj.setText("v");
		HBox arrBoton = new HBox(accion_arr);
		arrBoton.setAlignment(Pos.CENTER);
		
		HBox izqBoton = new HBox(accion_izq, accion_der);
		izqBoton.setAlignment(Pos.CENTER);
		
		HBox abjBoton = new HBox(accion_abj);
		abjBoton.setAlignment(Pos.CENTER);
		VBox botones = new VBox(tipo_herramienta, arrBoton, izqBoton, abjBoton);
		return botones;
	}
	
	private VBox botones (HBox mapaContenedor) {
		Button izq = new Button();
		izq.setText("<");
		BotonIzquierdaEventHandler izq_event = new BotonIzquierdaEventHandler(mapa, mapaContenedor);
		izq.setOnAction(izq_event);
		
		Button arriba = new Button();
		BotonArribaEventHandler arr_event = new BotonArribaEventHandler(mapa, mapaContenedor);
		arriba.setOnAction(arr_event);
		arriba.setText("^");
		
		Text tipo_mover = new Text("Movimiento");
		
		Button derecha = new Button();
		BotonDerechaEventHandler der_event = new BotonDerechaEventHandler(mapa, mapaContenedor);
		derecha.setOnAction(der_event);
		derecha.setText(">");
		
		Button abajo = new Button();
		BotonAbajoEventHandler abj_event = new BotonAbajoEventHandler(mapa, mapaContenedor);
		abajo.setOnAction(abj_event);
		abajo.setText("v");
/*		
		Button accion_izq = new Button();
		BotonAccionIzquierdaEventHandler acc_izq_event = new BotonAccionIzquierdaEventHandler(mapa, mapaContenedor);
		accion_izq.setOnAction(acc_izq_event);
		accion_izq.setText("L");
		
		
		Button accion_der = new Button();
		BotonAccionDerechaEventHandler acc_der_event = new BotonAccionDerechaEventHandler(mapa, mapaContenedor);
		accion_der.setOnAction(acc_der_event);
		accion_der.setText("D");
		
		Button accion_arr = new Button();
		BotonAccionArribaEventHandler acc_arr_event = new BotonAccionArribaEventHandler(mapa, mapaContenedor);
		accion_arr.setOnAction(acc_arr_event);
		accion_arr.setText("A");
		
		Button accion_abj = new Button();
		BotonAccionAbajoEventHandler acc_abj_event = new BotonAccionAbajoEventHandler(mapa, mapaContenedor);
		accion_abj.setOnAction(acc_abj_event);
		accion_abj.setText("Abj");*/
		
		HBox primerBoton = new HBox(arriba);
		primerBoton.setAlignment(Pos.CENTER);
		
		HBox segundoBoton = new HBox(izq, derecha);
		segundoBoton.setAlignment(Pos.CENTER);
		
		HBox tercerBoton = new HBox(abajo);
		tercerBoton.setAlignment(Pos.CENTER);
		
		
/*		HBox arrBoton = new HBox(accion_arr);
		arrBoton.setAlignment(Pos.CENTER);
		
		HBox izqBoton = new HBox(accion_izq, accion_der);
		izqBoton.setAlignment(Pos.CENTER);
		
		HBox abjBoton = new HBox(accion_abj);
		abjBoton.setAlignment(Pos.CENTER);
		*/
		VBox botones = new VBox(tipo_mover,primerBoton, segundoBoton, tercerBoton);
		return botones;
	}
	
	public Scene generarEscena(Juego juego) {
		mapa = juego.obtenerMapa();
		this.generadorEscenaInventario = new EscenaInventario(handlerEscenas, mapa.jugador);
		Label l = new Label("Hacha De Madera");

		GeneradorDeGrilla generador = new GeneradorDeGrilla();
		GridPane grilla = generador.generarVisualizacionDeMapa(mapa);
		
		StackPane layout = new StackPane();
		layout.getChildren().add(grilla);
		
		HBox mapaContenedor = new HBox(grilla);
		mapaContenedor.setAlignment(Pos.CENTER);
		
		VBox botones = botones(mapaContenedor);
		VBox botones_herr = botones_herr(mapaContenedor);
		HBox contiene_botones = new HBox(botones, botones_herr);
		contiene_botones.setSpacing(50);

		HBox h = new HBox(l);
		
		VBox contenedorPrincipal = new VBox(mapaContenedor, contiene_botones, h);
		contenedorPrincipal.setSpacing(10);
		contenedorPrincipal.setAlignment(Pos.BASELINE_CENTER);

		Scene scene = new Scene(contenedorPrincipal);
		escenaInventario = generadorEscenaInventario.generarEscena(scene, l);

		scene.addEventFilter(KeyEvent.KEY_PRESSED,
				event -> {
					if (event.getCode() == KeyCode.I)
						escenaInventario = generadorEscenaInventario.generarEscena(scene, l);
						handlerEscenas.cambiarEscena(escenaInventario);
				});

		return scene;
	}
}
