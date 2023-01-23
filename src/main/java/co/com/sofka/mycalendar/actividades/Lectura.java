package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;

import java.text.ParseException;
import java.time.LocalDate;

public class Lectura extends Actividad implements Programable {

    public Lectura(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }

        //TODO: validen las fechas
    }
public validacionFechas(LocalDate fechaInicial, LocalDate fechaFinal){
    public static boolean validarFecha(fechaInicial, fechaFinal){

        try {


        } catch (ParseException e) {


        }


    }

}

    public Lectura(String titulo, LocalDate fechaFinal){
        this(titulo, LocalDate.now(), fechaFinal);
    }

    @Override
    public void agregarRepeticion(int repeticiones) {






    }
}
