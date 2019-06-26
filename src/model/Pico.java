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

	public Material usarContra(Piedra piedra) {

    	this.desgastar();
		return piedra.reducirDurabilidad(this.fuerza);
	}

	public Material usarContra(Metal metal) {

   		this.desgastar();
   		return metal.golpeadoPor(this.material, this.fuerza);
	}

}
