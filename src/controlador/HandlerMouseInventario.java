package controlador;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import model.CasilleroDeObjetos;
import model.Inventario;

public class HandlerMouseInventario implements EventHandler<MouseEvent> {

    private Inventario inventario;
    private Label label;
    private CasilleroDeObjetos casillero;
    private Label l;

    public HandlerMouseInventario(Label label, CasilleroDeObjetos casillero, Inventario inventario, Label l){

        this.label = label;
        this.casillero = casillero;
        this.inventario = inventario;
        this.l = l;
    }

    @Override
    public void handle(MouseEvent mouseEvent) {

        if(mouseEvent.getEventType().equals(MouseEvent.MOUSE_ENTERED)){
            label.setText("Cantidad: " + Integer.toString(casillero.getCantidadObjeto()));
            label.setTranslateY(40);
            label.setTranslateX(-200);
        }

        else{
            if(mouseEvent.getEventType().equals(MouseEvent.MOUSE_EXITED)){
                label.setText("");
            }
            else{
                if(mouseEvent.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
                    if(casillero.getIDObjeto() > 4){
                        l.setText(nombreHerramienta(casillero.getIDObjeto()));
                        label.setText("Herramienta equipada");
                        inventario.equipar(casillero.getObjeto());
                    }
                }
            }
        }
    }

    private String nombreHerramienta(int ID) {

        String nombre = "";

        switch (ID){
            case 5:
                nombre = "Hacha De Madera";
                break;

            case 6:
                nombre = "Hacha De Piedra";
                break;

            case 7:
                nombre = "Hacha De Metal";
                break;

            case 8:
                nombre = "Pico De Madera";
                break;

            case 9:
                nombre = "Pico De Piedra";
                break;

            case 10:
                nombre = "Pico de Metal";
                break;

            case 11:
                nombre = "Pico Fino";
                break;
        }

        return nombre;
    }
}
