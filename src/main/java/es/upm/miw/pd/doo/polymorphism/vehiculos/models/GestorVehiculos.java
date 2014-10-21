package es.upm.miw.pd.doo.polymorphism.vehiculos.models;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorVehiculos {
    private static  GestorVehiculos gestorVehiculos = null;
    private Map<Integer,Vehiculo> vehiculos = new HashMap<Integer,Vehiculo>();
    
    private GestorVehiculos() {
        
    }
    
    public static GestorVehiculos getGestorVehiculos(){
        if(gestorVehiculos == null) {
            gestorVehiculos = new GestorVehiculos();
        }
    return gestorVehiculos;
    }

    public void insertar(Vehiculo coche) {
           vehiculos.put(coche.getId(), coche);
    }
    

    public Vehiculo buscar(Vehiculo coche) {
        return vehiculos.get(coche.getId());
    }

    public void actualizar(Vehiculo coche) {
        vehiculos.put(coche.getId(), coche);
    }

    public void eliminar(Vehiculo coche) {
        vehiculos.remove(coche.getId());
        
    }

   

}
