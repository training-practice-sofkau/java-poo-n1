package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Actividad;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.util.ArrayList;
import java.util.List;

public class Calendario {
    private List<Actividad> actividades;
    private List<Jornada> jornadas;


    public Calendario() {
        this.actividades = new ArrayList<>();
        this.jornadas = new ArrayList<>();

    }


    public void addActividad(Actividad actividad){
        actividades.add(actividad);
    }





}
