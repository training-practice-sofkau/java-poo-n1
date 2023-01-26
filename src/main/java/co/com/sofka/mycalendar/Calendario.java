package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Actividad;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.util.ArrayList;
import java.util.List;

public class Calendario {



    private List<Actividad> actividadList;
    private List<Jornada> jornada;



    public Calendario() {

        this.actividadList = new ArrayList<>();
        this.jornada = new ArrayList<>();
    }


    public void agregarActividad(Actividad actividad){

        actividadList.add(actividad);
    }




}
