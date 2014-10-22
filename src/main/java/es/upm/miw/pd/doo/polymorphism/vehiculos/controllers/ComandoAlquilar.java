package es.upm.miw.pd.doo.polymorphism.vehiculos.controllers;

import es.upm.miw.pd.doo.polymorphism.vehiculos.models.GestorVehiculos;
import es.upm.miw.pd.doo.polymorphism.vehiculos.models.OrdenAbs;
import es.upm.miw.pd.doo.polymorphism.vehiculos.models.Vehiculo;
import upm.jbb.IO;


public class ComandoAlquilar extends OrdenAbs {

    private static final String NOMBRE="Alquilar";
    
       
    public ComandoAlquilar(GestionAlquilerApp receptor) {
        super(NOMBRE,receptor);
    }
    
    public void ejecutar() {
        int idVehiculo = IO.in.readInt("Introduzca ID del vehiculo a alquilar: ");
        int numDias = IO.in.readInt("Introduzca el número de dias de alquiler: ");
        Vehiculo vehiculo = GestorVehiculos.getGestorVehiculos().buscar(idVehiculo);
        float  precioAlquiler = vehiculo.calcularPrecio(numDias); 
        receptor.alquilar(precioAlquiler);
        
    }

   

}
