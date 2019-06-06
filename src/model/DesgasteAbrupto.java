package model;

public class DesgasteAbrupto extends Desgaste {

	private int usos;

	public DesgasteAbrupto(){

		usos = 10;
	}

	@Override
	double calcularDesgaste(double fuerza) {
		usos--;
		if (usos < 0) usos = 0;
		return (usos == 0) ? 400 : 0;
	}

}
