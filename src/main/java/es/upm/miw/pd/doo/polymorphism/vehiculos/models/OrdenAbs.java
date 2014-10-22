package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

public abstract class OrdenAbs implements Orden {
    private String nombre;
    
    public OrdenAbs (String nombre) {
        this.nombre=nombre;
    }

    public abstract void ejecutar();
    
    public String name() {
        return nombre;
    }
}
