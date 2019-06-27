package handlers;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import model.CasilleroDeObjetos;

public class HandlerMouseInventario implements EventHandler<MouseEvent> {

    private Pane pane;
    private Label label;
    private CasilleroDeObjetos casillero;

    public HandlerMouseInventario(Label label, CasilleroDeObjetos casillero){

        this.label = label;
        this.casillero = casillero;
    }

    @Override
    public void handle(MouseEvent mouseEvent) {

        if(mouseEvent.getEventType().equals(MouseEvent.MOUSE_ENTERED)){
            label.setText("Cantidad: " + Integer.toString(casillero.getCantidadObjeto()));
            label.setTranslateY(100);
        }

        else{
            if(mouseEvent.getEventType().equals(MouseEvent.MOUSE_EXITED)){
                label.setText("");
            }
        }
    }
}
