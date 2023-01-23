package co.com.sofka.mycalendar;



import co.com.sofka.mycalendar.actividades.Actividad;
import co.com.sofka.mycalendar.actividades.EjercicioFisico;
import co.com.sofka.mycalendar.actividades.Lectura;
import co.com.sofka.mycalendar.actividades.Trabajo;
import co.com.sofka.mycalendar.jornada.Jornada;
import co.com.sofka.mycalendar.jornada.Mañana;
import co.com.sofka.mycalendar.jornada.Noche;
import co.com.sofka.mycalendar.jornada.Tarde;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Calendario calendario = new Calendario();
        Jornada jornada1 = new Tarde();
        Jornada jornada2 = new Mañana();
        Jornada jornada3 = new Noche();

        Actividad actividad1 = new Lectura("Lectura de cuento", LocalDate.of(2022,10,1), LocalDate.of(2022,10,5), jornada1);
        Actividad actividad2 = new EjercicioFisico("Yoga", LocalDate.of(2022,10,1), LocalDate.of(2022,10,5), jornada2);
        Actividad actividad3 = new Trabajo("Realizar informe", LocalDate.of(2022,10,1), LocalDate.of(2022,10,5), jornada3);


        List<Actividad> actividades = new ArrayList<>();
        actividades.add(actividad1);
        actividades.add(actividad2);
        actividades.add(actividad3);

        System.out.println("Las actividades son: " +actividad1);
    }
}
