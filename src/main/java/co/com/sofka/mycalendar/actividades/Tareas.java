package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.interfaces.Laborable;
import co.com.sofka.mycalendar.interfaces.Programable;

public class Tareas extends Actividad implements Programable, Laborable {
    /**
     * Nos permite validar si es una actividad laboral
     *
     * @return nos devuelve si es verdadero o falso si la actividad es laboral o no.
     */
    @Override
    public boolean isValido() {
        return false;
    }

    /**
     * Nos permite hacer que una actividad se repita cierta cantidad de veces.
     *
     * @param repeticiones nos indica la cantidad de días que se repetirá la actividad.
     */
    @Override
    public void agregarRepeticion(int repeticiones) {

    }

    /**
     * Nos permite hacer que una actividad se repita ciertos días.
     *
     * @param dia nos indica el día que se repetirá la actividad.
     */
    @Override
    public void agregarFrecuencia(String dia) {

    }

    /**
     * Nos permite hacer que una actividad se repita ciertos días.
     *
     * @param dias nos indica los días que se repetirá la actividad.
     */
    @Override
    public void agregarFrecuencia(String[] dias) {

    }
}
