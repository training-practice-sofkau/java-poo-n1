package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;

import java.time.LocalDate;

public class ActividadFisica extends Actividad implements Programable {
    public ActividadFisica(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
    }

    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
