package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.condiciones.Programable;

import java.time.LocalDate;

public class Lectura extends Actividad implements Programable {

    public Lectura(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }
       //DO: validación de fecha
        if(fechaInicial.isBefore(fechaFinal)){
            throw new IllegalArgumentException("Error en la cronología del tiempo");
        }
        if(fechaFinal().isAfter(fechaInicial)){
            throw new IllegalArgumentException("Error en la cronología del tiempo");
        }


    }

    public Lectura(String titulo, LocalDate fechaFinal){
        this(titulo, LocalDate.now(), fechaFinal);
    }

    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
