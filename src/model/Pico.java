package model;

public class Pico extends Herramienta {


    public Pico(Material material){

        this.material = material;
    }
    
    protected void desgastar() {
		
		this.durabilidad -= this.tipoDesgaste.calcularDesgaste(this.fuerza);
		
	}
    
    public void usarContra(Madera madera) {
    	
    }
	public void usarContra(Piedra piedra) {
		
	}
	public void usarContra(Metal metal) {
		
	}
	public void usarContra(Diamante diamante) {
		
	}
}
