package misClases;

public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private String codigoIATA;

    // Constructor por defecto
    public Aeropuerto() {
        this.nombre = "Jorge Chávez";
        this.ciudad = "Lima";
        this.codigoIATA = "LIM";
    }

    // Constructor parametrizado
    public Aeropuerto(String nombre, String ciudad, String codigoIATA) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.codigoIATA = codigoIATA;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoIATA() {
        return codigoIATA;
    }

    public void setCodigoIATA(String codigoIATA) {
        this.codigoIATA = codigoIATA;
    }

    @Override
    public String toString() {
        return nombre + " (" + codigoIATA + ") - " + ciudad;
    }
}