package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.time.LocalDate;

public class Lectura extends Actividad implements Programable {

    public Lectura(String titulo, LocalDate fechaInicial, LocalDate fechaFinal, Jornada jornada) {
        super(titulo, fechaInicial, fechaFinal,jornada);
        validarDatos();
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }

        //TODO: validen las fechas
    }

    public Lectura(String titulo, LocalDate fechaFinal, Jornada jornada){
        this(titulo, LocalDate.now(), fechaFinal, jornada);
        validarDatos();
    }

    @Override
    public void agregarRepeticion(int repeticiones) {

    }
    private void validarDatos() {

        if(super.titulo().isBlank()) {

            throw new IllegalArgumentException("El titulo no es valido");

        }if(super.fechaFinal().isBefore(super.fechaInicial())) {

            throw new IllegalArgumentException("Las fechas no tienen concordancia ");

        }

    }
}
