package model;

public class Pico extends Herramienta {


	public Pico(Material material, float durabilidad, int fuerza, Desgaste tipoDesgaste) {
		
		super(material,durabilidad,fuerza,tipoDesgaste);
		
	}
    
    protected void desgastar() {
		
		this.durabilidad -= this.tipoDesgaste.calcularDesgaste(this.fuerza);
		
	}
    
    public void usarContra(Madera madera) {
    	
    	this.desgastar();
    	
    }
	public void usarContra(Piedra piedra) {

    	piedra.reducirDurabilidad(this.fuerza);
    	this.desgastar();
		
	}
	public void usarContra(Metal metal) {

    	if(material.getClass() != Madera.class)
			metal.reducirDurabilidad(this.fuerza);

		this.desgastar();
	}
	public void usarContra(Diamante diamante) {

    	this.desgastar();
	}
}
