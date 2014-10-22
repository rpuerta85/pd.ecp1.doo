package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



public class VehiculoTest {
    private Vehiculo cocheB,cocheA,cocheC,motoA,motoB,biciA,biciB;
    private static final String DESCRIPCION = "Ford Escort 2.0 16v";
    private static final int ID = 1;
    private static final int NUMDIAS = 5;
    @Before
    public void ini() {
        cocheB = new Coche(ID,DESCRIPCION, new CategoriaB());
        cocheA = new Coche(ID,DESCRIPCION, new CategoriaA());
        cocheC = new Coche(ID,DESCRIPCION, new CategoriaC());
        motoA  = new Moto(ID, "MotoA");
        motoB  = new Moto(ID, "MotoB");
        biciA = new Bicicleta(ID, "biciA");
        biciB = new Bicicleta(ID, "biciB");
    }

    @Test
    public void testVehiculo() {
        assertEquals(cocheB.getId(),ID,0.0001);
        assertEquals(cocheB.getDescripcion(),DESCRIPCION); 
    }
    @Test
    public void testCalcularPrecioCoche() {
      
        assertEquals(cocheB.calcularPrecio(NUMDIAS),69,0.00001);
        assertEquals(cocheA.calcularPrecio(NUMDIAS),92,0.00001);
        assertEquals(cocheC.calcularPrecio(NUMDIAS),46,0.00001);

    }
  
    @Test
    public void testCalcularPrecioMoto() {
      
        assertEquals(motoA.calcularPrecio(NUMDIAS),40,0.00001);
        assertEquals(motoB.calcularPrecio(8),63,0.00001);

    }

    @Test
    public void testCalcularPrecioBicicleta() {
      
        assertEquals(biciB.calcularPrecio(NUMDIAS),13,0.00001);
        assertEquals(biciA.calcularPrecio(8),19,0.00001);


    }
    
}
