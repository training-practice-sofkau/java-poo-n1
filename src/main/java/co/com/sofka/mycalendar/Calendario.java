package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Actividad;

import java.util.ArrayList;
import java.util.List;

public class Calendario {

    private List<Actividad> actividadList;
    private List<Semana> semanaList;

    public Calendario() {
        this.actividadList = new ArrayList<>();
    }


    public void agregarActividad(Actividad actividad, Semana semana, DiaSemana dia) {
        actividadList.add(actividad);

    }

    public void agregarSemana(Semana semana) {
        semanaList.add(semana);
    }

    public List<Actividad> getActividadList() {
        return actividadList;
    }

    public List<Semana> getSemanaList() {
        return semanaList;
    }

}
