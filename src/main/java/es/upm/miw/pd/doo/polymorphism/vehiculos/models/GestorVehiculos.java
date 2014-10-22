package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

import java.util.HashMap;
import java.util.Map;

public class GestorVehiculos {
    private static  GestorVehiculos gestorVehiculos = null;
    private Map<String,Vehiculo> vehiculos = new HashMap<String,Vehiculo>();
    
    private GestorVehiculos() {
        
    }
    
    public static GestorVehiculos getGestorVehiculos(){
        if (gestorVehiculos == null) {
            gestorVehiculos = new GestorVehiculos();
        }
    return gestorVehiculos;
    }

      public void insertar(Orden orden) {
           vehiculos.put(orden.name(), orden);
    }
    

    public Vehiculo buscar(Vehiculo vehiculo) {
        return vehiculos.get(vehiculo.getId());
    }

    public void actualizar(Vehiculo vehiculo) {
        vehiculos.put(vehiculo.getId(),vehiculo);
    }

    public void eliminar(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo.getId());
        
    }
}
