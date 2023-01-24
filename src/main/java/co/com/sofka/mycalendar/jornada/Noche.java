package co.com.sofka.mycalendar.jornada;

import java.time.LocalTime;

public class Noche {
    public LocalTime horaInicial() {
        return LocalTime.of(19, 0);
    }


    public LocalTime horaFinal() {
        return LocalTime.of(5, 0);
    }
}
