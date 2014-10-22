package es.upm.miw.pd.doo.polymorphism.vehiculos.models;


import java.util.HashMap;
import java.util.Map;

public class GestorAlquiler {
    private static  GestorAlquiler gestorAlquiler = null;
    private Map<String,Orden> ordenes = new HashMap<String,Orden>();
    
    private GestorAlquiler() {
        
    }
    
    public static GestorAlquiler getGestorAlquiler(){
        if (gestorAlquiler == null) {
            gestorAlquiler = new GestorAlquiler();
        }
    return gestorAlquiler;
    }

    public void ejecutar(String key) {
        this.ordenes.get(key).ejecutar();
    }

    public String[] keys() {
        return this.ordenes.keySet().toArray(new String[0]);
    }
    
    public void insertar(Orden orden) {
           ordenes.put(orden.name(), orden);
    }
    


   

}
