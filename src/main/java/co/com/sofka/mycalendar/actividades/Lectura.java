package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.estado.Laborable;
import co.com.sofka.mycalendar.estado.Programable;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.time.LocalDate;

public class Lectura extends Actividad implements Programable {

    public Lectura(String titulo, LocalDate fechaInicial, LocalDate fechaFinal, Jornada jornada) {
        super(titulo, fechaInicial, fechaFinal, jornada);
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }
        else {
            (fechaInicial.isAfter(fechaFinal);
            System.out.println("Su hora del evento ya paso!!!");
        }
    }

    public Lectura(String titulo, LocalDate fechaFinal, Jornada jornada){
        this(titulo, LocalDate.now(), fechaFinal,jornada);
    }

    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
