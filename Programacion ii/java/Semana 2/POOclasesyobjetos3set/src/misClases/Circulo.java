package misClases;

public class Circulo {
    private double radio;

    // Constructor por defecto
    public Circulo() {
        this.radio = 1.0;
    }

    // Constructor con parámetro
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getter y Setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Métodos para calcular área y perímetro
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void mostrarDatos() {
        System.out.println("--- DATOS DEL CÍRCULO ---");
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()));
    }
}