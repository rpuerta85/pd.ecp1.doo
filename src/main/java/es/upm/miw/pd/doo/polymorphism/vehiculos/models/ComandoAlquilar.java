package es.upm.miw.pd.doo.polymorphism.vehiculos.models;

public class ComandoAlquilar extends OrdenAbs {

    private static final String NOMBRE="Alquilar";
    
    public ComandoAlquilar(MainGestorAlquilerApp receptor) {
        super(NOMBRE,receptor);
    }
    
    public void ejecutar() {
        aplicacion.alquilar();
    }

   

}
