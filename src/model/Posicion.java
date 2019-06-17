package model;

public class Posicion {
	
	int x;
	int y;
	
	public Posicion(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}

	public boolean equals(Posicion unaPosicion) {
		
		int posX = unaPosicion.getX();
		int posY = unaPosicion.getY();
		
		return ((this.x == posX)&&(this.y == posY));
		
	}
	
	public Posicion obtenerPosicionArriba() {
		
		int posX = this.getX();
		int posY = this.getY() + 1;
		
		Posicion posicionNueva = new Posicion(posX,posY);
		return posicionNueva;
		
	}
	
	public Posicion obtenerPosicionAbajo() {
		
		int posX = this.getX();
		int posY = this.getY() - 1;
		
		Posicion posicionNueva = new Posicion(posX,posY);
		return posicionNueva;
		
	}
	
	public Posicion obtenerPosicionIzquierda() {
		
		int posX = this.getX() - 1;
		int posY = this.getY();
		
		Posicion posicionNueva = new Posicion(posX,posY);
		return posicionNueva;
		
	}

	public Posicion obtenerPosicionDerecha() {
		
		int posX = this.getX() + 1;
		int posY = this.getY();
		
		Posicion posicionNueva = new Posicion(posX,posY);
		return posicionNueva;
		
	}
	
	
}
