package model;

public class Herramienta {

	protected float durabilidad;
	protected int fuerza;
	protected Desgaste tipoDesgaste;
	protected Material material;
		
	public void usarContra(Madera madera) {
			
	}
		
	public void usarContra(Piedra piedra) {
			
	}
		
	public void usarContra(Metal metal) {
			
	}
		
	public void usarContra(Diamante diamante) {
			
	}
		
	protected void desgastar() {
			
	}
	
	//getters y setters para hacer las pruebas
	public float getDurabilidad() {
		return durabilidad;
	}

	public void setDurabilidad(float durabilidad) {
		this.durabilidad = durabilidad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
}
