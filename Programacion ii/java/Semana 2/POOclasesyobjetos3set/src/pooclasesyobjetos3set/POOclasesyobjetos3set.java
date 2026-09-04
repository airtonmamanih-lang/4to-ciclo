package pooclasesyobjetos3set;

import misClases.Circulo;

public class POOclasesyobjetos3set {

    public static void main(String[] args) {
        // Objeto creado con el constructor por defecto
        Circulo c1 = new Circulo();
        c1.mostrarDatos();

        System.out.println();

        // Modificando el radio mediante el método Set
        c1.setRadio(5.5);
        System.out.println("Después de modificar el radio con setRadio(5.5):");
        c1.mostrarDatos();
    }
}