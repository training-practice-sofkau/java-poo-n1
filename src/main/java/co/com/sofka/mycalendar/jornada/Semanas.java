package co.com.sofka.mycalendar.jornada;

import java.util.Scanner;

public class Semanas {
    public static void main (String[]args) {
        Scanner ingreso = new Scanner(System.in);
        int numero;

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

    }}
