package tarea2_2;

public class Vuelo {
    private String numeroVuelo;
    private Aeropuerto origen;
    private Aeropuerto destino;

    public Vuelo(String numeroVuelo, Aeropuerto origen, Aeropuerto destino) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
    }

    public void mostrarDetalle() {
        System.out.println("Vuelo " + numeroVuelo + " | De: " + origen + " -> A: " + destino);
    }
}