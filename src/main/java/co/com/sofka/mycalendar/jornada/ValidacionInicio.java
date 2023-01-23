package co.com.sofka.mycalendar.jornada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidacionInicio {
    public static void entrada(){
        System.out.println("Bienvenido al sistema de calendario");
        Scanner seleccionOpciones = new Scanner(System.in);
        boolean out = false;
        int opcion;

        while (!out) {
            System.out.println("Por favor seleccione una de las siguientes opciones:");
            System.out.println("1. Agregar Actividades");
            System.out.println("2. Validacion de espacio de Jornadas");
            System.out.println("3. Salir");

            try {
                opcion = seleccionOpciones.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Se agregaran Actividades");

                        break;
                    case 2:
                        System.out.println("Se validaran los horarios de cada jornada");

                        break;
                    case 3:
                        out = true;
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor ingrese una opcion valida.");
                seleccionOpciones.next();
            }
        }
    }
}





