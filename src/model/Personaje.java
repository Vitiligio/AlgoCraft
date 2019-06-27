package model;


import model.Excepciones.CodigoDeHerramientaInvalidoError;
import model.Excepciones.ItemsInsuficientesExcepcion;

public class Personaje extends ObjetoDelMapa{

	private Inventario inventario;
	private MesaDeCrafteo mesaDeCrafteo;

	public Personaje() {

		inventario = new Inventario();
		mesaDeCrafteo = new MesaDeCrafteo();
		this.ID = 0;

	}

	public Herramienta getObjetoEquipado() {

		return this.inventario.getObjetoEquipado();

	}

	public void insertarMaterialEnMesaDeCrafteoEnPosicion(Material material, int fila, int columna) {

		inventario.sacarDelInventario(material);
		mesaDeCrafteo.insertarMaterialEnPosicion(material, fila, columna);
	}

	public void construirHerramienta() {

		Herramienta herramienta;

		herramienta = mesaDeCrafteo.construirHerramienta();

		inventario.agregarAlInventario(herramienta);
		mesaDeCrafteo.disminuirCantidadEnTodasLasPosiciones();
	}
	
	public void reiniciarMesa() {
		mesaDeCrafteo = new MesaDeCrafteo();
	}

	public void agregarAlInventario(AgregableAlInventario objeto){

		inventario.agregarAlInventario(objeto);
	}
	
	public void usarHerramientaEquipada(Material material) {
		
		//Material picado = this.inventario.getObjetoEquipado().usarContra(material);
		//this.agregarAlInventario(picado);
		this.agregarAlInventario(this.inventario.getObjetoEquipado().usarContra(material));

	}

	public Inventario obtenerInventario(){ return inventario; }
	public MesaDeCrafteo obtenerMesaDeCrafteo(){ return mesaDeCrafteo; }
	
}
