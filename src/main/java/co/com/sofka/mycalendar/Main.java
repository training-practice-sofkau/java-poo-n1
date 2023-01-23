package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Actividad;
import co.com.sofka.mycalendar.actividades.Deporte;
import co.com.sofka.mycalendar.actividades.Lectura;
import co.com.sofka.mycalendar.actividades.Viajes;
import co.com.sofka.mycalendar.jornada.Dias;
import co.com.sofka.mycalendar.jornada.Jornada;
import co.com.sofka.mycalendar.jornada.Tarde;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calendario calendario = new Calendario();
        Actividad deporte;
        deporte = new Lectura("ddd", LocalDate.of(2023,01,10),LocalDate.of(2023,01,15), LocalTime.of(14,59),LocalTime.of(14,30),);
        Actividad trabajo = new Viajes();

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
