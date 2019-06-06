package model;

import java.util.ArrayList;

public class Personaje {
	

	private ArrayList<Herramienta> inventario;
	private Herramienta objetoEquipado;
	
	public Personaje() {
		
		Madera madera = new Madera();
		Herramienta hachaDeMadera = new Hacha(madera);
		inventario = new ArrayList<Herramienta>();
		
		inventario.add(hachaDeMadera);
		this.objetoEquipado = hachaDeMadera;
		
	}
	
	public Herramienta getObjetoEquipado() {
		return objetoEquipado;
	}
	
}
