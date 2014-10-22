package es.upm.miw.pd.doo.polymorphism.vehiculos.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



import es.upm.miw.pd.doo.polymorphism.vehiculos.models.GestorVehiculos;
import es.upm.miw.pd.doo.polymorphism.vehiculos.models.OrdenAbs;
import es.upm.miw.pd.doo.polymorphism.vehiculos.models.Vehiculo;
import upm.jbb.IO;


public class ComandoImprimir extends OrdenAbs {

    private static final String NOMBRE="Imprimir";
    
       
    public ComandoImprimir(GestionAlquilerApp receptor) {
        super(NOMBRE,receptor);
    }
    
    public void ejecutar() {
        HashMap<Integer,Vehiculo> vehiculos = (HashMap<Integer, Vehiculo>) GestorVehiculos.getGestorVehiculos().getVehiculos();
        
        java.util.Iterator<Entry<Integer, Vehiculo>> iter = vehiculos.entrySet().iterator();
        Map.Entry<Integer, Vehiculo> e;
        String result = "";
        while (iter.hasNext()) {
        e = (Map.Entry)iter.next();
        
        //System.out.println("Clave: " + e.getKey() + " | Valor: " + e.getValue());
        result += "Id: " + e.getValue().getId() + 
                " | Descripción: " + e.getValue().getDescripcion()+"\n"; 
                
        }
        
        receptor.imprimir(result);
        
    }

   

}
