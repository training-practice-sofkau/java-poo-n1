package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.estado.Laborable;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.time.LocalDate;

public class Viajes extends Actividad implements Laborable {


    public Viajes(String lugar, LocalDate fechaInicial, LocalDate fechaFinal, Jornada jornada) {
        super(lugar, fechaInicial, fechaFinal, jornada);
    }

    public Viajes(String lugar, LocalDate fechaFinal, Jornada jornada){
        this(lugar, LocalDate.now(), fechaFinal,jornada);

    }

    @Override
    public boolean esValido() {
        return false;
    }
}
