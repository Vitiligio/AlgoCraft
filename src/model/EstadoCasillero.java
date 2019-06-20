package model;
import Excepciones.*;

public interface EstadoCasillero {
	
	public abstract EstadoOcupado ocupar(ObjetoDelMapa objeto) throws NoSePuedeOcuparExcepcion;
	public abstract ObjetoDelMapa getContenido();

}
