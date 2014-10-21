package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



public class VehiculoTest {
    private Vehiculo coche;
    private static final String DESCRIPCION = "Ford Escort 2.0 16v";
    private static final int ID = 1;
    @Before
    public void ini() {
        coche = new Coche(ID,DESCRIPCION);
    }

    @Test
    public void testVehiculo() {
        assertEquals(coche.getId(),ID,0.0001);
        assertEquals(coche.getDescripcion(),DESCRIPCION); 
    }
}
