package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.interfaces.Programable;

import java.time.LocalDate;
import java.time.LocalTime;

public class Lectura extends Actividad implements Programable {

    public Lectura(String titulo, LocalDate fechaInicial, LocalDate fechaFinal, LocalTime duracion) {
        super(titulo, fechaInicial, fechaFinal,duracion);
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }

        //TODO: validen las fechas
    }

    public Lectura(String titulo, LocalDate fechaFinal, LocalTime duracion){
        this(titulo, LocalDate.now(), fechaFinal,duracion);
    }

    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
