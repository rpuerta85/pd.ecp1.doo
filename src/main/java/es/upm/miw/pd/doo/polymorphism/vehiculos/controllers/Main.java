package es.upm.miw.pd.doo.polymorphism.vehiculos.controllers;

import es.upm.miw.pd.doo.polymorphism.vehiculos.models.Bicicleta;
import es.upm.miw.pd.doo.polymorphism.vehiculos.models.CategoriaA;
import es.upm.miw.pd.doo.polymorphism.vehiculos.models.CategoriaB;
import es.upm.miw.pd.doo.polymorphism.vehiculos.models.CategoriaC;
import es.upm.miw.pd.doo.polymorphism.vehiculos.models.Coche;
import es.upm.miw.pd.doo.polymorphism.vehiculos.models.GestorAlquiler;
import es.upm.miw.pd.doo.polymorphism.vehiculos.models.GestorVehiculos;
import es.upm.miw.pd.doo.polymorphism.vehiculos.models.Moto;
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
        gestorVehiculos.insertar(new Moto(4, "MotoA"));
        gestorVehiculos.insertar(new Moto(5, "MotoB"));
        gestorVehiculos.insertar(new Bicicleta(6, "biciA"));
        gestorVehiculos.insertar(new Bicicleta(7, "biciB"));
       
    
        
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
