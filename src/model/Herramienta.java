package model;

public abstract class Herramienta {
	
	protected Material material;
	protected float durabilidad;
	protected int fuerza;
	protected Desgaste tipoDesgaste;

	abstract protected void desgastar();
	
	public Herramienta(Material material, float durabilidad, int fuerza, Desgaste tipoDesgaste) {
		
		this.material = material;
		this.durabilidad = durabilidad;
		this.fuerza = fuerza;
		this.tipoDesgaste = tipoDesgaste;
		
	}
	
	public void usarContra(Material material) {
		
		this.desgastar();
		
	}

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
