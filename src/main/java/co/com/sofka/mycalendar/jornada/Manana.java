package co.com.sofka.mycalendar.jornada;

import java.time.LocalTime;

public class Manana implements Manana.Jornada {
    @Override
    public LocalTime horaInicial() {
        return LocalTime.of(8,0);
    }

    @Override
    public LocalTime horaFinal() {
        return LocalTime.of(12,0);
    }

    public static interface Jornada {
        LocalTime horaInicial();
        LocalTime horaFinal();
    }
}
