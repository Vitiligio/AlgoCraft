package model;

public abstract class Herramienta implements AgregableAlInventario{
	
	protected Material material;
	protected float durabilidad;
	protected int fuerza;
	protected Desgaste tipoDesgaste;
	protected int cantidad;
	protected int ID;

	public Herramienta(float durabilidad, int fuerza, Desgaste tipoDesgaste) {

		//constructor sobrecargado para hacer el pico fino, ya que este no tiene material
		this.durabilidad = durabilidad;
		this.fuerza = fuerza;
		this.tipoDesgaste = tipoDesgaste;
		this.cantidad = 1;
		this.ID = 11;
	}

	public Herramienta(Material material, float durabilidad, int fuerza, Desgaste tipoDesgaste, int ID) {

		this.material = material;
		this.durabilidad = durabilidad;
		this.fuerza = fuerza;
		this.tipoDesgaste = tipoDesgaste;
		this.ID = ID;
	}

	abstract protected void desgastar();

	public Material usarContra(Material material) {
		
		this.desgastar();
		return material.reducirDurabilidad(this.fuerza);
		
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

	public int getID() { return ID; }

}
