package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Lectura extends Actividad implements Programable {

    public Lectura(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        if (titulo.isBlank()) {
            throw new IllegalArgumentException("El titulo no es valido");
        }

        //TODO: validen las fechas
    }


    public static boolean esFechaValida(String date) {
        //se crear un objeto mediante el metodo ofpattern
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate.parse(date, formato);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }


    public Lectura(String titulo, LocalDate fechaFinal) {
        this(titulo, LocalDate.now(), fechaFinal);
    }

    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
