package model;

public class Diamante extends Material {

	public Diamante(){

		durabilidad = 100;
		ID = 4;
	}

	@Override
	protected void dañarMetal(Metal metal, int fuerza) { }
}
