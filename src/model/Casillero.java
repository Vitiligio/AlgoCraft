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
	
	public void ocupar(ObjetoDelMapa objeto) {
		
		EstadoCasillero nuevoEstado = this.estado.ocupar(objeto);
		this.estado = nuevoEstado;
		
	}

}
