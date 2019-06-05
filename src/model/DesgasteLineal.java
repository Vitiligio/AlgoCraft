package model;

public class DesgasteLineal extends Desgaste {
	private int coeficiente;
	@Override
	int calcularDesgaste(int durabilidadActual, int fuerza) {
		return durabilidadActual -= (fuerza/coeficiente);
	}

}
