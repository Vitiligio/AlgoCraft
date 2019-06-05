package model;

public class Madera extends Material {
	private int durabilidad = 10;
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
	public int tipoDeDesgastaHacha() {
		return 0;
	}
	public int tipoDeDesgastePico() {
		return 0;
	}
}
