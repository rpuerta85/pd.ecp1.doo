package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

public class GestorVehiculos {
    private static  GestorVehiculos singleton = null;
    
    private GestorVehiculos() {
        
    }
    
    public static GestorVehiculos getGestorVehiculos(){
        if(singleton == null) {
            singleton = new GestorVehiculos();
        }
    return singleton;
    }



}
