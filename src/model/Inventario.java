package model;

public class Inventario {

	private CasilleroDeObjetos[] inventario;
	private Herramienta objetoEquipado;

	public Inventario() {

		Madera madera = new Madera();
		Desgaste tipoDesgaste = new DesgasteLineal(1);
		Herramienta hachaDeMadera = new Hacha(madera,100,2,tipoDesgaste, 5);

		inventario = new CasilleroDeObjetos[10];
		inicializarInventario();
		agregarAlInventario(hachaDeMadera);
		objetoEquipado = hachaDeMadera;

	}

	private void inicializarInventario(){
		for(int i = 0; i < 10; i++){
			inventario[i] = new CasilleroDeObjetos();
		}
	}

	public Herramienta getObjetoEquipado() {

		return this.objetoEquipado;

	}

	public void agregarAlInventario(AgregableAlInventario objeto){

		for(int i = 0; i < inventario.length; i++){

			if(objeto.getID() == inventario[i].getIDObjeto()){
				inventario[i].aumentarCantidad();
				return;
			}
		}

		for(int i = 0; i < inventario.length; i++){

			if(inventario[i].getIDObjeto() == 0){
				inventario[i].asignarObjeto(objeto);
				return;
			}
		}
	}

	public int getCantidad(AgregableAlInventario objeto){

		for(int i = 0; i < inventario.length; i++) {
			if (objeto.getID() == inventario[i].getIDObjeto()) {
				return inventario[i].getCantidadObjeto();
			}
		}

		return 0;
	}

	public void sacarDelInventario(AgregableAlInventario objeto) {

		for(int i = 0; i < inventario.length; i++) {

			if (objeto.getID() == inventario[i].getIDObjeto()) {
				inventario[i].disminuirCantidad();
			}
		}
	}

	public CasilleroDeObjetos getCasillero(int i){

		return inventario[i];
	}
}
