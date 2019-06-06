package model;

public class Metal extends Material {


	public Metal(){
		durabilidad = 50;
	}

	public int durabilidadHacha() {
		return 400;
	}
	public int durabilidadPico() {
		return 400;
	}
	
	public int fuerzaHacha() {
		return 10;
	}
	public int fuerzaPico() {
		return 12;
	}
	public Desgaste tipoDeDesgastaHacha() {
		DesgasteLineal desgaste = new DesgasteLineal(2);
		return desgaste;
	}
	public Desgaste tipoDeDesgastePico() {
		DesgasteAbrupto desgaste = new DesgasteAbrupto();
		return desgaste;
	}
}
