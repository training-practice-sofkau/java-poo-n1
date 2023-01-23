package co.com.sofka.mycalendar.jornada;
import java.time.LocalTime;
public class Tarde extends Jornada{
    /**
     * Nos indica la hora en la que inicia la jornada de la tarde (14:00).
     * @return nos devuelve la hora inicial de la jornada en variable LocalTime.
     */
    @Override
    public LocalTime horaInicial() {
        return LocalTime.of(14, 0);
    }
    /**
     * Nos indica la hora en la que finaliza la jornada de la tarde (18:00).
     * @return nos devuelve la hora final de la jornada en variable LocalTime.
     */
    @Override
    public LocalTime horaFinal() {
        return LocalTime.of(18, 0);
    }
    /**
     * Nos permite validar si la hora que se planea usar hace parte de la jornada.
     *
     * @return nos devuelve falso o verdadero si hace parte de la jornada.
     */
    @Override
    public boolean isValido(LocalTime hora) {
        if (hora.isBefore(this.horaInicial())||hora.isAfter(this.horaFinal())){
            return false;
        }
        return true;
    }
}
