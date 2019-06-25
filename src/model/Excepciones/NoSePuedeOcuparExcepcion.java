package model.Excepciones;

public class NoSePuedeOcuparExcepcion extends RuntimeException {
	
	public String string() {
		
		return "Esta intentando acceder a una posición inaccesible";
		
	}

}
