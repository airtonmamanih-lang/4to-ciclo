package principal;

public class Principal {

    public static void main(String[] args) {
        TV tv1 = new TV();
        
        System.out.println("Estado inicial: canal=" + tv1.canal + " | vol=" + tv1.volumen + " | on=" + tv1.on);
        
        tv1.encender();
        tv1.subirCanal(); // Pasa a canal 2
        tv1.subirCanal(); // Pasa a canal 3
        System.out.println("canal1: " + tv1.canal); // Imprime 3

        tv1.bajarCanal(); // Pasa a canal 2
        tv1.bajarCanal(); // Pasa a canal 1
        tv1.bajarCanal(); // No baja más (límite 1)
        System.out.println("canal1 tras bajar: " + tv1.canal); // Se corrige para imprimir tv1 en vez de tv2

        System.out.println("\nDemostración de corrección de overflow:");
        long a = 2000000000L, b = 2000000000L; // Se usa 'long' en lugar de 'int'
        long c = a + b;
        System.out.println("a + b = " + c); // Imprime 4000000000
    }
}

class TV {
    public int canal = 1; // Inicializar en canal 1 por defecto
    public int volumen;
    public boolean on;

    public void encender() {
        on = true;
    }

    public void apagar() {
        on = false;
    }

    public void subirCanal() {
        if (on && canal < 120) canal++;
    }

    public void bajarCanal() {
        if (on && canal > 1) canal--;
    }

    public void setCanal(int canal) {
        if (on && canal >= 1 && canal <= 120) {
            this.canal = canal;
        }
    }
}