package co.com.sofka.mycalendar.jornada;
import java.time.LocalTime;
public abstract class Jornada {
    private boolean tiempoLaboral;

    /**
     * Nos permite saber si es tiempo laboral o no.
     * @return Nos devuelve verdadero si es tiempo de trabajo o falso si no.
     */
    public boolean isTiempoLaboral() {
        return tiempoLaboral;
    }
    /**
     * Nos permite asignar un valor de verdad a la jornada para saber si es laboral o no.
     * @param tiempoLaboral nos indica por medio de un boolean si es tiempo laboral o no.
     */
    public void setTiempoLaboral(boolean tiempoLaboral) {
        this.tiempoLaboral = tiempoLaboral;
    }

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
