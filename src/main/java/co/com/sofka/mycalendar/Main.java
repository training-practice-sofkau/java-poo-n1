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
                    System.out.println("Actividades: \n" +
                            "Ejercicio \n" +
                            "Lectura \n" +
                            "Tareas \n" +
                            "Trabajo \n" +
                            "Escuchar música \n");
                    System.out.println("Digite la actividad que desea agregar: \n");
                    break;

                case 2:
                    System.out.println("Digite el nombre de la actividad que desea modificar: \n");
                    break;

                case 3:
                    System.out.println("Digite el nombre de la actividad que desea eliminar: \n");
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
