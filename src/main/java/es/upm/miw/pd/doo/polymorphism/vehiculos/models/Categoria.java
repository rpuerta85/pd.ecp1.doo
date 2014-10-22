package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

public abstract class Categoria {
    protected String nombre;
    protected float precio;
    
    

    public Categoria(String nombre,float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   
   /* protected float calcularPrecio(int numDias, Vehiculo vehiculo) {
        float precioFinal = 0;
        for (int i = 1; i <= numDias; i++) {
            if(i >= 1 && i <= 3) {
                precioFinal += precio;
            }else if (i >= 4 && i <= 7) {
                precioFinal += (precio * 0.80 );
            } else  {
                precioFinal += (precio * 0.5);
            }
        }
    return precioFinal;
    }*/
}
