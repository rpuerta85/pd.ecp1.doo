package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

import es.upm.miw.pd.doo.polymorphism.vehiculos.controllers.GestionAlquilerApp;

public abstract class OrdenAbs implements Orden {
    private String nombre;
    protected GestionAlquilerApp receptor;
    
    
    public OrdenAbs (String nombre,GestionAlquilerApp receptor) {
        this.nombre = nombre;
        this.receptor = receptor;
    }

    public abstract void ejecutar();
    
    public String name() {
        return nombre;
    }
}
