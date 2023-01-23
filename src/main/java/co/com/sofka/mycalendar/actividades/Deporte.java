package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;

import java.time.LocalDate;

public class Deporte extends Actividad implements Programable {
    public Deporte(String deporte, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(deporte, fechaInicial, fechaFinal);
    }

    public Deporte(String deporte, LocalDate fechaFinal){
        this(deporte, LocalDate.now(), fechaFinal);
    }
    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
