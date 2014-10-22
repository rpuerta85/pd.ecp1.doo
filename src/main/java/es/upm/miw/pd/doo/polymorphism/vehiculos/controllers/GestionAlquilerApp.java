package es.upm.miw.pd.doo.polymorphism.vehiculos.controllers;

import upm.jbb.IO;



public class GestionAlquilerApp {
    //private GestorVehiculos gestorVehiculos = GestorVehiculos.getGestorVehiculos();
    //private GestorAlquiler gestorAlquilar = GestorAlquiler.getGestorAlquiler();
    private float precio = 0;
    
    public GestionAlquilerApp() {
  
       /* gestorVehiculos.insertar(new Coche(1, "Ford Fiesta", new CategoriaB()));
        gestorVehiculos.insertar(new Coche(2, "Mercedes", new CategoriaA()));
        gestorVehiculos.insertar(new Coche(3, "Dacia Logan", new CategoriaC()));
        
        gestorAlquilar.insertar(new ComandoAlquilar(this));MAIN*/
        
        
    }
    public void alquilar(float precioAlquiler) {
        IO.in.println("El precio del alquiler es: "+ precioAlquiler);
        
    }
   


}
