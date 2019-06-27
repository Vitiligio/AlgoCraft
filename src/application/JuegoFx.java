package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;


public class JuegoFx extends Application {
	
	GridPane grilla;
	Juego juego;
	MediaPlayer player;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public Scene menuPrincipal(Stage stage, HandlerEscenas handlerEscenas) {
		
		Image imagen = new Image("file:img/menu.png");
		ImageView iv = new ImageView(imagen);
		
		StackPane pane = new StackPane();
		pane.getChildren().add(iv);
		
		
		VBox contenedorInicio = new VBox(pane);
		
		Scene scene = new Scene(contenedorInicio,900,560);

		scene.addEventFilter(KeyEvent.KEY_PRESSED, event->{
			if(event.getCode() == KeyCode.ENTER) {
				
				Scene escenaMapa = new EscenaMapa(handlerEscenas).generarEscena(juego);
				handlerEscenas.cambiarEscena(escenaMapa);
				
			}
		});
		return scene;
	}

	public void start(Stage stage)
	{
		
		juego = new Juego();
		juego.iniciar();

		Media media = new Media(new File("img/Bossa-nova-beat-music-loop.mp3").toURI().toString());
		player = new MediaPlayer(media);
		player.setOnEndOfMedia(new Runnable() {
			public void run() {
				player.seek(Duration.ZERO);
			}
		});
		player.play();

		HandlerEscenas handlerEscenas = new HandlerEscenas(stage);
		Scene scene = menuPrincipal(stage, handlerEscenas);

		handlerEscenas.cambiarEscena(scene);
		stage.show();
	}	
	
}
