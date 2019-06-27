package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.*;
import handlers.*;
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.TextAlignment;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;



public class JuegoFx extends Application {
	
	GridPane grilla;
	Juego juego;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public Scene menuPrincipal(Stage stage, HandlerEscenas handlerEscenas) {
		
		Text titulo = new Text("ALGOCRAFT");
		titulo.setFill(Color.GREEN);
		titulo.setStyle("-fx-font: 70px Tahoma");
		HBox tituloBox = new HBox(titulo);
		tituloBox.setAlignment(Pos.CENTER);
		tituloBox.setTranslateY(0);
		
		Button jugar = new Button();
		jugar.setText("Jugar");
		BotonJugarHandler handler_jugar = new BotonJugarHandler(stage, juego, handlerEscenas);
		jugar.setOnAction(handler_jugar);
		HBox jugarBox = new HBox(jugar);
		jugarBox.setAlignment(Pos.CENTER);
		jugarBox.setTranslateY(100);
		
		
		VBox contenedorInicio = new VBox(tituloBox,jugarBox);
		
		Scene scene = new Scene(contenedorInicio,400,400);
		return scene;
	}
	
	@Override
	public void start(Stage stage)
	{
		
		juego = new Juego();
		juego.iniciar();

		HandlerEscenas handlerEscenas = new HandlerEscenas(stage);
		Scene scene = menuPrincipal(stage, handlerEscenas);

		handlerEscenas.cambiarEscena(scene);
		stage.show();
	}	
	
}
