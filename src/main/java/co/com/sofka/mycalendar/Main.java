package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Actividad;
import co.com.sofka.mycalendar.actividades.Ejercicio;
import co.com.sofka.mycalendar.actividades.Lectura;
import co.com.sofka.mycalendar.actividades.Tareas;
import co.com.sofka.mycalendar.jornada.Jornada;
import co.com.sofka.mycalendar.jornada.Maniana;
import co.com.sofka.mycalendar.jornada.Noche;
import co.com.sofka.mycalendar.jornada.Tarde;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Calendario calendario = new Calendario();
        Jornada j1=new Maniana();
        Jornada j2=new Tarde();
        Jornada j3=new Noche();

        LocalDate fecha1=LocalDate.parse("2020-01-05");
        LocalDate fecha2=LocalDate.parse("2020-01-06");

        Actividad ac1=new Lectura("Leer principito",fecha1,fecha2, j1);
        Actividad ac2=new Tareas("De programacion",fecha1,fecha2, j2);
        Actividad ac3=new Ejercicio("Gym",fecha1,fecha2, j3);

        calendario.agregarActividad(ac1);
        calendario.agregarActividad(ac2);
        calendario.agregarActividad(ac3);

    }
}
