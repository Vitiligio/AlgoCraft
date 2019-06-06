package model;

public class Piedra extends Material {


	public Piedra(){

		durabilidad = 30;
	}
	
	public int durabilidadHacha() {
		return 200;
	}
	public int durabilidadPico() {
		return 200;
	}
	
	public int fuerzaHacha() {
		return 5;
	}
	public int fuerzaPico() {
		return 4;
	}
	public Desgaste tipoDeDesgastaHacha() {
		DesgasteLineal desgaste = new DesgasteLineal(1);
		return desgaste;
	}
	public Desgaste tipoDeDesgastePico() {
		DesgasteLineal desgaste = new DesgasteLineal(1.5);
		return desgaste;
	}
}
