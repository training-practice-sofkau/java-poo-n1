package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.condiciones.Programable;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.time.LocalDate;

public class Lectura extends Actividad implements Programable {
    private int repeticiones;
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

   //public Lectura(String titulo, LocalDate fechaFinal){ this(titulo, LocalDate.now(), fechaFinal, Jornada jornada);    }

    @Override
    public void agregarRepeticion(int repeticiones) {
        if(repeticiones < 0 ){
            throw new IllegalArgumentException("Ingresa un valor mayor que 0");
        }
        this.repeticiones = repeticiones;

    }
}
