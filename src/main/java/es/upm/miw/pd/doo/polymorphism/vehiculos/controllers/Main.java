package es.upm.miw.pd.doo.polymorphism.vehiculos.controllers;

import es.upm.miw.pd.doo.polymorphism.vehiculos.models.CategoriaA;
import es.upm.miw.pd.doo.polymorphism.vehiculos.models.CategoriaB;
import es.upm.miw.pd.doo.polymorphism.vehiculos.models.CategoriaC;
import es.upm.miw.pd.doo.polymorphism.vehiculos.models.Coche;
import es.upm.miw.pd.doo.polymorphism.vehiculos.models.GestorAlquiler;
import es.upm.miw.pd.doo.polymorphism.vehiculos.models.GestorVehiculos;
import upm.jbb.IO;

public class Main {
    private GestorVehiculos gestorVehiculos = GestorVehiculos.getGestorVehiculos();
    private GestorAlquiler gestorAlquilar = GestorAlquiler.getGestorAlquiler();
    private GestionAlquilerApp gestionAlquilerApp;

    
    public Main() {
        GestionAlquilerApp gestionAlquilerApp = new GestionAlquilerApp();
        gestorVehiculos.insertar(new Coche(1, "Ford Fiesta", new CategoriaB()));
        gestorVehiculos.insertar(new Coche(2, "Mercedes", new CategoriaA()));
        gestorVehiculos.insertar(new Coche(3, "Dacia Logan", new CategoriaC()));
        
        gestorAlquilar.insertar(new ComandoAlquilar(gestionAlquilerApp));
        
        
    }
    public void ejecutar() {
        String key = (String) IO.in.select(this.gestorAlquilar.keys());
        this.gestorAlquilar.ejecutar(key);
        
        
    }

    public static void main(String[] args) {
        IO.in.addController(new Main());
    }


}
