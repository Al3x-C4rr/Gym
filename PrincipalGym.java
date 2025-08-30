import java.util.Scanner;

public class PrincipalGym {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Registro inscripcion = new Registro();

        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese su nombre:");
            String nombreMiem = teclado.nextLine();
            System.out.println("Ingrese que tipo de membresia tiene:");
            String Membr = teclado.nextLine();
            inscripcion.agregarMiembro(nombreMiem, Membr);

            System.out.println("Nombre del entrenador:");
            String nombreEntr = teclado.nextLine();
            inscripcion.agregarEntrenador(nombreEntr, i + 1);

            System.out.println("Que tipo de rutina elejirás? \n1.Toda la semana \n2.Fin de semana \n3.Algunos días:");
            int TipoRut = teclado.nextInt();
            teclado.nextLine(); 
            inscripcion.agregarRutina(TipoRut);
        }

        for (int i = 0; i < 15; i++) {
            System.out.println("Nombre: " + inscripcion.getMiembros()[i].getNombre() + 
                               " Membresía: " + inscripcion.getMiembros()[i].getMembresia() +
                               "\nEntrenador: " + inscripcion.getEntrenadores()[i].getNombre() +
                               "\nRutina seleccionada: " + inscripcion.getRutinas()[i].getRutina());
        }
    }
}