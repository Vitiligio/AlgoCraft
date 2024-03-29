package model;

public class Casillero {
	
	EstadoCasillero estado;
	
	public Casillero() {
		
		EstadoLibre estado = new EstadoLibre();
		this.estado = estado;
		
	}
	
	public ObjetoDelMapa obtenerContenido(){
		try {
			return this.estado.getContenido();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public void ocupar(ObjetoDelMapa objeto) {

		EstadoCasillero nuevoEstado = this.estado.ocupar(objeto);
		this.estado = nuevoEstado;

		
	}
	
	public void desocupar() {
		
		EstadoLibre nuevoEstado = new EstadoLibre();
		this.estado = nuevoEstado;
				
	}

}
