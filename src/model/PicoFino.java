package model;

public class PicoFino extends Herramienta {

	public PicoFino(float durabilidad, int fuerza, Desgaste tipoDesgaste) {
		
		super(durabilidad,fuerza,tipoDesgaste);
		
	}
	
	public Material usarContra(Madera madera) {
		return new MaterialNulo();
	}
	
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

	@Override
	public Material usarContra(Material material) {
		if (material.getID() == 1) {
			return this.usarContra((Madera) material);
		}
		
		else if (material.getID() == 2) {
			return this.usarContra((Piedra) material);
		}
		
		else if (material.getID() == 3) {
			return this.usarContra((Metal) material);
		}
		
		else if (material.getID() == 4) {
			return this.usarContra((Diamante) material);
		}
		
		else {
			return new MaterialNulo();
		}
	}
}
