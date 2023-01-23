package co.com.sofka.mycalendar.jornada;
import java.time.LocalTime;
public abstract class Jornada {

    /**
     * Nos indica la hora en la que inicia la jornada.
     * @return nos devuelve la hora inicial de la jornada en variable LocalTime.
     */
    public abstract LocalTime horaInicial();
    /**
     * Nos indica la hora en la que finaliza la jornada.
     * @return nos devuelve la hora final de la jornada en variable LocalTime.
     */
    public abstract LocalTime horaFinal();

    /**
     * Nos permite validar si la hora que se planea usar hace parte de la jornada.
     * @return nos devuelve falso o verdadero si hace parte de la jornada.
     */
    public abstract boolean isValido(LocalTime hora);
}
