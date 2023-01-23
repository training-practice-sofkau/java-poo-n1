package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.time.LocalDate;
import java.time.LocalTime;

public class Lectura extends Actividad implements Programable, Jornada {



    public Lectura(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }

        if(fechaInicial.isAfter(fechaFinal)){
            throw new IllegalArgumentException("La fechas no coinciden");
        }
    }

    public Lectura(String titulo, LocalDate fechaFinal){
        this(titulo, LocalDate.now(), fechaFinal);
    }


    @Override
    public void agregarRepeticion(int repeticiones) {
        System.out.println("La actividad se programara para los siguientes "+repeticiones+" semanas");
    }

    @Override
    public LocalTime horaInicial() {
        return null;
    }

    @Override
    public LocalTime horaFinal() {
        return null;
    }
}
