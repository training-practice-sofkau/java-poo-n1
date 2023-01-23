package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Actividad;
import co.com.sofka.mycalendar.dias.Dia;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.util.ArrayList;
import java.util.List;

public class Calendario {
    private List<Actividad> actividades;
    private List<Jornada> jornadas;
    private List<Dia> dias;

    public Calendario() {
        this.actividades = new ArrayList<>();
        this.jornadas = new ArrayList<>();
        this.dias = new ArrayList<>();
    }


    public void addActividad(Actividad actividad){
        actividades.add(actividad);
    }
    public void addJornada(Jornada jornada) {
        jornadas.add(jornada);
    }
    public void addDia(Dia dia) {
        dias.add(dia);
    }



}
