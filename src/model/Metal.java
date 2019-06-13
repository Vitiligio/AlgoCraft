package model;

public class Metal extends Material {


	public Metal(){

		durabilidad = 50;
		ID = 3;
	}

	public void golpeadoPor(Material material, int fuerza) {

		material.da�arMetal(this, fuerza);		//patron double dispatch
	}

	@Override
	protected void da�arMetal(Metal metal, int fuerza) {

		metal.reducirDurabilidad(fuerza);
	}
}
