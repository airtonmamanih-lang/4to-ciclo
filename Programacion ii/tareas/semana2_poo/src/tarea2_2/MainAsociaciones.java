package tarea2_2;

public class MainAsociaciones {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE TAREA 2.2: RELACIONES DE ASOCIACIÓN ===");

        // 1. Asociación Simple (Vuelo - Aeropuerto)
        System.out.println("\n1. Asociación Simple:");
        Aeropuerto orig = new Aeropuerto("Jorge Chávez", "Lima");
        Aeropuerto dest = new Aeropuerto("Alejandro Velasco Astete", "Cusco");
        Vuelo vuelo = new Vuelo("LA-2024", orig, dest);
        vuelo.mostrarDetalle();

        // 2. Agregación (Almacén - Montacargas)
        System.out.println("\n2. Agregación:");
        Montacargas m1 = new Montacargas("Caterpillar", 3.5);
        Almacen almacen = new Almacen("Almacén Central Lima");
        almacen.asignarMontacargas(m1);
        almacen.mostrarEstado();

        // 3. Composición (Póliza - Cobertura)
        System.out.println("\n3. Composición:");
        PolizaSeguro poliza = new PolizaSeguro("POL-99823", "Todo Riesgo Vehicular", 50000.0);
        poliza.mostrarPoliza();
    }
}