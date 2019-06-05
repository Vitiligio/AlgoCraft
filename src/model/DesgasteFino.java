package model;

public class DesgasteFino extends Desgaste {

	@Override
	double calcularDesgaste(double durabilidad) {
		return durabilidad*0.1;
	}

}
