package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Interfaces.Programable;

import java.time.LocalDate;

public class EjercicioFisico  extends Actividad implements Programable {
    public EjercicioFisico(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }
    }

    public EjercicioFisico(String titulo, LocalDate fechaFinal) {
        this(titulo, LocalDate.now(), fechaFinal);
    }


    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
