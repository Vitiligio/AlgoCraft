package model;
import model.Excepciones.*;

public class EstadoOcupado implements EstadoCasillero {
	
	ObjetoDelMapa contenido;
	
	public EstadoOcupado(ObjetoDelMapa contenido) {
		super();
		this.contenido = contenido;
	}
	
	public ObjetoDelMapa getContenido() {
		
		return this.contenido;

	}
	
	public EstadoOcupado ocupar(ObjetoDelMapa objeto) throws NoSePuedeOcuparExcepcion {
		
		throw new NoSePuedeOcuparExcepcion();
		
	}
	
	protected boolean puedeOcupar() {
		return false;
	}

}
