package model;

import java.util.ArrayList;

public class Inventario {
	
	private ArrayList<AgregableAlInventario> inventario;
	private Herramienta objetoEquipado;
	
	public Inventario() {
		
		Madera madera = new Madera();
		Desgaste tipoDesgaste = new DesgasteLineal(1);
		Herramienta hachaDeMadera = new Hacha(madera,100,2,tipoDesgaste, 5);
		
		inventario = new ArrayList<>();
		inventario.add(hachaDeMadera);
		objetoEquipado = hachaDeMadera;
		
	}
	
	public Herramienta getObjetoEquipado() {
		
		return this.objetoEquipado;
		
	}

	public void agregarAlInventario(AgregableAlInventario objeto){

		for(int i = 0; i < inventario.size(); i++){
			if(objeto.getID() == inventario.get(i).getID()){
				inventario.get(i).aumentarCantidad(objeto);
				return;
			}
		}

		inventario.add(objeto);
	}

	public int getCantidad(AgregableAlInventario objeto){

		for(int i = 0; i < inventario.size(); i++) {
			if (objeto.getID() == inventario.get(i).getID()) {
				return inventario.get(i).getCantidad();
			}
		}

		return 0;
	}

	public void sacarDelInventario(AgregableAlInventario objeto) {

		for(int i = 0; i < inventario.size(); i++) {

			//si encuentra el objeto a sacar y su cantidad es mayor a uno
			if (objeto.getID() == inventario.get(i).getID() && inventario.get(i).getCantidad() > 1) {
				inventario.get(i).disminuirCantidad();
			}

			//si encuentra el objeto a sacar y su cantidad es uno
			else
				if(objeto.getID() == inventario.get(i).getID())
					inventario.remove(objeto);
		}
	}
}
