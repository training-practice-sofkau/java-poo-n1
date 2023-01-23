package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Enums.Journeys;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.time.LocalDate;

public abstract class Actividad {
    private String titulo;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private Journeys jornada;

    private int repeticiones = 1;

    public Actividad(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        this.titulo = titulo;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.repeticiones=repeticiones;
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

    public Journeys jornada() {
        return jornada;
    }

    public void setJornada(Journeys jornada) {
        this.jornada = jornada;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    @Override
    public String toString() {
        return "Actividad{" +
                "titulo='" + titulo + '\'' +
                ", fechaInicial=" + fechaInicial +
                ", fechaFinal=" + fechaFinal +
                ", jornada=" + jornada +
                ", repeticiones=" + repeticiones +
                '}';
    }
}
