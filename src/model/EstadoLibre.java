package model;

public class EstadoLibre {
	
	public EstadoCasillero ocupar(ObjetoDelMapa objeto) {
		
		EstadoCasillero nuevoEstado = new EstadoOcupado(objeto);
		return nuevoEstado;
		
	}
	
	public ObjetoDelMapa getContenido() {
		
		return null;
		
	}

}
