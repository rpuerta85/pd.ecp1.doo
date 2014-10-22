package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

public abstract class OrdenAbs implements Orden {
    private String nombre;
    protected MainGestorAlquilerApp receptor;
    
    
    public OrdenAbs (String nombre,MainGestorAlquilerApp receptor) {
        this.nombre = nombre;
        this.receptor = receptor;
    }

    public abstract void ejecutar();
    
    public String name() {
        return nombre;
    }
}
