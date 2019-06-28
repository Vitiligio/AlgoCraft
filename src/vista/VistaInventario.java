package vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import model.CasilleroDeObjetos;

public class VistaInventario extends Rectangle {

    private ImageView textura;

    public VistaInventario(CasilleroDeObjetos casillero){

        textura = new ImageView();
        setTextura(casillero.getIDObjeto());
    }

    public ImageView getTextura(){

        return textura;
    }

    private void setTextura(int ID){

        switch (ID){

            case 0:
                textura.setImage(new Image("file:img/inventario_vacio.png"));
            break;

            case 1:
                textura.setImage(new Image("file:img/inventario_madera.png"));
            break;

            case 2:
                textura.setImage(new Image("file:img/inventario_piedra.png"));
                break;

            case 3:
                textura.setImage(new Image("file:img/inventario_metal.png"));
                break;

            case 4:
                textura.setImage(new Image("file:img/inventario_diamante.png"));
                break;

            case 5:
                textura.setImage(new Image("file:img/inventario_hacha_madera.png"));
            break;

            case 6:
                textura.setImage(new Image("file:img/inventario_hacha_piedra.png"));
                break;

            case 7:
                textura.setImage(new Image("file:img/inventario_hacha_metal.png"));
                break;

            case 8:
                textura.setImage(new Image("file:img/inventario_pico_madera.png"));
            break;

            case 9:
                textura.setImage(new Image("file:img/inventario_pico_piedra.png"));
                break;

            case 10:
                textura.setImage(new Image("file:img/inventario_pico_metal.png"));
                break;

            case 11:
                textura.setImage(new Image("file:img/inventario_pico_fino.png"));
                break;
        }
    }

}
