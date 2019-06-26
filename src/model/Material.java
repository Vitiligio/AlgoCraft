package model;

public abstract class Material extends ObjetoDelMapa implements AgregableAlInventario{

	protected int durabilidad;
	//El material devuelve el material nulo hasta que se rompe y ahi devuelve el material que es.
	public Material reducirDurabilidad(int cantidad) {
		
		Material material;
		
		if (durabilidad > 1) {
			material = new MaterialNulo();
		}
		
		else {
			material = this;
		}
		
		durabilidad -= cantidad;
		return material;
	}

	public int getDurabilidad() {
		return durabilidad;
	}

    public int getID() { return ID; }

    protected abstract Material daniarMetal(Metal metal, int fuerza);
    
}
