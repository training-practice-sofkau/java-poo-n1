package co.com.sofka.mycalendar.jornada;

import java.time.LocalTime;

public class Noche implements Jornada {
    @Override
    public String nombreJornada() {
        return "Noche";
    }
    @Override
    public LocalTime horaInicial() {
        return LocalTime.of(18, 1);
    }

    @Override
    public LocalTime horaFinal() {
        return LocalTime.of(22, 0);
    }
}
