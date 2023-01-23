package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Ejercicio;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Atributos
         */
        int opcion = 0;

        /**
         * Repetir el menú, hasta que el usuario presione la opción salir.
         */
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Bienvenido(a), aquí podrás administrar tus actividades\n" +
                    "Calendario \uD83D\uDCC5\n" +
                    "Por favor digita la actividad que deseas: \n" +
                    "1. Lectura\n" +
                    "2. Actividad física\n" +
                    "3. Trabajo\n" +
                    "4. Tareas\n" +
                    "5. Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("1: \n");
                    break;

                case 2:
                    System.out.println("2: \n");
                    break;

                case 3:
                    System.out.println("3: \n");
                    break;

                case 4:
                    System.out.println("4: \n");
                    break;

                case 5:
                    System.exit(0);
                    break;
                /**
                 * Mensaje en caso de digitar un número que no esté en el menú
                 */
                default:
                    System.out.println("Número no valido");
            }
        } while (opcion!=5);

        Calendario calendario = new Calendario();
        LocalDate fechaInicial = LocalDate.parse("2023-01-23");
        LocalDate fechaFinal = LocalDate.parse("2023-01-23");

        calendario.agregarSemana(Semana.I);
        calendario.agregarActividad(new Ejercicio("Pecho", fechaInicial, fechaFinal,"TrenInferior"), calendario.getSemanaList().get(0), DiaSemana.Lunes);


    }
}
