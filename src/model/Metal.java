package model;

public class Metal extends Material {


	public Metal(){

		durabilidad = 50;
		ID = 3;
	}

	public void golpeadoPor(Material material, int fuerza) {

		material.daniarMetal(this, fuerza);		//patron double dispatch
	}

	@Override
	protected void daniarMetal(Metal metal, int fuerza) {

		metal.reducirDurabilidad(fuerza);
	}
}
