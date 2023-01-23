package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;

import java.time.LocalDate;

public class Lectura extends Actividad implements Programable {

    public Lectura(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }

        //TODO: validen las fechas
        if (fechaInicial.isAfter(fechaFinal)){
            throw new IllegalArgumentException("La fecha inicial no puede ser mayor a la fecha final");
        }
        if (fechaInicial.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("La fecha inicial no puede ser menor a la fecha actual");
        }
        if (fechaFinal.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("La fecha final no puede ser menor a la fecha actual");
        }
    }

    public Lectura(String titulo, LocalDate fechaFinal){
        this(titulo, LocalDate.now(), fechaFinal);
    }

    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
