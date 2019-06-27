package model;

public class GeneradorDeMapa {
	public Casillero[][] generarMapa() {
		Casillero[][] casilleros = new Casillero[16][22];
		for (int i = 0; i< 16; i++)
		for (int j = 0; j < 22; j++) {
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
			casilleros[3][17].ocupar(metal6);
			
			Metal metal7 = new Metal();
			casilleros[3][19].ocupar(metal7);
			
			Metal metal8 = new Metal();
			casilleros[4][18].ocupar(metal8);
			
			Metal metal9 = new Metal();
			casilleros[10][15].ocupar(metal9);
			
			Metal metal10 = new Metal();
			casilleros[14][13].ocupar(metal10);			
			
			Diamante diamante = new Diamante();
			casilleros[5][2].ocupar(diamante);
			
			Diamante diamante1 = new Diamante();
			casilleros[7][10].ocupar(diamante1);
			
			Diamante diamante2 = new Diamante();
			casilleros[1][14].ocupar(diamante2);
			
			Diamante diamante3 = new Diamante();
			casilleros[2][8].ocupar(diamante3);
			
			Madera madera7 = new Madera();
			casilleros[10][18].ocupar(madera7);
			
			Madera madera20 = new Madera();
			casilleros[11][20].ocupar(madera20);
			
			Madera madera21 = new Madera();
			casilleros[13][21].ocupar(madera21);
			
			Madera madera22 = new Madera();
			casilleros[14][20].ocupar(madera22);
			
			Madera madera23 = new Madera();
			casilleros[15][18].ocupar(madera23);
			
			Madera madera24 = new Madera();
			casilleros[15][20].ocupar(madera24);
			
			Madera madera25 = new Madera();
			casilleros[10][0].ocupar(madera25);
			Madera madera26 = new Madera();
			casilleros[12][0].ocupar(madera26);
			Madera madera27 = new Madera();
			casilleros[13][0].ocupar(madera27);
			Madera madera28 = new Madera();
			casilleros[14][0].ocupar(madera28);
			Madera madera29 = new Madera();
			casilleros[10][2].ocupar(madera29);

			Madera madera30 = new Madera();
			casilleros[10][1].ocupar(madera30);
			Madera madera31 = new Madera();
			casilleros[14][2].ocupar(madera31);
			Madera madera32 = new Madera();
			casilleros[15][3].ocupar(madera32);
			Madera madera33 = new Madera();
			casilleros[12][4].ocupar(madera33);
			Madera madera34 = new Madera();
			casilleros[11][5].ocupar(madera34);
			Madera madera35 = new Madera();
			casilleros[10][6].ocupar(madera35);
			

			Madera madera36 = new Madera();
			casilleros[10][9].ocupar(madera36);
			Madera madera37 = new Madera();
			casilleros[14][7].ocupar(madera37);
			Madera madera38 = new Madera();
			casilleros[15][15].ocupar(madera38);
			Madera madera39 = new Madera();
			casilleros[12][14].ocupar(madera39);
			Madera madera40 = new Madera();
			casilleros[11][10].ocupar(madera40);
			Madera madera41 = new Madera();
			casilleros[10][17].ocupar(madera41);

			Madera madera42 = new Madera();
			casilleros[15][5].ocupar(madera42);
			Madera madera43 = new Madera();
			casilleros[10][8].ocupar(madera43);
			Madera madera44 = new Madera();
			casilleros[10][9].ocupar(madera44);
			Madera madera45 = new Madera();
			casilleros[10][13].ocupar(madera45);

			Metal metal11 = new Metal();
			casilleros[10][17].ocupar(metal11);		
			Metal metal12 = new Metal();
			casilleros[13][10].ocupar(metal12);		
			Metal metal13 = new Metal();
			casilleros[12][14].ocupar(metal13);		
			Metal metal14 = new Metal();
			casilleros[12][18].ocupar(metal14);		
			Metal metal15 = new Metal();
			casilleros[9][21].ocupar(metal15);		
			}
		catch (Exception e) {
			
		}
		return casilleros;
	}
}
