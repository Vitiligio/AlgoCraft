package model;

public abstract class Material {

	protected int durabilidad;
	protected int ID;
	
	public void reducirDurabilidad(int cantidad) {
		durabilidad -= cantidad;
	}

	public int getDurabilidad() {
		return durabilidad;
	}

    public int getID() { return ID; }

    protected abstract void dañarMetal(Metal metal, int fuerza);
}
