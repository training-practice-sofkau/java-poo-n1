package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Actividad;

import java.util.ArrayList;
import java.util.List;

public class Calendario {

    private List<Actividad> actividadList;

    private List<Actividad> jornadas;

    public Calendario() {

        this.actividadList = new ArrayList<>();
        this.jornadas = new ArrayList<>();
    }


    public void agregarActividad(Actividad actividad){

        actividadList.add(actividad);
    }


}
