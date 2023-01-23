package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.Enums.Journeys;
import co.com.sofka.mycalendar.Enums.Weekdays;
import co.com.sofka.mycalendar.actividades.Actividad;
import co.com.sofka.mycalendar.actividades.Lectura;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        LocalDate horaInicio = LocalDate.of(2023,1,9);
        LocalDate horaFinal = LocalDate.of(2023,1,15);

        Actividad lectura = new Lectura("Hacer ejercicio",horaInicio,horaFinal);
        lectura.setJornada(Journeys.MORNING);
        System.out.println(lectura.toString());
        Calendario calendario = new Calendario();

    }


}
