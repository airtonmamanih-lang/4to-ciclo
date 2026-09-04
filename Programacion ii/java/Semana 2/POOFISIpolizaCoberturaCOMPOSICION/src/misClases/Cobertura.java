package misClases;

public class Cobertura {
    private String tipo;
    private double montoMaximo;

    // Constructor por defecto
    public Cobertura() {
        this.tipo = "Básica";
        this.montoMaximo = 10000.0;
    }

    // Constructor con parámetros
    public Cobertura(String tipo, double montoMaximo) {
        this.tipo = tipo;
        this.montoMaximo = montoMaximo;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(double montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    @Override
    public String toString() {
        return "Cobertura [Tipo: " + tipo + ", Monto Máximo: S/ " + montoMaximo + "]";
    }
}