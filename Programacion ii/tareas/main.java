public static void main(String [] args) {

 TV tv1 = new TV();
 TV tv2 = new TV();

 System.out. println ("Estado inicial tv1:");
 System.out. println ("Canal: " + tv1.canal);
 System.out. println (" Volumen : " + tv1. volumen );
 System.out. println (" Encendida : " + tv1.on);

 tv1. encender ();

 tv1. setCanal (50);
 tv1. subirCanal ();
 tv1. subirCanal ();

 System.out. println ("\ nDespues de encender y cambiar el canal:");
 System.out. println ("Canal tv1: " + tv1.canal);

 tv1. bajarCanal ();

 System.out. println ("Canal tv1 despues de bajar: " + tv1.canal);

 tv1. setCanal (120);

 tv1. subirCanal ();

 System.out. println ("Canal maximo: " + tv1.canal);

 tv1. setCanal (200);

 System.out. println (" Despues de setCanal (200): " + tv1.canal);

 tv2. encender ();
 tv2. setCanal (10);

 System.out. println ("\ nEstado de tv2:");
 System.out. println ("Canal tv2: " + tv2.canal);
 System.out. println (" Encendida tv2: " + tv2.on);
 }