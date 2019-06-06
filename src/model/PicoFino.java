package model;

public class PicoFino extends Herramienta {

	public PicoFino(){

		this.durabilidad = 1000;
		this.fuerza = 20;
		this.tipoDesgaste = new DesgasteFino();
	}
	
	public void usarContra(Madera madera) {}
	
	public void usarContra(Piedra piedra) {
		
		piedra.reducirDurabilidad(this.fuerza);
	}
	
	public void usarContra(Metal metal) {
		
		metal.reducirDurabilidad(this.fuerza);
	}
	
	public void usarContra(Diamante diamante) {
		
		this.desgastar();
		diamante.reducirDurabilidad(this.fuerza);
	}	
	
	protected void desgastar() {
			
		this.durabilidad = (float)this.tipoDesgaste.calcularDesgaste(this.durabilidad);
	}
}
