package model;

public class Diamante extends Material {

	public Diamante(){

		durabilidad = 100;
		ID = 4;
	}

	@Override
	protected Material daniarMetal(Metal metal, int fuerza) { 
		MaterialNulo material = new MaterialNulo();
		return  material;
	}
}
