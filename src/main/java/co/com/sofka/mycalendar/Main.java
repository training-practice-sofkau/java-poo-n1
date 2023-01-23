package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.Enums.Journeys;
import co.com.sofka.mycalendar.Enums.Weekdays;
import co.com.sofka.mycalendar.actividades.Actividad;
import co.com.sofka.mycalendar.actividades.Lectura;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Actividad ");
        String horaFinal = (s.nextLine());
        System.out.println("Nueva FechaInicio año-mes-dia ");
        String horaInicio = (s.nextLine());
        System.out.println("Nueva FechaFinal  año-mes-dia ");

        String desc1 = s.nextLine();
        System.out.println(horaInicio+horaFinal);
         LocalDate horaInicioParse = LocalDate.parse(horaInicio);
         LocalDate horaFinalParse = LocalDate.parse(horaFinal);

      /*  Actividad lectura = new Lectura("Hacer ejercicio",horaInicio,horaFinal);
        lectura.setJornada(Journeys.MORNING);
        System.out.println(lectura.toString());
        Calendario calendario = new Calendario();*/



    }


}
