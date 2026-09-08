package tarea2_1;

public class MainRectangulo {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE TAREA 2.1: CLASE RECTANGULO ===");
        
        Rectangulo r1 = new Rectangulo();
        System.out.println("Rectángulo 1 (Defecto): " + r1);

        Rectangulo r2 = new Rectangulo(5.5, 3.2);
        System.out.println("Rectángulo 2 (Personalizado): " + r2);

        r1.setAncho(10.0);
        r1.setAlto(4.0);
        System.out.println("Rectángulo 1 (Modificado): " + r1);
    }
}