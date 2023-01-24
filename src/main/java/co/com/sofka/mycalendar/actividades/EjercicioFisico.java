package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.DiasSemana;
import co.com.sofka.mycalendar.condiciones.Laborable;
import co.com.sofka.mycalendar.condiciones.Programable;
import co.com.sofka.mycalendar.jornada.Jornada;
import co.com.sofka.mycalendar.jornada.Noche;

import java.time.LocalDate;


public class EjercicioFisico  extends Actividad implements Programable, Laborable {

    private int repeticiones;
    public EjercicioFisico(String titulo, LocalDate fechaInicial, LocalDate fechaFinal, Jornada jornada, DiasSemana diasSemana) {
        super(titulo, fechaInicial, fechaFinal);
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }
        //DO: validación de fecha
        if(fechaInicial.isBefore(fechaFinal)){
            throw new IllegalArgumentException("Error en la cronología del tiempo");
        }
        if(fechaFinal().isAfter(fechaInicial)){
            throw new IllegalArgumentException("Error en la cronología del tiempo");
        }
    }

    public EjercicioFisico(String titulo, LocalDate fechaFinal, Jornada jornada, DiasSemana diasSemana) {
        this(titulo, LocalDate.now(), fechaFinal, jornada, diasSemana);
    }

    @Override
    public void agregarRepeticion(int repeticiones) {
        if(repeticiones < 0 ){
            throw new IllegalArgumentException("Ingresa un valor mayor que 0");
        }
        this.repeticiones = repeticiones;

    }

    @Override
    public boolean esValido() {



        return !(jornada() instanceof Noche);
    }
}
