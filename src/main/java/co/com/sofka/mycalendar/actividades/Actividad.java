package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.time.LocalDate;


public abstract class Actividad {
    private String titulo;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private Jornada jornada;

    private Programable programable;

    int repeticiones;

    public Actividad(String titulo, LocalDate fechaInicial, LocalDate fechaFinal, Jornada jornada, Programable programable) {
        this.titulo = titulo;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.jornada = jornada;
       this.programable = programable;
    }

    public Actividad(String titulo, LocalDate fechaInicial, LocalDate fechaFinal, Programable programable) {
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

    public Programable programable() {return programable;}
    public void setProgramable(Programable programable) {this.programable = programable;}

    public String toString() {
        return "Actividad " + this.titulo + " " + "Fecha " + this.fechaInicial() + " " + this.fechaFinal;
    }


}
