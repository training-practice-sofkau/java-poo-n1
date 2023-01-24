package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;
import co.com.sofka.mycalendar.jornada.Jornada;
import co.com.sofka.mycalendar.jornada.Tarde;

import java.time.LocalDate;

public class Lectura extends Actividad implements Programable {

    public Lectura(String titulo, LocalDate fechaInicial, LocalDate fechaFinal, Jornada jornada) {
        super(titulo, fechaInicial, fechaFinal, jornada);
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }

        if(super.fechaFinal().isBefore(super.fechaInicial())){
            throw new IllegalArgumentException("La fecha no es valido");
        }
    }

    public Lectura(String titulo, LocalDate fechaFinal, Jornada jornada){
        super(titulo, LocalDate.now(), fechaFinal, jornada);
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }

        if(super.fechaFinal().isBefore(super.fechaInicial())){
            throw new IllegalArgumentException("La fecha no es valido");
        }
    }

    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
