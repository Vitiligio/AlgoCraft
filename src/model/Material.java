package model;

public abstract class Material implements ObjetoDeInventario{
	private int durabilidad;
	abstract int durabilidadHacha();
	abstract int durabilidadPico();
	abstract int fuerzaHacha();
	abstract int fuerzaPico();
	abstract Desgaste tipoDeDesgastaHacha();
	abstract Desgaste tipoDeDesgastePico();
	
	
	public void reducirDurabilidad(int cantidad) {
		durabilidad -= cantidad;
	}
	public int getDurabilidad() {
		return durabilidad;
	}
}
