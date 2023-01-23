package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Laborable;
import co.com.sofka.mycalendar.Programable;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.time.LocalDate;

public class Trabajo extends Actividad implements Programable, Laborable {
    public Trabajo(String titulo, LocalDate fechaInicial, LocalDate fechaFinal, Jornada jornada) {
        super(titulo, fechaInicial, fechaFinal, jornada);
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }

        if(fechaInicial.isAfter(fechaFinal)){
            throw new IllegalArgumentException("La fechas no coinciden");
        }
    }

    @Override
    public void agregarRepeticion(int repeticiones) {
        System.out.println("La actividad se programara para los siguientes "+repeticiones+" semanas");
    }


    @Override
    public boolean esValido() {
        return true;
    }
}
