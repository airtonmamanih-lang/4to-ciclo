package misClases;

public class Montacargas {
    private String marca;
    private double capacidadCargaKg;

    // Constructor por defecto
    public Montacargas() {
        this.marca = "Caterpillar";
        this.capacidadCargaKg = 2500.0;
    }

    // Constructor parametrizado
    public Montacargas(String marca, double capacidadCargaKg) {
        this.marca = marca;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) {
        this.capacidadCargaKg = capacidadCargaKg;
    }

    @Override
    public String toString() {
        return "Montacargas [Marca: " + marca + ", Capacidad: " + capacidadCargaKg + " kg]";
    }
}