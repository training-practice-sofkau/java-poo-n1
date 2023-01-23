package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.jornada.Jornada;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Actividad {
    private final String titulo;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private Jornada jornada;
    private int horaInicial;
    private int horaFinal;

    public Actividad(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        this.titulo = titulo;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
    }

    public void cambiarFechas(LocalDate fechaInicial, LocalDate fechaFinal) {
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
    }

    public void cambiarFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public void cambiarFechaFinal(LocalDate fechaFinal) {
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
        if (jornada.horaFinal().isAfter(LocalTime.from(this.fechaFinal()))
                && LocalTime.from(this.fechaInicial()).isAfter(jornada.horaInicial())) {
            this.jornada = jornada;
        } else {
            throw new IllegalArgumentException("La actividad no coincide con las horas de la jornada indicada");
        }
    }
    public void setHoraInicial(int horaInicial){
        this.horaInicial = horaInicial;
    }

    public void setHoraFinal(int horaFinal) {
        this.horaFinal = horaFinal;
    }
}
