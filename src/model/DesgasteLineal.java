package model;

public class DesgasteLineal extends Desgaste {
	private int coeficiente;
	@Override
	int calcularDesgaste() {
		return coeficiente;
	}

}
