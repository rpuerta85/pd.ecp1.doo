package es.upm.miw.pd.doo.polymorphism.vehiculos.models;


import java.util.HashMap;
import java.util.Map;

public class GestorAlquiler {
    private static  GestorAlquiler gestorVehiculos = null;
    private Map<String,Orden> vehiculos = new HashMap<String,Orden>();
    
    private GestorAlquiler() {
        
    }
    
    public static GestorAlquiler getGestorAlquiler(){
        if (gestorVehiculos == null) {
            gestorVehiculos = new GestorAlquiler();
        }
    return gestorVehiculos;
    }

    public void ejecutar(String key) {
        this.vehiculos.get(key).ejecutar();
    }

    public String[] keys() {
        return this.vehiculos.keySet().toArray(new String[0]);
    }
    
    public void insertar(Orden orden) {
           vehiculos.put(orden.name(), orden);
    }
    
/*
    public AlquilerVehiculo buscar(AlquilerVehiculo vehiculo) {
        return vehiculos.get(vehiculo.getId());
    }

    public void actualizar(AlquilerVehiculo vehiculo) {
        vehiculos.put(vehiculo.getId(),vehiculo);
    }

    public void eliminar(AlquilerVehiculo vehiculo) {
        vehiculos.remove(vehiculo.getId());
        
    }*/

   

}
