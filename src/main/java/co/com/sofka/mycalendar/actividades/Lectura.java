package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.interfaces.Programable;
import co.com.sofka.mycalendar.jornada.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class Lectura extends Actividad implements Programable{
    public Lectura(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
    }

    @Override
    public void agregarRepeticion(int repeticiones) throws IllegalAccessException {

    }
}
