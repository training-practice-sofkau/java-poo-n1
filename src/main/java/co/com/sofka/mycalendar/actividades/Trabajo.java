package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Interfaces.Programable;

import java.time.LocalDate;

public class Trabajo extends Actividad implements Programable {
    public Trabajo(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
    }

    public Trabajo(String titulo, LocalDate fechaFinal){
        this(titulo, LocalDate.now(), fechaFinal);
    }


    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
