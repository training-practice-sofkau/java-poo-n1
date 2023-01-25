package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.diassemana.DiasSemana;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.time.LocalDate;

public abstract class Actividad {
    private String titulo;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private Jornada jornada;
    private DiasSemana diaProgramado;

    public Actividad(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        this.titulo = titulo;
        this.fechaInicial = LocalDate.from(fechaInicial);
        this.fechaFinal = LocalDate.from(fechaFinal);
    }

    public void cambiarFechas(LocalDate fechaInicial, LocalDate fechaFinal){
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
    }

    public void cambiarFechaInical(LocalDate fechaInicial){
        this.fechaInicial = fechaInicial;
        System.out.println("Se cambio la fecha inicial "+ fechaInicial + " a la actividad: '" + this.titulo + "'");
    }

    public void cambiarFechaFinal(LocalDate fechaFinal){
        this.fechaFinal = fechaFinal;
        System.out.println("Se cambio la fecha final "+ fechaFinal + " a la actividad: '" + this.titulo + "'");
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
        System.out.println("Se asigno la jornada "+ jornada.nombreJornada() + " a la actividad: '" + this.titulo + "'");
    }

    public DiasSemana diaProgramado() {
        return diaProgramado;
    }

    public void setDiaProgramado(DiasSemana diaProgramado) {
        this.diaProgramado = diaProgramado;
        System.out.println("Se asigno el día se la semana "+ diaProgramado + " a la actividad: '" + this.titulo + "'");
    }
}
