package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;

import java.time.LocalDate;

public class Trabajo extends Actividad implements Programable {

    public Trabajo(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }

        //TODO: validen las fechas
    }

    public Trabajo(String titulo, LocalDate fechaFinal){
        this(titulo, LocalDate.now(), fechaFinal);
    }

    @Override
    public void agregarRepeticion(int repeticiones) {

    }

}
