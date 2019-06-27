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

		try{
			herramienta = mesaDeCrafteo.construirHerramienta();
		}
		catch (CodigoDeHerramientaInvalidoError excepcion){
			throw new CodigoDeHerramientaInvalidoError();
		}

		inventario.agregarAlInventario(herramienta);
		mesaDeCrafteo.disminuirCantidadEnTodasLasPosiciones();
	}

	public void agregarAlInventario(AgregableAlInventario objeto){

		inventario.agregarAlInventario(objeto);
	}

	public Inventario obtenerInventario(){ return inventario; }
	public MesaDeCrafteo obtenerMesaDeCrafteo(){ return mesaDeCrafteo; }
	
}
