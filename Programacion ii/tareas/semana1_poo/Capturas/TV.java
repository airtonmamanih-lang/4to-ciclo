class TV {

    public int canal;
    public int volumen ;
    public boolean on;
    public void encender () {
        on = true;
    }

    public void apagar () {
        on = false;
    }

    public void subirCanal () {
        if (on && canal < 120)
        canal ++;
    }

    public void bajarCanal () {
        if (on && canal > 1)
        canal --;
    }

    public void setCanal (int canal) {
        if (canal >= 1 && canal <= 120)
        this.canal = canal;
    }
}