package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;

import java.time.LocalDate;

public class Trabajo  extends Actividad implements Programable {
    public Trabajo (String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        if (titulo.isBlank()) {
            throw new IllegalArgumentException("El titulo no es valido");
        }

        }

    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}


