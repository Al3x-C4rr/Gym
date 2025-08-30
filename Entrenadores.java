public class Entrenadores {
    private int numero;
    private String nombre;
    private int cantidad;
    public Entrenadores(){
        this.nombre = "";
        this.numero = 0;
        this.cantidad = 0;
    }
    public Entrenadores(int numero, String nombre){
        this.nombre = nombre;
        this.numero = numero;
        this.cantidad = 0;

    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombreE(String nombre) {
        this.nombre = nombre;
    }
    public void setCantidad() {
        cantidad++;
        
    }


    public int getCantidad(){
        return cantidad;
    }
    public int getNumero() {
        return numero;
    }

    public String getNombreE() {
        return nombre;
    }

}