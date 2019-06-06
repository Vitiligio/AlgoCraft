package model;

public class Personaje {
	

	ObjetoDeInventario inventario[];
	ObjetoDeInventario objetoEquipado;
	
	public Personaje() {
		
		Madera madera = new Madera();
		ObjetoDeInventario hachaDeMadera = new Hacha(madera);
		
		this.inventario[0] = hachaDeMadera;
		this.objetoEquipado = hachaDeMadera;
		
	}
	
	public ObjetoDeInventario getObjetoEquipado() {
		return objetoEquipado;
	}
	
}
