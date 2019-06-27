package application;

import handlers.*;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import model.CasilleroDeObjetos;
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

    public Scene generarEscena(Scene escenaMapa){

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400, 400);
        GeneradorDeMesa generador = new GeneradorDeMesa(personaje);
        GeneradorInventario generador_i = new GeneradorInventario(inventario);

        HBox contenedorInventario = generador_i.mostrarInventario();
        VBox contenedorMesaDeCrafteo = generador.generarMesa();
        VBox contenedorBotones = botonesCrafteo(contenedorMesaDeCrafteo, generador, generador_i, contenedorInventario);
        
        Text texto = new Text("Objeto Equipado:");
        ImageView textura = new ImageView();
        CasilleroDeObjetos casillero = new CasilleroDeObjetos();
        casillero.asignarObjeto(inventario.getObjetoEquipado());
        VistaInventario vInventario = new VistaInventario(casillero);
        ImageView imagenObjetoEquipado = vInventario.getTextura();
        
        VBox objetoEquipado = new VBox(texto,imagenObjetoEquipado);

        pane.getChildren().add(contenedorInventario);
        contenedorMesaDeCrafteo.setTranslateY(100);
        pane.getChildren().add(contenedorMesaDeCrafteo);
        contenedorBotones.setTranslateY(300);
        pane.getChildren().add(contenedorBotones);
        objetoEquipado.setTranslateY(45);
        pane.getChildren().add(objetoEquipado);
        scene.addEventFilter(KeyEvent.KEY_PRESSED,
                event -> {
                    if (event.getCode() == KeyCode.I)
                        handlerEscenas.cambiarEscena(escenaMapa);
                });

        return scene;
    }

 /*   private HBox mostrarInventario(Pane pane){

        HBox contenedorInventario = new HBox();

        for(int i = 0; i < 10; i++){

            VistaInventario vistaInventario = new VistaInventario(inventario.getCasillero(i));
            HandlerMouseInventario handler = new HandlerMouseInventario(pane, inventario.getCasillero(i));
            ImageView imagen = vistaInventario.getTextura();
            contenedorInventario.getChildren().add(imagen);
            imagen.setOnMouseEntered(handler);
            imagen.setOnMouseExited(handler);
        }

        return contenedorInventario;
    }*/
    
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
