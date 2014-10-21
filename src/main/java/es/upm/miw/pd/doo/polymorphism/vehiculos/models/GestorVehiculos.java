package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

import java.util.ArrayList;
import java.util.List;

public class GestorVehiculos {
    private static  GestorVehiculos singleton = null;
    private List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    
    private GestorVehiculos() {
        
    }
    
    public static GestorVehiculos getGestorVehiculos(){
        if(singleton == null) {
            singleton = new GestorVehiculos();
        }
    return singleton;
    }

    public void insertar(Vehiculo coche) {
        // TODO Auto-generated method stub
        
    }

    public Vehiculo buscar(Vehiculo coche) {
        // TODO Auto-generated method stub
        return null;
    }

    public Vehiculo actualizar(Vehiculo coche) {
        // TODO Auto-generated method stub
        return null;
    }

    public void eliminar(Vehiculo coche) {
        // TODO Auto-generated method stub
        
    }



}
