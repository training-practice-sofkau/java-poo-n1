package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.interfaces.Programable;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.time.LocalDate;
import java.time.LocalTime;

public class Deporte extends Actividad implements Programable{

    public Deporte(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
    }
    @Override
    public void agregarRepeticion(int repeticiones) throws IllegalAccessException {

    }
}
