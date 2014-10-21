package es.upm.miw.pd.doo.polymorphism.vehiculos.models;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;


public class GestorVehiculosTest {
    private GestorVehiculos gestorVehiculos;
    private Vehiculo coche;
    private static final String DESCRIPCION = "Ford Escort 2.0 16v";
    private static final int ID = 1;
    
    @Before
    public void ini() {
        gestorVehiculos = GestorVehiculos.getGestorVehiculos();
        new Coche(ID,DESCRIPCION);
    }

    @Test
    public void testGestorVehiculosIsSingleton() {
        assertSame(gestorVehiculos, GestorVehiculos.getGestorVehiculos());
    }

    @Test
    public void testGestorVehiculosSingletonNotNull() {
        assertNotNull(GestorVehiculos.getGestorVehiculos());
    }
    @Test
    public void testInsertar() {
        assertEquals(null, gestorVehiculos.buscar(coche));
        gestorVehiculos.insertar(coche);
        assertEquals(gestorVehiculos.buscar(coche), coche);
    }
    @Test
    public void testBuscar() {
        gestorVehiculos.insertar(coche);
        assertEquals(gestorVehiculos.buscar(coche), coche);
    }
    @Test
    public void testActualizar() {
        String nuevaDescripcion = coche.getDescripcion()+ "110 CV";
        coche.setDescripcion(nuevaDescripcion);    
        gestorVehiculos.actualizar(coche);
        assertEquals(gestorVehiculos.buscar(coche).getDescripcion(), nuevaDescripcion);
        assertEquals(gestorVehiculos.buscar(coche).getId(), coche.getId());
        assertEquals(gestorVehiculos.buscar(coche), coche);
    }
    @Test
    public void testEliminar() {
        gestorVehiculos.eliminar(coche);
        assertEquals(gestorVehiculos.buscar(coche), null);
    }
}
