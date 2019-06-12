package model;

public abstract class EstadoCasillero {
	
	public abstract EstadoCasillero ocupar(ObjetoDelMapa objeto);
	public abstract ObjetoDelMapa getContenido();
	protected abstract boolean puedeOcupar();

}
