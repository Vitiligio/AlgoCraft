package handlers;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import model.CasilleroDeObjetos;
import model.Inventario;

public class HandlerMouseInventario implements EventHandler<MouseEvent> {

    private Inventario inventario;
    private Label label;
    private CasilleroDeObjetos casillero;

    public HandlerMouseInventario(Label label, CasilleroDeObjetos casillero, Inventario inventario){

        this.label = label;
        this.casillero = casillero;
        this.inventario = inventario;
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
                if(mouseEvent.getEventType().equals(MouseEvent.MOUSE_PRESSED)){
                    if(casillero.getIDObjeto() > 4){
                        inventario.equipar(casillero.getObjeto());
                        label.setText("equipa3");
                    }
                }
            }
        }
    }
}
