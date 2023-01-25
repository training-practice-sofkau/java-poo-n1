package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Actividad;

import java.util.ArrayList;
import java.util.List;

public class Calendario {

    private List<Actividad> actividadList;

    public Calendario() {
        this.actividadList = new ArrayList<>();
    }

    public void agregarActividad(Actividad actividad){
        actividadList.add(actividad);
        System.out.println("Nueva actividad '"+ actividad.titulo() + "ha sido agregada al calendario");
    }
}