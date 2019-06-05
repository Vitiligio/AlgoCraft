package model;

public abstract class Material {
	private int durabilidad;
	abstract int durabilidadHacha();
	abstract int durabilidadPico();
	abstract int fuerzaHacha();
	abstract int fuerzaPico();
	abstract Desgaste tipoDeDesgastaHacha();
	abstract Desgaste tipoDeDesgastePico();
}
