package model;

public class Mapa {
	Casillero[] casilleros;
	public Mapa() {
		casilleros = new Casillero[64];
		for (int i = 0; i < 64; i++) {
			casilleros[i] = new Casillero;
		}
		Madera madera = new Madera;
		casilleros[8].ocupar(madera);
		Piedra piedra = new Piedra;
		casilleros[16].ocupar(piedra);
		Meta metal = new Metal;
		casilleros[24].ocupar(metal);
		Diamante diamante = new Diamante;
		casilleros[32].ocupar(diamante);
	}

}
