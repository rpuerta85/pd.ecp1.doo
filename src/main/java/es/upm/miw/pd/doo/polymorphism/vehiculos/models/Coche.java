package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

public class Coche extends Vehiculo {
    
    private Categoria categoria;
    
    public Coche(int id, String descripcion,Categoria categoria) {
      super(id,descripcion);
      this.categoria = categoria;
    }

 

}
