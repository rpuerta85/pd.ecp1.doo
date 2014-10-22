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
        coche = new Coche(ID,DESCRIPCION, new CategoriaA());
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
        gestorVehiculos.eliminar(coche);
        assertEquals(null, gestorVehiculos.buscar(coche.getId()));
        gestorVehiculos.insertar(coche);
        assertEquals(gestorVehiculos.buscar(coche.getId()).getId(), coche.getId());
    }
    @Test
    public void testBuscar() {
        gestorVehiculos.insertar(coche);
        assertEquals(gestorVehiculos.buscar(coche.getId()).getId(), coche.getId());
    }
    @Test
    public void testActualizar() {
        String nuevaDescripcion = coche.descripcion+ "110 CV";
        coche.setDescripcion(nuevaDescripcion);    
        gestorVehiculos.actualizar(coche);
        assertEquals(gestorVehiculos.buscar(coche.getId()).getDescripcion(), nuevaDescripcion);
        assertEquals(gestorVehiculos.buscar(coche.getId()).getId(), coche.getId());
        assertEquals(gestorVehiculos.buscar(coche.getId()).getId(), coche.getId());
    }
    @Test
    public void testEliminar() {
        gestorVehiculos.eliminar(coche);
        assertEquals(gestorVehiculos.buscar(coche.getId()), null);
    }
}
