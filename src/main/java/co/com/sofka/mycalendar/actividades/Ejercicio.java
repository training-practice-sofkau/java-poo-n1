package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Laborable;
import co.com.sofka.mycalendar.Programable;

import java.time.LocalDate;

public class Ejercicio extends Actividad implements Programable, Laborable {

    public Ejercicio(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
    }

    @Override
    public void agregarRepeticion(int repeticiones) {

    }

    @Override
    public boolean esValido() {
        return false;
    }
}
