package poofisialmacenmontacargas;

import misClases.Almacen;
import misClases.Montacargas;

public class POOFISIalmacenMONTACARGAS {

    public static void main(String[] args) {
        // Creación del objeto Montacargas
        Montacargas montacargas1 = new Montacargas("Toyota", 3000.0);

        // Creación del Almacén asignándole el montacargas
        Almacen almacenCentral = new Almacen("Almacén Central Lima", "Av. Industrial 456", montacargas1);

        // Mostrar la información en consola
        almacenCentral.mostrarDetalles();
    }
}