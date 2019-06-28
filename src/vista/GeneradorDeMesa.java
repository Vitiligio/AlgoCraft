package vista;

import controlador.HandlerCrafteoDiamante;
import controlador.HandlerCrafteoMadera;
import controlador.HandlerCrafteoMetal;
import controlador.HandlerCrafteoPiedra;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.MesaDeCrafteo;
import model.Personaje;

public class GeneradorDeMesa {
	MesaDeCrafteo mesaDeCrafteo;
	Personaje personaje;
	
	public GeneradorDeMesa(Personaje personaje) {
		this.personaje = personaje;
		this.mesaDeCrafteo = personaje.obtenerMesaDeCrafteo();
	}
	
	public VBox generarMesa() {
        HBox primeraFila = new HBox();    
        HBox segundaFila = new HBox();
        HBox terceraFila = new HBox();
        
        Label mensaje_error = new Label();
        HBox cuartaFila = new HBox(mensaje_error);
        
        HBox [] vectorFilas = new HBox [3];
        vectorFilas[0] = primeraFila;
        vectorFilas[1] = segundaFila;
        vectorFilas[2] = terceraFila;
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
            	int[] pos = {i, j};
                MenuButton boton = new MenuButton();
                
                // controlador
                HandlerCrafteoMadera handler_madera = new HandlerCrafteoMadera(pos, personaje, boton, mensaje_error);
                HandlerCrafteoPiedra handler_piedra = new HandlerCrafteoPiedra(pos, personaje, boton, mensaje_error);
                HandlerCrafteoMetal handler_metal = new HandlerCrafteoMetal(pos, personaje, boton, mensaje_error);
                HandlerCrafteoDiamante handler_diamante = new HandlerCrafteoDiamante(pos, personaje, boton, mensaje_error);
                

                MenuItem boton1 = new MenuItem("Madera");
                boton1.setOnAction(handler_madera);
                MenuItem boton2 = new MenuItem("Piedra");
                boton2.setOnAction(handler_piedra);
                MenuItem boton3 = new MenuItem("Metal");
                boton3.setOnAction(handler_metal);
                MenuItem boton4 = new MenuItem("Diamante");
                boton4.setOnAction(handler_diamante);
                boton.getItems().addAll(boton1, boton2, boton3, boton4);
                
                Image maderas = new Image("file:img/inventario_madera.png");
                ImageView img_madera = new ImageView(maderas);
                Image piedras = new Image("file:img/inventario_piedra.png");
                ImageView img_piedra = new ImageView(piedras);
                Image metales = new Image("file:img/inventario_metal.png");
                ImageView img_metal = new ImageView(metales);
                Image dimaantes = new Image("file:img/inventario_diamante.png");
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
        VBox contenedorMesa = new VBox(primeraFila, segundaFila, terceraFila, cuartaFila);
        return contenedorMesa;
	}
}
