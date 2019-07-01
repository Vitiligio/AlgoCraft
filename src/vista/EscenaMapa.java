package vista;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import model.*;

public class EscenaMapa {
	Mapa mapa;
	private HandlerEscenas handlerEscenas;
	private EscenaInventario generadorEscenaInventario;
	private EscenaHelp generadorEscenaHelp;
	Scene escenaInventario;
	Scene escenaHelp;

	public EscenaMapa(HandlerEscenas handlerEscenas){

		this.handlerEscenas = handlerEscenas;
	}
		
	public Scene generarEscena(Juego juego) {
		mapa = juego.obtenerMapa();
		this.generadorEscenaInventario = new EscenaInventario(handlerEscenas, mapa.jugador);
		this.generadorEscenaHelp = new EscenaHelp(handlerEscenas);
		Label l = new Label("Hacha De Madera");

		GeneradorDeGrilla generador = new GeneradorDeGrilla();
		GridPane grilla = generador.generarVisualizacionDeMapa(mapa);
		
		StackPane layout = new StackPane();
		layout.getChildren().add(grilla);
		
		HBox mapaContenedor = new HBox(grilla);
		mapaContenedor.setAlignment(Pos.CENTER);
		
		Text iParaInventario = new Text("AYUDA? Presiona H");
		iParaInventario.setFill(Color.ANTIQUEWHITE);
		l.setStyle("-fx-text-fill: white");
		HBox h = new HBox(iParaInventario, l);
		h.setStyle("-fx-background-color:#000000");
		h.setSpacing(400);
		
		VBox contenedorPrincipal = new VBox(h,mapaContenedor);
		contenedorPrincipal.setAlignment(Pos.BASELINE_CENTER);

		Scene scene = new Scene(contenedorPrincipal);
		escenaInventario = generadorEscenaInventario.generarEscena(scene, l);
		
		//Scene scene = new Scene(contenedorPrincipal);
		escenaHelp = generadorEscenaHelp.generarEscena(scene, l);


		AudioClip note = new AudioClip("file:img/hit.wav");
		scene.addEventFilter(KeyEvent.KEY_PRESSED,
				event -> {
					try {
					ControladorMapa controlador = new ControladorMapa(mapa);
					if (event.getCode() == KeyCode.I) 
					{
						escenaInventario = generadorEscenaInventario.generarEscena(scene, l);
						handlerEscenas.cambiarEscena(escenaInventario);
					}
					if (event.getCode() == KeyCode.H) {
						escenaHelp = generadorEscenaHelp.generarEscena(scene,l);
						handlerEscenas.cambiarEscena(escenaHelp);
					}
					if (event.getCode() == KeyCode.UP)
					{
						controlador.moverArriba();
						regenerarMapa(mapa, mapaContenedor);
					}

					if (event.getCode() == KeyCode.DOWN)
					{
						controlador.moverAbajo();
						regenerarMapa(mapa, mapaContenedor);
					}
					if (event.getCode() == KeyCode.RIGHT)
					{
						controlador.moverDerecha();
						regenerarMapa(mapa, mapaContenedor);
					}
					if (event.getCode() == KeyCode.LEFT)
					{
						controlador.moverIzquierda();
						regenerarMapa(mapa, mapaContenedor);
					}
					if (event.getCode() == KeyCode.W)
					{
						controlador.accionArriba();
						note.play();
						regenerarMapa(mapa, mapaContenedor);
					}
					if (event.getCode() == KeyCode.A)
					{
						controlador.accionIzquierda();
						note.play();
						regenerarMapa(mapa, mapaContenedor);
					}
					if (event.getCode() == KeyCode.S)
					{
						controlador.accionAbajo();
						note.play();
						regenerarMapa(mapa, mapaContenedor);
					}
					if (event.getCode() == KeyCode.D)
					{
						controlador.accionDerecha();
						note.play();
						regenerarMapa(mapa, mapaContenedor);
					}}
					catch (Exception e) {
						
					}
				});

		return scene;
	}
	
	private void regenerarMapa(Mapa mapa, HBox mapaContenedor) {
		GeneradorDeGrilla generador = new GeneradorDeGrilla();
		GridPane nueva_grilla = generador.generarVisualizacionDeMapa(mapa);
		mapaContenedor.getChildren().clear();
		mapaContenedor.getChildren().add(nueva_grilla);
	}
}
