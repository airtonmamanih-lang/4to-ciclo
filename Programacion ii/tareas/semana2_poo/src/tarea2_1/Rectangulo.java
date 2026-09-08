package tarea2_1;

public class Rectangulo {
    private double ancho;
    private double alto;

    // Constructor por defecto
    public Rectangulo() {
        this.ancho = 1.0;
        this.alto = 1.0;
    }

    // Constructor parametrizado
    public Rectangulo(double ancho, double alto) {
        setAncho(ancho);
        setAlto(alto);
    }

    // Getters y Setters
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho > 0) {
            this.ancho = ancho;
        } else {
            System.out.println("El ancho debe ser mayor que 0. Se asignó 1.0 por defecto.");
            this.ancho = 1.0;
        }
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        if (alto > 0) {
            this.alto = alto;
        } else {
            System.out.println("El alto debe ser mayor que 0. Se asignó 1.0 por defecto.");
            this.alto = 1.0;
        }
    }

    // Métodos de cálculo
    public double calcularArea() {
        return this.ancho * this.alto;
    }

    public double calcularPerimetro() {
        return 2 * (this.ancho + this.alto);
    }

    @Override
    public String toString() {
        return "Rectangulo [Ancho = " + ancho + ", Alto = " + alto + 
               ", Área = " + calcularArea() + ", Perímetro = " + calcularPerimetro() + "]";
    }
}