package misClases;

public class Almacen {
    private String nombre;
    private String ubicacion;
    private Montacargas montacargas;

    // Constructor
    public Almacen(String nombre, String ubicacion, Montacargas montacargas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.montacargas = montacargas;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Montacargas getMontacargas() {
        return montacargas;
    }

    public void setMontacargas(Montacargas montacargas) {
        this.montacargas = montacargas;
    }

    public void mostrarDetalles() {
        System.out.println("--- INFORMACIÓN DEL ALMACÉN ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Equipo asignado: " + montacargas.toString());
    }
}