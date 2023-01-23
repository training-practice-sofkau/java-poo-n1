package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.DiasDeLaSemana;
import co.com.sofka.mycalendar.Programable;

import java.time.LocalDate;
import java.util.Scanner;

public class EjercicioFisico extends Actividad implements Programable {

    public EjercicioFisico(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }
    }



    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
