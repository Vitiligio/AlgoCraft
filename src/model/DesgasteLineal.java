package model;

public class DesgasteLineal extends Desgaste {
	private int coeficiente;
	public DesgasteLineal(int coef) {
		this.coeficiente = coef;
	}
	@Override
	int calcularDesgaste(int fuerza) {
		return fuerza/coeficiente;
	}

}
