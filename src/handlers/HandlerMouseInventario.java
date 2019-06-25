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

    public HandlerMouseInventario(Pane pane, CasilleroDeObjetos casillero){

        this.pane = pane;
        this.label = new Label();
        this.casillero = casillero;
    }

    @Override
    public void handle(MouseEvent mouseEvent) {

        if(mouseEvent.getEventType().equals(MouseEvent.MOUSE_ENTERED)){
            label.setText("Cantidad: " + Integer.toString(casillero.getCantidadObjeto()));
            label.setTranslateY(100);
            pane.getChildren().add(label);
        }

        else{
            if(mouseEvent.getEventType().equals(MouseEvent.MOUSE_EXITED)){
                pane.getChildren().remove(label);
            }
        }
    }
}
