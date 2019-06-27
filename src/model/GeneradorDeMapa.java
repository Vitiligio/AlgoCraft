package model;

public class GeneradorDeMapa {
	public Casillero[][] generarMapa() {
		Casillero[][] casilleros = new Casillero[9][16];
		for (int i = 0; i< 9; i++)
		for (int j = 0; j < 16; j++) {
			casilleros[i][j] = new Casillero();
		}
		try {
			Madera madera = new Madera();
			casilleros[1][0].ocupar(madera);
			
			Madera madera0 = new Madera();
			casilleros[2][1].ocupar(madera0);
			
			Madera madera1 = new Madera();
			casilleros[3][0].ocupar(madera1);
			
			Madera madera2 = new Madera();
			casilleros[4][1].ocupar(madera2);
			
			Madera madera3 = new Madera();
			casilleros[5][0].ocupar(madera3);
			
			Madera madera4 = new Madera();
			casilleros[6][1].ocupar(madera4);
			
			Madera madera5 = new Madera();
			casilleros[6][3].ocupar(madera5);
			
			Madera madera6 = new Madera();
			casilleros[4][3].ocupar(madera6);
			
			Madera madera8 = new Madera();
			casilleros[0][2].ocupar(madera8);
			
			Madera madera9 = new Madera();
			casilleros[5][4].ocupar(madera9);
			
			Madera madera10 = new Madera();
			casilleros[7][2].ocupar(madera10);
			
			Madera madera11 = new Madera();
			casilleros[3][2].ocupar(madera11);
			
			Madera madera12 = new Madera();
			casilleros[0][8].ocupar(madera12);
			
			Madera madera13 = new Madera();
			casilleros[1][7].ocupar(madera13);
			
			Madera madera14 = new Madera();
			casilleros[1][9].ocupar(madera14);
			
			Madera madera15 = new Madera();
			casilleros[2][6].ocupar(madera15);
			
			Madera madera16 = new Madera();
			casilleros[3][10].ocupar(madera16);
			
			Madera madera17 = new Madera();
			casilleros[4][12].ocupar(madera17);
			
			Madera madera18 = new Madera();
			casilleros[6][12].ocupar(madera18);
			
			Madera madera19 = new Madera();
			casilleros[7][14].ocupar(madera19);
			
			
			
			
			Piedra piedra = new Piedra();
			casilleros[1][2].ocupar(piedra);
			
			Piedra piedra0 = new Piedra();
			casilleros[4][2].ocupar(piedra0);
			
			Piedra piedra1 = new Piedra();
			casilleros[5][3].ocupar(piedra1);
			
			Piedra piedra2 = new Piedra();
			casilleros[5][8].ocupar(piedra2);
			
			Piedra piedra3 = new Piedra();
			casilleros[6][7].ocupar(piedra3);
			
			
			
			Metal metal = new Metal();
			casilleros[0][15].ocupar(metal);
			
			Metal metal1 = new Metal();
			casilleros[1][12].ocupar(metal1);
			
			Metal metal2 = new Metal();
			casilleros[4][13].ocupar(metal2);
			
			Metal metal3 = new Metal();
			casilleros[6][9].ocupar(metal3);
			
			Metal metal4 = new Metal();
			casilleros[7][7].ocupar(metal4);
			
			Metal metal5 = new Metal();
			casilleros[8][8].ocupar(metal5);
			
			Metal metal6 = new Metal();
			casilleros[0][5].ocupar(metal6);
			
			
			
			Diamante diamante = new Diamante();
			casilleros[5][2].ocupar(diamante);
			
			Diamante diamante1 = new Diamante();
			casilleros[7][10].ocupar(diamante1);
			
			Diamante diamante2 = new Diamante();
			casilleros[1][14].ocupar(diamante2);
			
			Diamante diamante3 = new Diamante();
			casilleros[2][8].ocupar(diamante3);
		}
		catch (Exception e) {
			
		}
		return casilleros;
	}
}
