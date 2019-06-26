package application;

import handlers.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import model.Inventario;
import model.MesaDeCrafteo;

public class EscenaInventario {

    private HandlerEscenas handlerEscenas;
    private Inventario inventario;
    private MesaDeCrafteo mesaDeCrafteo;

    public EscenaInventario(HandlerEscenas handlerEscenas, Inventario inventario, MesaDeCrafteo mesaDeCrafteo){

        this.handlerEscenas = handlerEscenas;
        this.inventario = inventario;
        this.mesaDeCrafteo = mesaDeCrafteo;
    }

    public Scene generarEscena(Scene escenaMapa){

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400, 200);

        HBox contenedorInventario = mostrarInventario(pane);
        VBox contenedorMesaDeCrafteo = mostrarMesaDeCrafteo();

        pane.getChildren().add(contenedorInventario);
        contenedorMesaDeCrafteo.setTranslateY(100);
        pane.getChildren().add(contenedorMesaDeCrafteo);

        scene.addEventFilter(KeyEvent.KEY_PRESSED,
                event -> {
                    if (event.getCode() == KeyCode.I)
                        handlerEscenas.cambiarEscena(escenaMapa);
                });

        return scene;
    }

    private HBox mostrarInventario(Pane pane){

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
    }

    private VBox mostrarMesaDeCrafteo(){

        HBox primeraFila = new HBox();
        
        HBox segundaFila = new HBox();
        HBox terceraFila = new HBox();
        HBox [] vectorFilas = new HBox [3];
        vectorFilas[0] = primeraFila;
        vectorFilas[1] = segundaFila;
        vectorFilas[2] = terceraFila;

        int[] mesa_actual = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
            	int[] pos = {i, j};
                MenuButton boton = new MenuButton();
                
                // handlers 
                HandlerCrafteoMadera handler_madera = new HandlerCrafteoMadera(pos, mesaDeCrafteo, boton);
                HandlerCrafteoPiedra handler_piedra = new HandlerCrafteoPiedra(pos, mesaDeCrafteo, boton);
                HandlerCrafteoMetal handler_metal = new HandlerCrafteoMetal(pos, mesaDeCrafteo, boton);
                HandlerCrafteoDiamante handler_diamante = new HandlerCrafteoDiamante(pos, mesaDeCrafteo, boton);
                

                MenuItem boton1 = new MenuItem("Madera");
                boton1.setOnAction(handler_madera);
                MenuItem boton2 = new MenuItem("Piedra");
                boton2.setOnAction(handler_piedra);
                MenuItem boton3 = new MenuItem("Metal");
                boton3.setOnAction(handler_metal);
                MenuItem boton4 = new MenuItem("Diamante");
                boton4.setOnAction(handler_diamante);
                boton.getItems().addAll(boton1, boton2, boton3, boton4);
                
                Image maderas = new Image("img/arbol.png");
                ImageView img_madera = new ImageView(maderas);
                Image piedras = new Image("img/roca.png");
                ImageView img_piedra = new ImageView(piedras);
                Image metales = new Image("img/metal.png");
                ImageView img_metal = new ImageView(metales);
                Image dimaantes = new Image("img/diamante.png");
                ImageView img_diamante = new ImageView(dimaantes);
                boton1.setGraphic(img_madera);
                boton2.setGraphic(img_piedra);
                boton3.setGraphic(img_metal);
                boton4.setGraphic(img_diamante);
                VistaInventario vistaMesa = new VistaInventario(mesaDeCrafteo.getCasillero(i, j));
                ImageView imagen = vistaMesa.getTextura();
                boton.setGraphic(imagen);
                vectorFilas[i].getChildren().add(boton);
                /*VistaInventario vistaMesa = new VistaInventario(mesaDeCrafteo.getCasillero(i, j));
                ImageView imagen = vistaMesa.getTextura();
                vectorFilas[i].getChildren().add(imagen);*/
            }
        }

        Button boton_craftear = new Button("Craftear");
        boton_craftear.setOnAction(null);
        HBox boton_craft = new HBox(boton_craftear);
        VBox contenedorMesa = new VBox(primeraFila, segundaFila, terceraFila);
        return contenedorMesa;
    }
}
