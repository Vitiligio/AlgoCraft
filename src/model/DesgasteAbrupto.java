package model;

public class DesgasteAbrupto extends Desgaste {
	private int usos;
	@Override
	int calcularDesgaste() {
		usos--;
		return (usos <= 0) ? 0 : 100;
	}

}
