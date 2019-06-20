package model;

public class EstadoLibre implements EstadoCasillero {
	
	public EstadoOcupado ocupar(ObjetoDelMapa objeto) {
		
		EstadoOcupado nuevoEstado = new EstadoOcupado(objeto);
		return nuevoEstado;
		
	}
	
	public ObjetoDelMapa getContenido() {
		
		return null;
		
	}
	
	protected boolean puedeOcupar() {
		return true;
	}

}
