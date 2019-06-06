package model;

public abstract class Herramienta {
	
	protected float durabilidad;
	protected int fuerza;
	protected Desgaste tipoDesgaste;
	protected Material material;
		
	abstract public void usarContra(Madera madera);
	abstract public void usarContra(Piedra piedra);
	abstract public void usarContra(Metal metal);
	abstract public void usarContra(Diamante diamante);	
	abstract protected void desgastar();
	
	//getters para hacer las pruebas
	public float getDurabilidad() {
		return durabilidad;
	}

	public Material getMaterial() {
		return this.material;
	}
	
	public int getFuerza() {
		return fuerza;
	}
}
