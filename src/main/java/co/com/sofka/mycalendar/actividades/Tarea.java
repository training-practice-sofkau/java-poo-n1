package co.com.sofka.mycalendar.actividades;

import java.time.LocalDate;

public abstract class Tarea extends Actividad {
    private boolean esTrabajo;

    public Tarea(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
    }

    public void setEsTrabajo(boolean esTrabajo){
        this.esTrabajo = esTrabajo;
    }
}
