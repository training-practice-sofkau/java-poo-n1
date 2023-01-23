package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;
import co.com.sofka.mycalendar.tiempo.DiaSemana;

import java.time.LocalDate;

public class Trabajo extends Actividad implements Programable {

    private int repeticiones;

    public Trabajo(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
    }

    @Override
    public void agregarRepeticion(int repeticiones) {
        if (repeticiones < 0) {
            throw new IllegalArgumentException("Las repeticiones no pueden ser negativas");
        }
        this.repeticiones = repeticiones;
    }


    public boolean esValido() {
        return false;
    }
}