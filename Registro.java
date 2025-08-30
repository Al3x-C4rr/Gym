public class Registro {
    private Miembros[] miembros;
    private Entrenadores[] entrenadores,entrenadoresselec;
    private Rutinas[] rutinas;
    private int index, index2, index3;

    public Registro() {
        miembros = new Miembros[15];
        entrenadores = new Entrenadores[15];
        entrenadoresselec = new Entrenadores[3];
        entrenadoresselec[0] = new Entrenadores(1, "Juan Carlos Villagrande");
        entrenadoresselec[1] = new Entrenadores(2, "Ana Lucia Maldonado");
        entrenadoresselec[2] = new Entrenadores(3, "Luis Estrada Cabrera");
        rutinas = new Rutinas[15];
        index = 0;
        index2 = 0;
        index3 = 0;
    }

    public void agregarMiembro(String nombre, String membresia) {
        if (index >= 0 && index < 15) {
            Miembros miem = new Miembros(nombre, membresia);
            miembros[index] = miem;
            index++;
        }
    }

    public void ElegirEntrenador(int numero) {
        Entrenadores entrSeleccionado = entrenadoresselec[numero - 1]; 
            entrenadores[index2] = entrSeleccionado;
            entrSeleccionado.setCantidad();
            index2++;
    }
    
    public void agregarRutina(int tipoRutina) {
        if (index3 >= 0 && index3 < 15) {
            Rutinas rut = new Rutinas(tipoRutina);
            rutinas[index3] = rut;
            index3++;
        }
    }

    public Miembros[] getMiembros() {
        return miembros;
    }

    public Entrenadores[] getEntrenadores() {
        return entrenadores;
    }
    public Entrenadores[] getEntrenadoressel(){
        return entrenadoresselec;
    }
    public Rutinas[] getRutinas() {
        return rutinas;
    }
}