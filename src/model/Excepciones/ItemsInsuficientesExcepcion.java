package model.Excepciones;

public class ItemsInsuficientesExcepcion extends RuntimeException {
	
	public String string() {
		
		return "No tienes suficientes items.";
		
	}

}
