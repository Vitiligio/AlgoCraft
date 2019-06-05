package model;

public class DesgasteAbrupto extends Desgaste {
	private int usos;
	@Override
	int calcularDesgaste(int fuerza) {
		usos--;
		if (usos < 0) usos = 0;
		return (usos == 0) ? 400 : 0;
	}
}
