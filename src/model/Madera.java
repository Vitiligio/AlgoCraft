package model;

public class Madera extends Material {


	public Madera(){

		durabilidad = 10;
		ID = 1;
	}

	@Override
	protected void daņarMetal(Metal metal, int fuerza) { }
}
