package model;

public class Madera extends Material {


	public Madera(){

		durabilidad = 10;
	}

	public int durabilidadHacha() {
		return 100;
	}
	public int durabilidadPico() {
		return 100;
	}
	
	public int fuerzaHacha() {
		return 2;
	}
	public int fuerzaPico() {
		return 2;
	}
	public Desgaste tipoDeDesgastaHacha() {
		DesgasteLineal desgaste = new DesgasteLineal(1);
		return desgaste;
	}
	public Desgaste tipoDeDesgastePico() {
		DesgasteLineal desgaste = new DesgasteLineal(1);
		return desgaste;
	}
}
