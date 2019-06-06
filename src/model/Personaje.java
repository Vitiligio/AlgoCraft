package model;

public class Personaje {
	

	Herramienta inventario[];
	Herramienta objetoEquipado;
	
	public Personaje() {
		
		Madera madera = new Madera();
		Herramienta hachaDeMadera = new Hacha(madera);
		
		this.inventario[0] = hachaDeMadera;
		this.objetoEquipado = hachaDeMadera;
		
	}
	
	public Herramienta getObjetoEquipado() {
		return objetoEquipado;
	}
	
}
