public class Registro {
    private Miembros[] miembros;
    private Entrenadores[] entrenadores;
    private Rutinas[] rutinas;
    private int index, index2, index3;

    public Registro() {
        miembros = new Miembros[15];
        entrenadores = new Entrenadores[15];
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
        } else {
            System.out.println("No se pueden agregar más miembros.");
        }
    }

    public void agregarEntrenador(String nombre, int numero) {
        if (index2 >= 0 && index2 < 15) {
            Entrenadores entr = new Entrenadores(numero, nombre);
            entrenadores[index2] = entr;
            index2++;
        } else {
            System.out.println("No se pueden agregar más entrenadores.");
        }
    }
    
    public void agregarRutina(int tipoRutina) {
        if (index3 >= 0 && index3 < 15) {
            Rutinas rut = new Rutinas(tipoRutina);
            rutinas[index3] = rut;
            index3++;
        } else {
            System.out.println("No se pueden agregar más rutinas.");
        }
    }

    public Miembros[] getMiembros() {
        return miembros;
    }

    public Entrenadores[] getEntrenadores() {
        return entrenadores;
    }

    public Rutinas[] getRutinas() {
        return rutinas;
    }
}