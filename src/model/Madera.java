package model;

public class Madera extends Material {


	public Madera(){

		durabilidad = 10;
		ID = 1;
	}

	@Override
	protected Material daniarMetal(Metal metal, int fuerza) {
		MaterialNulo material = new MaterialNulo();
		return  material;
	}
}
