package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.DiasSemana;
import co.com.sofka.mycalendar.jornada.Jornada;
import co.com.sofka.mycalendar.jornada.Manana;

import java.time.LocalDate;

public abstract class Actividad {
    /**
     * Atributos de la clase Actividad
     */
    private String titulo;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private Jornada jornada;

    /**
     * Método constructor
     * @param titulo
     * @param fechaInicial
     * @param fechaFinal
     */
    public Actividad(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        this.titulo = titulo;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
    }

    /**
     * Método para cambiar la fecha incial y final de la actividad
     * @param fechaInicial
     * @param fechaFinal
     */
    public void cambiarFechas(LocalDate fechaInicial, LocalDate fechaFinal){
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
    }

    /**
     * Método para cambiar la fecha inicial de la actividad
     * @param fechaInicial
     */
    public void cambiarFechaInical(LocalDate fechaInicial){
        this.fechaInicial = fechaInicial;
    }

    /**
     * Metodo para camibar la fecha final de la actividad
     * @param fechaFinal
     */
    public void cambiarFechaFinal(LocalDate fechaFinal){
        this.fechaFinal = fechaFinal;
    }


    public String titulo() {
        return titulo;
    }

    public LocalDate fechaInicial() {
        return fechaInicial;
    }

    public LocalDate fechaFinal() {
        return fechaFinal;
    }

    public Jornada jornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }
}