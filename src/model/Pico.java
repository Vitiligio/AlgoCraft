package model;

public class Pico extends Herramienta {


	public Pico(Material material, float durabilidad, int fuerza, Desgaste tipoDesgaste, int ID) {
		
		super(material,durabilidad,fuerza,tipoDesgaste, ID);
		
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

    	metal.golpeadoPor(this.material, this.fuerza);
		this.desgastar();
	}

}
