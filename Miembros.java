public class Miembros {
    private String nombre;
    private String membresia;
    public Miembros(){
        this.nombre = "";
        this.membresia = "";
    }
    public Miembros(String nombre, String membresia){
        this.nombre = nombre;
        this.membresia = membresia;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getMembresia() {
        return membresia;
    }
}