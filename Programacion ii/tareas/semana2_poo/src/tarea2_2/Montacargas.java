package tarea2_2;

public class Montacargas {
    private String marca;
    private double capacidadToneladas;

    public Montacargas(String marca, double capacidadToneladas) {
        this.marca = marca;
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public String toString() {
        return "Montacargas " + marca + " [" + capacidadToneladas + " Tn]";
    }
}