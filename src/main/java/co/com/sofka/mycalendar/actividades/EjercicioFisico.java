package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.condiciones.Programable;

import java.time.LocalDate;

public class EjercicioFisico  extends Actividad implements Programable {
    public EjercicioFisico(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
    }

    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
