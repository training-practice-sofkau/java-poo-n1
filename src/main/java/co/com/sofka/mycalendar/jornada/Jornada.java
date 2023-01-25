package co.com.sofka.mycalendar.jornada;

import java.time.LocalTime;

public interface Jornada {
    String nombreJornada();
    LocalTime horaInicial();
    LocalTime horaFinal();
}
