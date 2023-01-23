package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.estado.Laborable;
import co.com.sofka.mycalendar.estado.Programable;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.time.LocalDate;

public class Deporte extends Actividad implements Programable, Laborable {
    public Deporte(String deporte, LocalDate fechaInicial, LocalDate fechaFinal, Jornada jornada) {
        super(deporte, fechaInicial, fechaFinal, jornada);
    }

    public Deporte(String deporte, LocalDate fechaFinal, Jornada jornada){
        this(deporte, LocalDate.now(), fechaFinal, jornada);
    }
    @Override
    public void agregarRepeticion(int repeticiones) {

    }

    @Override
    public boolean esValido() {
        return false;
    }
}
