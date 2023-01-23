package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Calendario calendario = new Calendario();

        Actividad actividad_1 = new Lectura("El club de la pelea", LocalDate.of(2023,07,21), LocalDate.of(2023,07,22));
        Actividad actividad_2 = new Trabajo("Programar", LocalDate.of(2023,07,21), LocalDate.of(2023,07,22));
        Actividad actividad_3 = new Tareas("Practiva POO", LocalDate.of(2023,07,21), LocalDate.of(2023,07,22));
        Actividad actividad_4 = new Ejerciciosfísicos("Sentaillas", LocalDate.of(2023,07,21), LocalDate.of(2023,07,22));
        calendario.agregarActividad(actividad_1);
        calendario.agregarActividad(actividad_3);
        calendario.agregarActividad(actividad_2);
        calendario.agregarActividad(actividad_4);


    }
}
