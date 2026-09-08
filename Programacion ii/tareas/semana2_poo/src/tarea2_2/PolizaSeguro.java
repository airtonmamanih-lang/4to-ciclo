package tarea2_2;

public class PolizaSeguro {
    private String numeroPoliza;
    private Cobertura cobertura; // Composición (creada internamente)

    public PolizaSeguro(String numeroPoliza, String tipoCobertura, double monto) {
        this.numeroPoliza = numeroPoliza;
        // La composición se aplica instanciando la Cobertura dentro de la Póliza
        this.cobertura = new Cobertura(tipoCobertura, monto);
    }

    public void mostrarPoliza() {
        System.out.println("Póliza N°: " + numeroPoliza + " | " + cobertura);
    }
}