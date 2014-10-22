package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

public class Bicicleta extends Vehiculo {
 private static final int PRECIO_3PRIMEROS_DIAS =  3;   
 private static final int PRECIO_RESTO_DIAS =  2;
    public Bicicleta(int id, String descripcion) {
      super(id,descripcion);
    }

    public float calcularPrecio(int numDias) {
        float precioFinal = 0;
        
            for (int i = 1; i <= numDias; i++) {
                if(i >= 1 && i <= 3) {
                    precioFinal += PRECIO_3PRIMEROS_DIAS;
                }
                 else  {
                    precioFinal += PRECIO_RESTO_DIAS;
                }
            }
       
    return precioFinal;
    }

}
