package model;

public class PicoFino extends Herramienta {

	public PicoFino(float durabilidad, int fuerza, Desgaste tipoDesgaste) {
		
		super(durabilidad,fuerza,tipoDesgaste);
		
	}
	
	public void usarContra(Madera madera) {}
	
	public Material usarContra(Piedra piedra) {
		
		return piedra.reducirDurabilidad(this.fuerza);
	}
	
	public Material usarContra(Metal metal) {
		
		return metal.reducirDurabilidad(this.fuerza);
	}
	
	public Material usarContra(Diamante diamante) {
		
		this.desgastar();
		return diamante.reducirDurabilidad(this.fuerza);
	}	
	
	protected void desgastar() {
			
		this.durabilidad = (float)this.tipoDesgaste.calcularDesgaste(this.durabilidad);
	}
}
