package co.com.sofka.mycalendar.jornada;

import co.com.sofka.mycalendar.Laborable;

import java.time.LocalTime;

public class Tarde implements Jornada, Laborable {
    @Override
    public LocalTime horaInicial() {
        return LocalTime.of(14, 0);
    }

    @Override
    public LocalTime horaFinal() {
        return LocalTime.of(18, 0);
    }

    @Override
    public boolean esValido() {
        return true;
    }
}
