package application;

import handlers.*;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import model.Inventario;
import model.MesaDeCrafteo;
import model.Personaje;

public class EscenaInventario {

    private HandlerEscenas handlerEscenas;
    private Inventario inventario;
    private MesaDeCrafteo mesaDeCrafteo;
    private Personaje personaje;

    public EscenaInventario(HandlerEscenas handlerEscenas, Personaje personaje){

        this.handlerEscenas = handlerEscenas;
        this.inventario = personaje.obtenerInventario();
        this.mesaDeCrafteo = personaje.obtenerMesaDeCrafteo();
        this.personaje = personaje;
    }

    public Scene generarEscena(Scene escenaMapa, Label l){

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 330, 280);
        GeneradorDeMesa generador = new GeneradorDeMesa(personaje);
        GeneradorInventario generador_i = new GeneradorInventario(inventario);
        generador_i.setl(l);

        HBox contenedorInventario = generador_i.mostrarInventario();
        VBox contenedorMesaDeCrafteo = generador.generarMesa();
        VBox contenedorBotones = botonesCrafteo(contenedorMesaDeCrafteo, generador, generador_i, contenedorInventario);
        HBox crafting = new HBox(contenedorMesaDeCrafteo,contenedorBotones);

        Text titulo = new Text("Mesa de crafteo");//no logro hacer que se vea
        HBox tituloBox = new HBox(titulo);
        titulo.setStyle("-fx-color: #ffffff");
        tituloBox.setTranslateY(80);
        pane.getChildren().add(tituloBox);
        pane.getChildren().add(contenedorInventario);
        pane.setStyle("-fx-background-color: #B45C00");
        crafting.setTranslateY(100);
        contenedorBotones.setTranslateX(60);
        pane.getChildren().add(crafting);
        //pane.getChildren().add(contenedorBotones);
        scene.addEventFilter(KeyEvent.KEY_PRESSED,
                event -> {
                    if (event.getCode() == KeyCode.I)
                        handlerEscenas.cambiarEscena(escenaMapa);
                });

        return scene;
    }
    
    private VBox botonesCrafteo(VBox contenedorMesa, GeneradorDeMesa generadorMesa, GeneradorInventario generadorInventario, HBox contenedorInventario) {
        Button boton_craftear = new Button("Craftear");
        HBox boton_craft = new HBox(boton_craftear);
        boton_craft.setAlignment(Pos.CENTER);
        Label respuesta = new Label();
        HandlerBotonCraftear handler_boton = new HandlerBotonCraftear(personaje, respuesta, contenedorInventario, contenedorMesa, generadorInventario);
        boton_craftear.setOnAction(handler_boton);
    	VBox contenedor = new VBox(boton_craftear, respuesta);
        return contenedor;
    }
}
