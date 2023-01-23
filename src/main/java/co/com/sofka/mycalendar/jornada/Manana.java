package co.com.sofka.mycalendar.jornada;

import co.com.sofka.mycalendar.Laborable;

import java.time.LocalTime;

public class Manana implements Jornada, Laborable {
    @Override
    public LocalTime horaInicial() {
        return LocalTime.of(8, 0);
    }

    @Override
    public LocalTime horaFinal() {
        return LocalTime.of(12, 0);
    }

    @Override
    public boolean esValido() {
        return false;
    }
}
