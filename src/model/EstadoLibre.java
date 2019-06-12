package model;

public class EstadoLibre extends EstadoCasillero {
	
	public EstadoCasillero ocupar(ObjetoDelMapa objeto) {
		
		EstadoCasillero nuevoEstado = new EstadoOcupado(objeto);
		return nuevoEstado;
		
	}
	
	public ObjetoDelMapa getContenido() {
		
		return null;
		
	}
	
	protected boolean puedeOcupar() {
		return true;
	}

}
