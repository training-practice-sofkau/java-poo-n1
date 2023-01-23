package co.com.sofka.mycalendar.actividades;
import co.com.sofka.mycalendar.interfaces.Laborable;
import co.com.sofka.mycalendar.interfaces.Programable;

import java.time.LocalDate;
import java.time.LocalTime;

public class Lectura extends Actividad implements Programable, Laborable {

    public Lectura(String titulo, LocalDate fechaInicial, LocalDate fechaFinal, LocalTime duracion) {
        super(titulo, fechaInicial, fechaFinal,duracion);
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }

        //TODO: validen las fechas
    }

    public Lectura(String titulo, LocalDate fechaFinal, LocalTime duracion){
        this(titulo, LocalDate.now(), fechaFinal,duracion);
    }

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

    /**
     * Nos permite validar si es una actividad laboral
     *
     * @return nos devuelve si es verdadero o falso si la actividad es laboral o no.
     */
    @Override
    public boolean isValido() {
        return false;
    }
}
