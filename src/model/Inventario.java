package model;

import java.util.ArrayList;

public class Inventario {
	
	private ArrayList<Herramienta> herramientas;
	private ArrayList<Material> materiales;
	private Herramienta objetoEquipado;
	
	public Inventario() {
		
		Madera madera = new Madera();
		Herramienta hachaDeMadera = new Hacha(madera);
		
		herramientas = new ArrayList<Herramienta>();
		herramientas.add(hachaDeMadera);
		objetoEquipado = hachaDeMadera;
		
	}
	
	public Herramienta getObjetoEquipado() {
		
		return this.objetoEquipado;
		
	}

}
