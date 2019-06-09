package model;

public class Hacha extends Herramienta {
	
	public Hacha(Material material, float durabilidad, int fuerza, Desgaste tipoDesgaste) {
		
		super(material,durabilidad,fuerza,tipoDesgaste);
		
	}
	
	protected void desgastar() {
		
		this.durabilidad -= this.tipoDesgaste.calcularDesgaste(this.fuerza);
		
	}
	
	public void usarContra(Madera madera) {
		
		this.desgastar();
		madera.reducirDurabilidad(this.fuerza);
		
	}
	//asumimos que el hacha no puede desgastar los siguientes materiales, pero el hacha si se desgasta al ser usada contra ellos

	
}
