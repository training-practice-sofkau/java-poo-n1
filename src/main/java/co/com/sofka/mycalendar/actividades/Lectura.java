package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;

import java.time.LocalDate;



public class Lectura extends Actividad implements Programable {

    public Lectura(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal, programable);
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }

        //TODO: validen las fechas
    }

    @Override
    public void agregarRepeticion(int repeticiones) {
        if (repeticiones <0){
            System.out.println("Introdujo un número negativo");
        }
    }
}
