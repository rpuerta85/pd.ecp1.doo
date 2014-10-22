package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

public class Moto extends Vehiculo {
 private static final int PRECIO_MENOR_1_SEMANA =  8;   
 private static final int PRECIO_MAYOR_1_SEMANA =  7;
    public Moto(int id, String descripcion) {
      super(id,descripcion);
    }

    public float calcularPrecio(int numDias) {
        float precioFinal = 0;
            
            for (int i = 1; i <= numDias; i++) {
                if(i >= 1 && i <= 7) {
                    precioFinal += PRECIO_MENOR_1_SEMANA;
                }
                 else  {
                    precioFinal += PRECIO_MAYOR_1_SEMANA;
                }
            }
       
    return precioFinal;
    }

}
