package co.com.sofka.mycalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calendario calendario = new Calendario();

        /**
         * Atributos
         */
        int opcion = 0;

        /**
         * Repetir el menú, hasta que el usuario presione la opción salir.
         */
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Bienvenido(a) aquí podrás administrar tus actividades\n" +
                    "Calendario \uD83D\uDCC5\n" +
                    "Por favor digite la opción desea: \n" +
                    "1. Agregar\n" +
                    "2. Modificar\n" +
                    "3. Eliminar\n" +
                    "4. Salir.");
            opcion = entrada.nextInt();



            switch (opcion) {
                case 1:
                    System.out.println("op 1");
                    break;

                case 2:
                    System.out.println("op 2");
                    break;

                case 3:
                    System.out.println("op 3 ");
                    break;

                case 4:
                    System.exit(0);
                    break;
                /**
                 * Mensaje en caso de digitar un número que no esté en el menú
                 */
                default:
                    System.out.println("Número no valido");
            }
        } while (opcion!=4);
    }
}
