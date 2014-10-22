package es.upm.miw.pd.doo.polymorphism.vehiculos.models;



public class MainGestorAlquilerApp {
    private GestorVehiculos gestorVehiculos;
    
    public MainGestorAlquilerApp() {
        GestorAlquiler gestorAlquilar = GestorAlquiler.getGestorAlquiler();
        gestorVehiculos = GestorVehiculos.getGestorVehiculos();
        gestorVehiculos.
        
        this.gestor = new GestorComandos();
        this.gestor.add(new ComandoSumar(calc));
        this.gestor.add(new ComandoRestar(calc));
        this.gestor.add(new ComandoIniciar(calc));
        this.gestor.add(new ComandoImprimir(calc));
        this.gestor.add(new ComandoMultiplicar(calc));
        
    }
    public void alquilar(int idVehiculo) {
        // TODO Auto-generated method stub
        
    }

}
