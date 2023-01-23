package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Actividad;

import java.util.ArrayList;
import java.util.List;

//Clase calendario
public class Calendario {

    private List<Actividad> actividadList;


    public Calendario() {

        this.actividadList = new ArrayList<>();

    }

    public void agregarActividad(Actividad actividad){

        actividadList.add(actividad);
    }

}
