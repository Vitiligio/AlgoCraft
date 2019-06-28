package vista;

import controlador.HandlerMouseInventario;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import model.Inventario;

public class GeneradorInventario {
	Inventario inventario;
	Label l = new Label();
	
	public GeneradorInventario(Inventario inventario) {
		this.inventario = inventario;
	}

    public HBox mostrarInventario(){

        HBox contenedorInventario = new HBox();
        Label label = new Label();

        for(int i = 0; i < 10; i++){

            VistaInventario vistaInventario = new VistaInventario(inventario.getCasillero(i));
            HandlerMouseInventario handler = new HandlerMouseInventario(label, inventario.getCasillero(i), inventario, l);
            ImageView imagen = vistaInventario.getTextura();
            contenedorInventario.getChildren().add(imagen);
            imagen.setOnMouseEntered(handler);
            imagen.setOnMouseExited(handler);
            imagen.setOnMouseClicked(handler);
        }

        contenedorInventario.getChildren().add(label);
        return contenedorInventario;
    }

    public void setl(Label l){

	    this.l = l;
    }
}
