package model;

public class MaterialNulo extends Material {

    public MaterialNulo(){

        durabilidad = 0;
        ID = 0;
    }

    @Override
    protected Material daniarMetal(Metal metal, int fuerza) {
    	MaterialNulo material = new MaterialNulo();
		return  material;
    }
}
