package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.condiciones.Programable;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.time.LocalDate;

public class Lectura extends Actividad implements Programable {

    public Lectura(String titulo, LocalDate fechaInicial, LocalDate fechaFinal, Jornada jornada) {
        super(titulo, fechaInicial, fechaFinal, jornada);
        if(titulo.isBlank()) {
            throw new IllegalArgumentException("El titulo no es valido");
        }
        if(fechaFinal.isBefore(fechaInicial)) {
            throw new IllegalArgumentException("La fecha final es antes de la inicial");
        }
        else if(fechaInicial.isAfter(fechaFinal)){
            throw new IllegalArgumentException("La fecha inicial es despues de la final");
        }
        }

    public Lectura(String titulo, LocalDate fechaFinal, Jornada jornada){
        this(titulo, LocalDate.now(), fechaFinal, jornada);
    }


    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
