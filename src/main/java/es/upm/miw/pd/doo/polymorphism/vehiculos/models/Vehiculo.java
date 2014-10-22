package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

public abstract class Vehiculo {
    protected int id;
    protected String descripcion;
   
    public Vehiculo(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public abstract float calcularPrecio(int numDias);
}
