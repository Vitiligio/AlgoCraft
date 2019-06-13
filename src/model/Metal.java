package model;

public class Metal extends Material {


	public Metal(){

		durabilidad = 50;
		ID = 3;
	}

	public void golpeadoPor(Material material, int fuerza) {

		material.dañarMetal(this, fuerza);		//patron double dispatch
	}

	@Override
	protected void dañarMetal(Metal metal, int fuerza) {

		metal.reducirDurabilidad(fuerza);
	}
}
