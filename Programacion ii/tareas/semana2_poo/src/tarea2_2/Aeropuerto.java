package tarea2_2;

public class Aeropuerto {
    private String nombre;
    private String ciudad;

    public Aeropuerto(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() { return nombre; }
    public String getCiudad() { return ciudad; }

    @Override
    public String toString() {
        return nombre + " (" + ciudad + ")";
    }
}