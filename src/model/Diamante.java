package model;

public class Diamante extends Material {
	private int durabilidad = 100;
	public int durabilidadHacha() {
		return 0;
	}
	public int durabilidadPico() {
		return 0;
	}
	
	public int fuerzaHacha() {
		return 0;
	}
	public int fuerzaPico() {
		return 0;
	}
	public Desgaste tipoDeDesgastaHacha() {
		return null;
	}
	public Desgaste tipoDeDesgastePico() {
		return null;
	}
}
