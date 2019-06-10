package model;

public class EstadoOcupado extends EstadoCasillero {
	
	ObjetoDelMapa contenido;
	
	public EstadoOcupado(ObjetoDelMapa contenido) {
		super();
		this.contenido = contenido;
	}
	
	public ObjetoDelMapa getContenido() {
		
		return this.contenido;

	}
	
	public EstadoCasillero ocupar(ObjetoDelMapa objeto) {
		
		return this;
		
	}

}
