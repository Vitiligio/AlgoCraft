package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.*;
import handlers.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class MapaFx extends Application {
	
	GridPane grilla;
	Juego juego;
	Mapa mapa;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		juego = new Juego();
		juego.iniciar();
		mapa = juego.obtenerMapa();
		
		GeneradorDeGrilla generador = new GeneradorDeGrilla();
		grilla = generador.generarVisualizacionDeMapa(mapa);
		
		StackPane layout = new StackPane();
		layout.getChildren().add(grilla);
		
		HBox mapaContenedor = new HBox(grilla);
		mapaContenedor.setAlignment(Pos.CENTER);
		
		Button izq = new Button();
		izq.setText("Iz");
		BotonIzquierdaEventHandler izq_event = new BotonIzquierdaEventHandler(mapa, mapaContenedor);
		izq.setOnAction(izq_event);
		
		Button arriba = new Button();
		BotonArribaEventHandler arr_event = new BotonArribaEventHandler(mapa, mapaContenedor);
		arriba.setOnAction(arr_event);
		arriba.setText("Ar");
		
		Button derecha = new Button();
		BotonDerechaEventHandler der_event = new BotonDerechaEventHandler(mapa, mapaContenedor);
		derecha.setOnAction(der_event);
		derecha.setText("De");
		
		Button abajo = new Button();
		BotonAbajoEventHandler abj_event = new BotonAbajoEventHandler(mapa, mapaContenedor);
		abajo.setOnAction(abj_event);
		abajo.setText("Ab");

		VBox primerBoton = new VBox(arriba);
		primerBoton.setAlignment(Pos.CENTER);
		primerBoton.setSpacing(10);
		HBox segundoBoton = new HBox(izq, derecha);
		segundoBoton.setAlignment(Pos.CENTER);
		segundoBoton.setSpacing(10);
		VBox tercerBoton = new VBox(abajo);
		tercerBoton.setAlignment(Pos.CENTER);
		tercerBoton.setSpacing(10);
		
		VBox contenedorPrincipal = new VBox(mapaContenedor, primerBoton, segundoBoton, tercerBoton);
		contenedorPrincipal.setSpacing(10);
		contenedorPrincipal.setAlignment(Pos.BASELINE_CENTER);
		
		Scene scene = new Scene(contenedorPrincipal);
		stage.setScene(scene);
		stage.show();
	}	
	
}