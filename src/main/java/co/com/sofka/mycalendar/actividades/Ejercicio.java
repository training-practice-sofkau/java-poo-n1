package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;

import java.time.LocalDate;

public class Ejercicio extends Actividad implements Programable {
    public Ejercicio(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
    }

    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
