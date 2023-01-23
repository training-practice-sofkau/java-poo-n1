package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Actividad;
import co.com.sofka.mycalendar.actividades.Lectura;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendario {
    private List<Actividad> actividades;
    private List<Jornada> jornadas;


    public Calendario() {
        this.actividades = new ArrayList<>();
        this.jornadas = new ArrayList<>();
    }
    public Calendario(ArrayList <Actividad> actividades){
        this.actividades = actividades;
    }


    public void addActividadLectura(String titulo, LocalDate fechaInicial, LocalDate fechaFinal, Jornada jornada){
        actividades.add(new Lectura(titulo, fechaInicial, fechaFinal, jornada));
    }






}
