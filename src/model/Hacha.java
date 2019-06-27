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

	public Material usarContra(Piedra piedra) {

		this.desgastar();
		return new MaterialNulo();
	}

	public Material usarContra(Metal metal) {

		this.desgastar();
		return new MaterialNulo();
	}

	public Material usarContra(Diamante diamante) {

		this.desgastar();
		return new MaterialNulo();
	}

	@Override
	public Material usarContra(Material material) {
		
		if (material.getID() == 1) {
			return this.usarContra((Madera) material);
		}
		
		else if (material.getID() == 2) {
			return this.usarContra((Piedra) material);
		}
		
		else if (material.getID() == 3) {
			return this.usarContra((Metal) material);
		}
		
		else if (material.getID() == 4) {
			return this.usarContra((Diamante) material);
		}
		
		else {
			return new MaterialNulo();
		}
	}
}
