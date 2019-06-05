package model;

public class Pico extends Herramienta {


    public Pico(Material material){

        this.material = material;
        this.durabilidad = this.material.durabilidadPico();
		this.fuerza = this.material.fuerzaPico();
		this.tipoDesgaste = this.material.tipoDeDesgastePico();
    }
    
    protected void desgastar() {
		
		this.durabilidad -= this.tipoDesgaste.calcularDesgaste(this.fuerza);
		
	}
    
    public void usarContra(Madera madera) {
    	
    	this.desgastar();
    	
    }
	public void usarContra(Piedra piedra) {
		
	}
	public void usarContra(Metal metal) {
		
	}
	public void usarContra(Diamante diamante) {
		
	}
}
