package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

import java.util.HashMap;
import java.util.Map;

public class GestorVehiculos {
    private static  GestorVehiculos gestorVehiculos = null;
    private Map<Integer,Vehiculo> vehiculos = new HashMap<Integer,Vehiculo>();
    
    private GestorVehiculos() {
        
    }
    
    public static GestorVehiculos getGestorVehiculos(){
        if (gestorVehiculos == null) {
            gestorVehiculos = new GestorVehiculos();
        }
    return gestorVehiculos;
    }

      public void insertar(Vehiculo vehiculo) {
           vehiculos.put(new Integer(vehiculo.getId()), vehiculo);
    }
    

    public Vehiculo buscar(int idVehiculo) {
        return vehiculos.get(idVehiculo);
    }

    public void actualizar(Vehiculo vehiculo) {
        vehiculos.put(vehiculo.getId(),vehiculo);
    }

    public void eliminar(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo.getId());
        
    }

    public Map<Integer, Vehiculo> getVehiculos() {
        return vehiculos;
    }
    
}
