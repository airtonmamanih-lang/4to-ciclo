package misClases;

public class PolizaSeguro {
    private String numeroPoliza;
    private String titular;
    private Cobertura cobertura; // Relación de Composición/Agregación

    // Constructor
    public PolizaSeguro(String numeroPoliza, String titular, String tipoCobertura, double montoMaximo) {
        this.numeroPoliza = numeroPoliza;
        this.titular = titular;
        // Instanciación del objeto Cobertura (Composición)
        this.cobertura = new Cobertura(tipoCobertura, montoMaximo);
    }

    // Getters y Setters
    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Cobertura getCobertura() {
        return cobertura;
    }

    public void setCobertura(Cobertura cobertura) {
        this.cobertura = cobertura;
    }

    public void mostrarDetalles() {
        System.out.println("--- DETALLES DE LA PÓLIZA ---");
        System.out.println("Número de Póliza: " + numeroPoliza);
        System.out.println("Titular: " + titular);
        System.out.println("Detalle de " + cobertura.toString());
    }
}