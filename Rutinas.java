public class Rutinas {
    private int tipoRutina1;
    private String rutina;

    public Rutinas(){
        this.tipoRutina1 = 1;
        this.rutina="";
    }
    public Rutinas(int tipoRutina1){
        this.tipoRutina1 = tipoRutina1;
    }
    // Setters
    public void setRutina(int tipoRutina1) {
        this.tipoRutina1 = tipoRutina1;
        if(tipoRutina1==1){
            rutina = "Toda la semana";
        }
        else if (tipoRutina1==2){
            rutina = "Fin de semana";
        }else if (tipoRutina1==3){
            rutina = "Algunos días";
        }
    }

    // Getter
    public String getRutina() {
        return rutina;
    }
}