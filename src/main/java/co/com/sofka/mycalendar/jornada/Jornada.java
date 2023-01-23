package co.com.sofka.mycalendar.jornada;

import java.time.LocalTime;

//Interface que contiene la hora inicial y final de una actividad.
public interface Jornada {
    LocalTime horaInicial();
    LocalTime horaFinal();
}
