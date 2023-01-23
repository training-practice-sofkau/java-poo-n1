package co.com.sofka.mycalendar.actividades;
import co.com.sofka.mycalendar.Laborable;
import co.com.sofka.mycalendar.jornada.Mañana;

import java.time.LocalDate;

public class Universidad extends Tarea implements Laborable {
    public Universidad(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        this.setEsTrabajo(false);
    }

    @Override
    public boolean esValido() {
        boolean labor;
        if (this.jornada() == new Mañana()) {
            labor = true;
        }
        else {
            labor = false;
        }
        return labor;
    }
}
