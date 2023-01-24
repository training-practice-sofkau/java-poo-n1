package co.com.sofka.mycalendar.jornada;

import java.time.LocalTime;

public class Mañana implements  Jornada{

    public LocalTime horaInicial() {
        return LocalTime.of(6, 0);
    }

    public LocalTime horaFinal() {
        return LocalTime.of(13, 0);
    }
}
