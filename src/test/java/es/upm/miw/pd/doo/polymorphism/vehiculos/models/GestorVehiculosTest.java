package es.upm.miw.pd.doo.polymorphism.vehiculos.models;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;


public class GestorVehiculosTest {
    private GestorVehiculos gestorVehiculos;
    
    private static final String DESCRIPCION = "Ford Escort 2.0 16v";
    private static final int ID = 1;
    @Before
    public void ini() {
        gestorVehiculos = GestorVehiculos.getGestorVehiculos();
    }

    @Test
    public void testGestorVehiculosIsSingleton() {
        assertSame(gestorVehiculos, GestorVehiculos.getGestorVehiculos());
    }

    @Test
    public void testGestorVehiculosSingletonNotNull() {
        assertNotNull(GestorVehiculos.getGestorVehiculos());
    }
}
