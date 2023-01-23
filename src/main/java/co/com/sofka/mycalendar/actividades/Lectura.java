package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;

import java.time.LocalDate;

public class Lectura extends Actividad implements Programable {

    public Lectura(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        if(titulo.isBlank()) {
            throw new IllegalArgumentException("El titulo no es valido");
        } else if (titulo.isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío");
        }else {
            System.out.println("Titulo creado");
        }

        //TODO: validen las fechas
        if (fechaFinal.isEqual(fechaInicial)){
            throw new IllegalArgumentException("Las fechas no pueden ser iguales");
        } else if (fechaFinal.isBefore(fechaInicial)) {
            throw new IllegalArgumentException("La fecha final no puede ser antes de la fecha inicial");
        } else if (fechaInicial.isAfter(fechaFinal)) {
            throw new IllegalArgumentException("La fecha inicial no puede ser después de la fecha final");
        }
    }

    public Lectura(String titulo, LocalDate fechaFinal){
        this(titulo, LocalDate.now(), fechaFinal);

    }

    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
