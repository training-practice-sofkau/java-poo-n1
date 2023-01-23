package co.com.sofka.mycalendar.jornada;

import java.time.LocalTime;

public class Mañana implements Jornada{
    @Override
    public LocalTime horaInicial() {
        return LocalTime.of(05, 00);
    }

    @Override
    public LocalTime horaFinal() {
        return LocalTime.of(12, 00);
    }
}
