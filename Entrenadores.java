public class Entrenadores {
    private int numero;
    private String nombre;
    public Entrenadores(){
        this.nombre = "";
        this.numero = 0;
    }
    public Entrenadores(int numero, String nombre){
        this.nombre = nombre;
        this.numero = numero;

    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombreE(String nombre) {
        this.nombre = nombre;
    }


    // Getters
    public int getNumero() {
        return numero;
    }

    public String getNombreE() {
        return nombre;
    }

}