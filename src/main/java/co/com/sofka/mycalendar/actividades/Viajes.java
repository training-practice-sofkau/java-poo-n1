package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Laborable;

import java.time.LocalDate;

public class Viajes extends Actividad implements Laborable {

    public Viajes(String lugar, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(lugar, fechaInicial, fechaFinal);
    }

    public Viajes(String lugar, LocalDate fechaFinal){
        this(lugar, LocalDate.now(), fechaFinal);
    }
    @Override
    public boolean esValido() {
        return false;
    }
}
