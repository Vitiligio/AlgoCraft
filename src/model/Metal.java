package model;

public class Metal extends Material {
	private int durabilidad = 50;
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
	public int tipoDeDesgastaHacha() {
		return 0;
	}
	public int tipoDeDesgastePico() {
		return 0;
	}
}
