package co.com.sofka.mycalendar.dias;

import co.com.sofka.mycalendar.actividades.Actividad;

import java.util.List;

public class Domingo extends Dia{
    public Domingo(String nombre, List<Actividad> actividades) {
        super("Domingo", actividades);
    }
}
