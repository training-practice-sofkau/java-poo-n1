package co.com.sofka.mycalendar.jornada;

import java.util.Scanner;

public class Semanas {
    public static void main (String[]args) {
        Scanner ingreso = new Scanner(System.in);
        int numero;
        int opcion;

        System.out.print("Hola Usuario, ingresa  del 1(lunes) al 7(domingo) el dia que vas a agendar:");
        if (ingreso.hasNextInt()) {
            numero = ingreso.nextInt();

            switch (numero) {

                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("numero ingresao no valido");
            }
        } else
            System.err.println("Por favor ingrese solo el numero correspondiente al dia");

        System.out.print("Selecciona la actividad a agendar: 1. Ejercicio Fisico, 2.Lectura, 3.Tareas, 4. Trabajo:");
        opcion= ingreso.nextInt();

        switch (opcion){
            case 1:



        }

    }}
