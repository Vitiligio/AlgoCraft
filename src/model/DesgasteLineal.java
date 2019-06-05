package model;

public class DesgasteLineal extends Desgaste {
	private double coeficiente;
	public DesgasteLineal(double coef) {
		this.coeficiente = coef;
	}
	@Override
	double calcularDesgaste(double fuerza) {
		return fuerza/coeficiente;
	}

}
