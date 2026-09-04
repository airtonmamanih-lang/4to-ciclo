package poofisipolizacoberturacomposicion;

import misClases.PolizaSeguro;

public class POOFISIpolizaCoberturaCOMPOSICION {

    public static void main(String[] args) {
        // Creación de una póliza con su cobertura asociada
        PolizaSeguro poliza1 = new PolizaSeguro("POL-2024-001", "Juan Pérez", "Todo Riesgo", 50000.0);
        
        // Mostrar la información en consola
        poliza1.mostrarDetalles();
    }
}