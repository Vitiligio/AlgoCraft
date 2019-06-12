package model;

public class Casillero {
	
	EstadoCasillero estado;
	
	public Casillero() {
		
		EstadoLibre estado = new EstadoLibre();
		this.estado = estado;
		
	}
	
	public ObjetoDelMapa obtenerContenido() {
		
		return this.estado.getContenido();
		
	}
	
	public boolean ocupar(ObjetoDelMapa objeto) {
		
		boolean puede_ocupar = estado.puedeOcupar();
		EstadoCasillero nuevoEstado = this.estado.ocupar(objeto);
		this.estado = nuevoEstado;
		return puede_ocupar;
		
	}
	
	public void desocupar() {
		
		EstadoLibre nuevoEstado = new EstadoLibre();
		this.estado = nuevoEstado;
				
	}

}
