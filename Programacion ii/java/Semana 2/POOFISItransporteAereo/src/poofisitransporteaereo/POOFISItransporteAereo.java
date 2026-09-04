package poofisitransporteaereo;

import misClases.Aeropuerto;
import misClases.Vuelo;

public class POOFISItransporteAereo {

    public static void main(String[] args) {
        // Creación de objetos Aeropuerto
        Aeropuerto origen = new Aeropuerto("Jorge Chávez", "Lima", "LIM");
        Aeropuerto destino = new Aeropuerto("Alejandro Velasco Astete", "Cusco", "CUZ");

        // Creación del vuelo asociando los aeropuertos
        Vuelo vuelo1 = new Vuelo("LA-2024", origen, destino);

        // Mostrar detalles
        vuelo1.mostrarInformacion();
    }
}