package model;
import Excepciones.*;

public class Casillero {
	
	EstadoCasillero estado;
	
	public Casillero() {
		
		EstadoLibre estado = new EstadoLibre();
		this.estado = estado;
		
	}
	
	public ObjetoDelMapa obtenerContenido() {
		
		try {
			
			return this.estado.getContenido();
		
		}catch(NoHayContenidoExcepcion excepcion) {
			
			return;
			
		}
		
	}
	
	public void ocupar(ObjetoDelMapa objeto) {
		
		try {
		
			EstadoCasillero nuevoEstado = this.estado.ocupar(objeto);
			this.estado = nuevoEstado;
		
		}catch(NoSePuedeOcuparExcepcion excepcion) {
		
			return;
		
		}
	}
	
	public void desocupar() {
		
		EstadoLibre nuevoEstado = new EstadoLibre();
		this.estado = nuevoEstado;
				
	}

}
