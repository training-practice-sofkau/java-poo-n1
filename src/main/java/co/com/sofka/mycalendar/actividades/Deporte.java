package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;

import java.time.LocalDate;

public class Deporte extends Actividad implements Programable {
    public Deporte(String titulo, LocalDate fechaInicial, LocalDate fechaFinal){
        super(titulo, fechaInicial, fechaFinal);
        }


    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
