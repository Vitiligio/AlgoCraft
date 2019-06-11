package model;

public class GeneradorDeMapa {
	public Casillero[][] generarMapa() {
		Casillero[][] casilleros = new Casillero[8][8];
		for (int i = 0; i< 8; i++)
		for (int j = 0; j < 8; j++) {
			casilleros[i][j] = new Casillero();
		}
		Madera madera = new Madera();
		casilleros[0][8].ocupar(madera);
		Piedra piedra = new Piedra();
		casilleros[1][8].ocupar(piedra);
		Metal metal = new Metal();
		casilleros[2][8].ocupar(metal);
		Diamante diamante = new Diamante();
		casilleros[3][8].ocupar(diamante);
		return casilleros;
	}
}