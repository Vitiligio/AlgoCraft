package model;

public class Metal extends Material {


	public Metal(){

		durabilidad = 50;
		ID = 3;
	}

	public void golpeadoPor(Material material, int fuerza) {

		material.daņarMetal(this, fuerza);		//patron double dispatch
	}

	@Override
	protected void daņarMetal(Metal metal, int fuerza) {

		metal.reducirDurabilidad(fuerza);
	}
}
