package application;

import handlers.HandlerMouseInventario;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import model.Inventario;

public class GeneradorInventario {
	Pane pane;
	Inventario inventario;
	
	public GeneradorInventario(Pane pane, Inventario inventario) {
		this.pane = pane;
		this.inventario = inventario;
	}
    public HBox mostrarInventario(){

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
}
