package model;


public class Personaje extends ObjetoDelMapa{
	
	private Inventario inventario;
	
	public Personaje() {
		
		inventario = new Inventario();
	
	}
	
	public Herramienta getObjetoEquipado() {
		
		return this.inventario.getObjetoEquipado();
	
	}
	
}
