package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Calendario;
import co.com.sofka.mycalendar.jornada.Manana;

import java.time.LocalDate;

public abstract class Actividad  extends Calendario {
    private String titulo;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private Manana.Jornada jornada;

    public Actividad(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        this.titulo = titulo;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
    }

    public void cambiarFechas(LocalDate fechaInicial, LocalDate fechaFinal){
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
    }



    public void cambiarFechaInical(LocalDate fechaInicial){
        this.fechaInicial = fechaInicial;
    }

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

    public Manana.Jornada jornada() {
        return jornada;
    }

    public void setJornada(Manana.Jornada jornada) {
        this.jornada = jornada;
    }
}
