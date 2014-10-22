package es.upm.miw.pd.doo.polymorphism.vehiculos.controllers;

import upm.jbb.IO;



public class GestionAlquilerApp {
   
    private float precio = 0;
    
    public GestionAlquilerApp() {
  
    }
    public void alquilar(float precioAlquiler) {
        IO.in.println("El precio del alquiler es: "+ precioAlquiler);
        
    }
    public void imprimir(String result) {
        IO.in.println("Coches disponibles: \n"+ result);
    }
   


}
