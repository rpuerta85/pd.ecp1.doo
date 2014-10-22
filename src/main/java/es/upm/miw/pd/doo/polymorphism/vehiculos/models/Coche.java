package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

public class Coche extends Vehiculo {
    
    private Categoria categoria;
    
    public Coche(int id, String descripcion,Categoria categoria) {
      super(id,descripcion);
      this.categoria = categoria;
    }

    public float calcularPrecio(int numDias) {
        float precioFinal = 0;
        
            
            for (int i = 1; i <= numDias; i++) {
                if(i >= 1 && i <= 3) {
                    precioFinal += categoria.precio;
                }else if (i >= 4 && i <= 7) {
                    precioFinal += (categoria.precio * 0.80 );
                } else  {
                    precioFinal += (categoria.precio * 0.5);
                }
            }
       
    return precioFinal;
    }

}
