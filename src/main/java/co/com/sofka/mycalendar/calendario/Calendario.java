package co.com.sofka.mycalendar.calendario;

import co.com.sofka.mycalendar.actividades.Actividad;
import co.com.sofka.mycalendar.actividades.Lectura;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendario {

    private List<Actividad> actividadList;

    private List<Actividad> jornadas;

    public Calendario() {

        this.actividadList = new ArrayList<>();
        this.jornadas = new ArrayList<>();
    }


    public void agregarActividadLectura(String titulo, LocalDate fechaInicial, LocalDate fechaFinal){

        actividadList.add(new Lectura(titulo, fechaInicial, fechaFinal));
    }


    public void agregarActividadEjercicioFisico(String titulo, LocalDate fechaInicial, LocalDate fechaFinal){

        actividadList.add(new Lectura(titulo, fechaInicial, fechaFinal ));
    }


    public void agregarActividadTrabajo(String titulo, LocalDate fechaInicial, LocalDate fechaFinal){

        actividadList.add(new Lectura(titulo, fechaInicial, fechaFinal ));
    }


    public void agregarActividadTareas(String titulo, LocalDate fechaInicial, LocalDate fechaFinal){

        actividadList.add(new Lectura(titulo, fechaInicial, fechaFinal ));
    }
}
