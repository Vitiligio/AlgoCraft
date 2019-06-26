package model;

public class Metal extends Material {


	public Metal(){

		durabilidad = 50;
		ID = 3;
	}

	public Material golpeadoPor(Material material, int fuerza) {

		return material.daniarMetal(this, fuerza);		//patron double dispatch
	}

	@Override
	protected Material daniarMetal(Metal metal, int fuerza) {

		return (metal.reducirDurabilidad(fuerza));
	}
}
