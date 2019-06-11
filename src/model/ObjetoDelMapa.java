package model;

public class ObjetoDelMapa {
	Material contenido;
	public ObjetoDelMapa() {
		this.contenido = null;
	}
	public void ocupar(Material a_contener) {
		this.contenido = a_contener;
	}
	public Material getContenido() {
		return contenido;
	}
}
