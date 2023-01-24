package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.condiciones.Laborable;
import co.com.sofka.mycalendar.condiciones.Programable;

import java.time.LocalDate;

public class Trabajo extends Actividad implements Laborable, Programable {
    public Trabajo(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal, jornada);
    }

    @Override
    public boolean esValido() {
        return false;
    }

    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
