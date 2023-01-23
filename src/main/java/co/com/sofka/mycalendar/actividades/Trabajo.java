package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Laborable;
import co.com.sofka.mycalendar.Programable;

import java.time.LocalDate;

public class Trabajo  extends Actividad implements Programable, Laborable {
    public Trabajo (String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        if (titulo.isBlank()) {
            throw new IllegalArgumentException("El titulo no es valido");
        }
        if (fechaInicial.isAfter(fechaFinal)) {
            throw new IllegalArgumentException("La fecha inicial no puede ser mayor a la fecha final");

        }
        if (fechaInicial.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha inicial no puede ser menor a la fecha actual");
        }
    }
    @Override
    public void agregarRepeticion(int repeticiones) {

    }

    @Override
    public boolean esValido() {
        return false;
    }
}
