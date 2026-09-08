package tarea2_2;

public class Cobertura {
    private String tipo;
    private double montoMaximo;

    public Cobertura(String tipo, double montoMaximo) {
        this.tipo = tipo;
        this.montoMaximo = montoMaximo;
    }

    @Override
    public String toString() {
        return "Cobertura: " + tipo + " (Hasta S/ " + montoMaximo + ")";
    }
}