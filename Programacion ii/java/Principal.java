package principal;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TV tv1=new     TV()     ;
        TV tv2=new     TV()     ;
        System.out.println("canal= "+tv1.canal+" | "+tv1.volumen+" | "+tv1.on);
        tv1.encender();
        tv1.subirCanal();
        tv1.subirCanal();
        System.out.println("canal= "+tv1.canal);
        tv1.bajarCanal();
        tv1.bajarCanal();
        tv1.bajarCanal();
        tv1.bajarCanal();
        System.out.println("canal= "+tv1.canal);    
        System.out.println("tarea para explicar con detalle:");
        int a=2000000000, b=2000000000;
        int c=a+b;
        System.out.println("a+b= "+c);
    }
}
class TV{
    public int canal;
    public int volumen;
    public boolean on;
    public void encender(){
        on=true;
    }
    public void apagar(){
        on=false;
    }
    public void subirCanal(){
        if(on && canal<120) canal++;
    }
    public void bajarCanal(){
        if(on && canal>1) canal--;
    }
    public void setCanal(int canal){
        if(canal>=1 && canal<=120){
            this.canal=canal;
        }
    }
}
