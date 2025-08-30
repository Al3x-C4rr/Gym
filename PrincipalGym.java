import java.util.Scanner;
//nota: Se redujo aquí de los 15 datos que puede poner a 5 para hacer más corto 
// la ejecucion del codigo
public class PrincipalGym {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Registro inscripcion = new Registro();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese su nombre:");
            String nombreMiem = teclado.nextLine();
            System.out.println("Ingrese que tipo de membresia tiene:");
            String Membr = teclado.nextLine();
            inscripcion.agregarMiembro(nombreMiem, Membr);

            System.out.println("Elija su entrenador \n1.Juan Carlos Villagrande \n2.Ana Lucia Maldonado \n3.Luis Estrada Cabrera:");
            do{
            int opcEntr = teclado.nextInt();
            teclado.nextLine(); 
            if(inscripcion.getEntrenadoressel()[opcEntr-1].getCantidad()<=3){
            inscripcion.ElegirEntrenador(opcEntr);
            inscripcion.getEntrenadoressel()[opcEntr-1].setCantidad();
            }
            else{
                System.out.println("Entrenador con capacidad maxima elija otro");
            }
            } while(inscripcion.getEntrenadores()[i].getNombreE()==null);
            System.out.println("Que tipo de rutina elejirás? \n1.Toda la semana \n2.Fin de semana \n3.Algunos días:");
            int TipoRut = teclado.nextInt();
            teclado.nextLine(); 
            inscripcion.agregarRutina(TipoRut);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre: " + inscripcion.getMiembros()[i].getNombre() + 
                               " Membresía: " + inscripcion.getMiembros()[i].getMembresia() +
                               "\nEntrenador: " + inscripcion.getEntrenadores()[i].getNombreE() +
                               "\nRutina seleccionada: " + inscripcion.getRutinas()[i].getRutina());
        }
    }
}