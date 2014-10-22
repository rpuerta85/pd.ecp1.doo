package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

public abstract class Categoria {
    protected String nombre;

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
