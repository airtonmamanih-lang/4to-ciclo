package tarea2_2;

public class Almacen {
    private String nombre;
    private Montacargas montacargas; // Agregación (el montacargas existe independientemente)

    public Almacen(String nombre) {
        this.nombre = nombre;
    }

    public void asignarMontacargas(Montacargas m) {
        this.montacargas = m;
    }

    public void mostrarEstado() {
        System.out.println("Almacén: " + nombre + " | " + 
            (montacargas != null ? "Asignado: " + montacargas : "Sin montacargas asignado"));
    }
}