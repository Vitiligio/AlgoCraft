package model;
import model.Excepciones.*;

public interface EstadoCasillero {
	
	public abstract EstadoOcupado ocupar(ObjetoDelMapa objeto) throws NoSePuedeOcuparExcepcion;
	public abstract ObjetoDelMapa getContenido() throws NoHayContenidoExcepcion;

}
