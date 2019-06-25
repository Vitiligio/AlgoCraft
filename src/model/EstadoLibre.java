package model;
import model.Excepciones.*;

public class EstadoLibre implements EstadoCasillero {
	
	public EstadoOcupado ocupar(ObjetoDelMapa objeto) {
		
		EstadoOcupado nuevoEstado = new EstadoOcupado(objeto);
		return nuevoEstado;
		
	}
	
	public ObjetoDelMapa getContenido() throws NoHayContenidoExcepcion{
		
		throw new NoHayContenidoExcepcion();
		
	}
	
	protected boolean puedeOcupar() {
		return true;
	}

}
