package model;

public class Hacha extends Herramienta {
	
	public Hacha(Material material) {
		
		this.durabilidad = material.durabilidadHacha();
		this.fuerza = material.fuerzaHacha();
		this.tipoDesgaste = material.tipoDeDesgastaHacha();
		this.material = material;
		
	}
	
protected void desgastar() {
		
		this.durabilidad -= this.tipoDesgaste.calcularDesgaste(this.fuerza);
		
	}
	
	public void usarContra(Madera madera) {
		
		this.desgastar();
		madera.reducirDurabilidad(this.fuerza);
		
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
