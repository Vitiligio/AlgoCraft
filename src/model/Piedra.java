package model;

public class Piedra extends Material {


	public Piedra(){

		durabilidad = 30;
		ID = 2;
	}

	@Override
	protected Material daniarMetal(Metal metal, int fuerza) {

		return metal.reducirDurabilidad(fuerza);
	}
}
