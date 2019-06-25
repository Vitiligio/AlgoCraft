package application;

import handlers.HandlerMouseInventario;
import javafx.scene.Scene;
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

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                VistaInventario vistaMesa = new VistaInventario(mesaDeCrafteo.getCasillero(i, j));
                ImageView imagen = vistaMesa.getTextura();
                vectorFilas[i].getChildren().add(imagen);
            }
        }

        VBox contenedorMesa = new VBox(primeraFila, segundaFila, terceraFila);
        return contenedorMesa;
    }
}
