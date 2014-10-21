package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



public class VehiculoTest {
    private Vehiculo vehiculo;
    private static final String DESCRIPCION = "Ford Escort 2.0 16v";
    private static final int ID = 1;
    @Before
    public void ini() {
        vehiculo = new Vehiculo(ID,DESCRIPCION);
    }

    @Test
    public void testVehiculo() {
        assertEquals(vehiculo.getId(),ID,0.0001);
        assertEquals(vehiculo.getDescripcion(),DESCRIPCION); 
    }
}
