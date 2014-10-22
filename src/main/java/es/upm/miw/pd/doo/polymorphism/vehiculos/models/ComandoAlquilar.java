package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

import upm.jbb.IO;


public class ComandoAlquilar extends OrdenAbs {

    private static final String NOMBRE="Alquilar";
    
    public ComandoAlquilar(MainGestorAlquilerApp receptor) {
        super(NOMBRE,receptor);
    }
    
    public void ejecutar() {
        //String key = (String) IO.in.select(this.gestor.keys());
        int idVehiculo = IO.in.readInt("Introduzca ID del vehiculo a alquilar");
        receptor.alquilar(idVehiculo);
        receptor.alquilar();
    }

   

}
