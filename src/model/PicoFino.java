package model;

public class PicoFino extends Herramienta {

	public PicoFino(Material material, float durabilidad, int fuerza, Desgaste tipoDesgaste) {
		
		super(material,durabilidad,fuerza,tipoDesgaste);
		
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
