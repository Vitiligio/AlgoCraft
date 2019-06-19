package model;

public abstract class Material extends ObjetoDelMapa implements AgregableAlInventario{

	protected int durabilidad;
	
	public void reducirDurabilidad(int cantidad) {
		durabilidad -= cantidad;
	}

	public int getDurabilidad() {
		return durabilidad;
	}

    public int getID() { return ID; }

    protected abstract void daniarMetal(Metal metal, int fuerza);
    
}
