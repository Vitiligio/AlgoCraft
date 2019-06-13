package model;

public class Madera extends Material {


	public Madera(){

		durabilidad = 10;
		ID = 1;
	}

	@Override
	protected void daniarMetal(Metal metal, int fuerza) { }
}
