package model;

public class Hacha extends Herramienta {

	public Hacha(Material material, float durabilidad, int fuerza, Desgaste tipoDesgaste, int ID) {

		super(material, durabilidad, fuerza, tipoDesgaste, ID);
	}

	protected void desgastar() {

		this.durabilidad -= this.tipoDesgaste.calcularDesgaste(this.fuerza);
	}

	public Material usarContra(Madera madera) {

		this.desgastar();
		return madera.reducirDurabilidad(this.fuerza);

	}
	//asumimos que el hacha no puede desgastar los siguientes materiales, pero el hacha si se desgasta al ser usada contra ellos

	public void usarContra(Piedra piedra) {

		this.desgastar();
	}

	public void usarContra(Metal metal) {

		this.desgastar();
	}

	public void usarContra(Diamante diamante) {

		this.desgastar();


	}
}
