package co.com.sofka.mycalendar.jornada;

import co.com.sofka.mycalendar.condiciones.Laborable;

import java.time.LocalTime;

public class Noche implements Jornada {
    @Override
    public LocalTime horaInicial() {
        return LocalTime.of(19, 0);
    }

    @Override
    public LocalTime horaFinal() {
        return LocalTime.of(6, 0);
    }

}
