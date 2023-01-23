package co.com.sofka.mycalendar.jornada;

import java.time.LocalTime;

public class Mañana implements Jornada {
    @Override
    public LocalTime horaInicial() {
        return LocalTime.of(0, 0);
    }

    @Override
    public LocalTime horaFinal() {
        return LocalTime.of(11, 59);
    }
}
