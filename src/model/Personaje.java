package model;


public class Personaje extends ObjetoDelMapa{
	
	private Inventario inventario;
	
	public Personaje() {
		
		inventario = new Inventario();
		this.ID = 0;
	
	}
	
	public Herramienta getObjetoEquipado() {
		
		return this.inventario.getObjetoEquipado();
	
	}
	
}
