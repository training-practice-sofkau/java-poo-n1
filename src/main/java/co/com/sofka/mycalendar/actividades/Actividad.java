package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.jornada.Jornada;

import java.time.LocalDate;

public abstract class Actividad {
    private String titulo;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private Jornada jornada;

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

    public Jornada jornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }
}
