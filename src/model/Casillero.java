package model;
import Excepciones.*;

public class Casillero {
	
	EstadoCasillero estado;
	
	public Casillero() {
		
		EstadoLibre estado = new EstadoLibre();
		this.estado = estado;
		
	}
	
	public ObjetoDelMapa obtenerContenido() throws NoHayContenidoExcepcion{
		
		return this.estado.getContenido();
		
	}
	
	public void ocupar(ObjetoDelMapa objeto) throws NoSePuedeOcuparExcepcion {
		
		EstadoCasillero nuevoEstado = this.estado.ocupar(objeto);
		this.estado = nuevoEstado;
		
	}
	
	public void desocupar() {
		
		EstadoLibre nuevoEstado = new EstadoLibre();
		this.estado = nuevoEstado;
				
	}

}
