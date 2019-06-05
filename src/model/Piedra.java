package model;

public class Piedra extends Material {
	private int durabilidad = 30;
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
	public int tipoDeDesgastaHacha() {
		return 0;
	}
	public int tipoDeDesgastePico() {
		return 0;
	}
}
