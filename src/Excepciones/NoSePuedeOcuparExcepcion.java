package Excepciones;

public class NoSePuedeOcuparExcepcion extends Exception {
	
	public String string() {
		
		return "Esta intentando acceder a una posición inaccesible";
		
	}

}
