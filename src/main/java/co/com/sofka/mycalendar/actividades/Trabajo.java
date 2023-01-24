package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.condiciones.Laborable;
import co.com.sofka.mycalendar.condiciones.Programable;

import java.time.LocalDate;

public class Trabajo extends Actividad implements Programable {
    private int repeticiones;
    public Trabajo(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
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



    @Override
    public void agregarRepeticion(int repeticiones) {
        if(repeticiones < 0 ){
            throw new IllegalArgumentException("Ingresa un valor mayor que 0");
        }
        this.repeticiones = repeticiones;

    }
}
