package model;

public class Piedra extends Material {


	public Piedra(){

		durabilidad = 30;
		ID = 2;
	}

	@Override
	protected void daniarMetal(Metal metal, int fuerza) {

		metal.reducirDurabilidad(fuerza);
	}
}
