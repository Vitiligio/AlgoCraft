package model;

public abstract class Material extends ObjetoDelMapa implements AgregableAlInventario{

	protected int durabilidad;
	protected int cantidad = 1;
	
	public void reducirDurabilidad(int cantidad) {
		durabilidad -= cantidad;
	}

	public int getDurabilidad() {
		return durabilidad;
	}

    public int getID() { return ID; }

	public int getCantidad() { return cantidad; }

	public void aumentarCantidad(AgregableAlInventario objeto){

		this.cantidad = this.cantidad + objeto.getCantidad();
	}

	public void disminuirCantidad(){

		this.cantidad--;
	}

    protected abstract void daniarMetal(Metal metal, int fuerza);
    
}
