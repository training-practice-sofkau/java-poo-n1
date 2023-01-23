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




         LocalDate horaInicioParse = LocalDate.of(2022,02,02);
         LocalDate horaFinalParse = LocalDate.of(2022,02,03);

       Actividad lectura = new Lectura("Hacer ejercicio",horaInicioParse,horaFinalParse);
        lectura.setJornada(Journeys.MORNING);
        System.out.println(lectura.toString());
        Calendario calendario = new Calendario();

    }


}
