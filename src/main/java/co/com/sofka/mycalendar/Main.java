package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Actividad;
import co.com.sofka.mycalendar.actividades.Deporte;
import co.com.sofka.mycalendar.actividades.Lectura;
import co.com.sofka.mycalendar.jornada.Dias;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calendario calendario = new Calendario();
        Actividad deporte = new Lectura("ddd", new(Date.));


        System.out.println("Escribe un dia de la semana: ");
        var dia = entrada.nextLine();

        Dias diaSem = Dias.valueOf(dia.toUpperCase());


        switch (diaSem){
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El dia " + diaSem.name() + " es laboral");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("El dia " + diaSem.name() + " puedes realizar tus actividades personales");
            default:
                System.out.println("El día digitado es incorrecto");
        }

    }
}
