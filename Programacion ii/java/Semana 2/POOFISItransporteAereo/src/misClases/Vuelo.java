package misClases;

public class Vuelo {
    private String numeroVuelo;
    private Aeropuerto origen;
    private Aeropuerto destino;

    // Constructor
    public Vuelo(String numeroVuelo, Aeropuerto origen, Aeropuerto destino) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
    }

    // Getters y Setters
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public void setOrigen(Aeropuerto origen) {
        this.origen = origen;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public void setDestino(Aeropuerto destino) {
        this.destino = destino;
    }

    public void mostrarInformacion() {
        System.out.println("--- DETALLES DEL VUELO ---");
        System.out.println("Número de Vuelo: " + numeroVuelo);
        System.out.println("Origen: " + origen.toString());
        System.out.println("Destino: " + destino.toString());
    }
}