package co.com.sofka.mycalendar.dias;

import co.com.sofka.mycalendar.actividades.Actividad;

import java.util.List;

public abstract class Dia {
    private String nombre;
    private List<Actividad> actividades;

    public Dia(String nombre, List<Actividad> actividades) {
        this.nombre = nombre;
        this.actividades = actividades;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void addActividad(Actividad actividad) {
        actividades.add(actividad);
    }
}
