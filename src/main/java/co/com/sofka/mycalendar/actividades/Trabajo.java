package co.com.sofka.mycalendar.actividades;
import co.com.sofka.mycalendar.Laborable;
import co.com.sofka.mycalendar.jornada.Mañana;
import co.com.sofka.mycalendar.jornada.Tarde;

import java.time.LocalDate;

public class Trabajo extends Tarea implements Laborable {
    public Trabajo(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        this.setEsTrabajo(true);
    }

    @Override
    public boolean esValido() {
        boolean labor;
        if (this.jornada() == new Mañana() || this.jornada() == new Tarde()) {
            labor = true;
        }
        else {
            labor = false;
        }
        return labor;
    }
}
