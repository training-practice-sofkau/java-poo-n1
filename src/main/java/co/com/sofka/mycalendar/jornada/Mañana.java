package co.com.sofka.mycalendar.jornada;

import co.com.sofka.mycalendar.condiciones.Laborable;

import java.time.LocalTime;

public class Mañana implements Jornada, Laborable {
    @Override
    public LocalTime horaInicial() {
        return null;
    }

    @Override
    public LocalTime horaFinal() {
        return null;
    }

    @Override
    public boolean esValido() {
        return true;
    }
}
