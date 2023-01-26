package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Dia;
import co.com.sofka.mycalendar.Programable;
import co.com.sofka.mycalendar.jornada.Jornada;

import java.time.LocalDate;
import java.time.LocalTime;

public class EjercicioFisico extends Actividad implements Programable, Jornada {


    public EjercicioFisico(String titulo, LocalDate fechaInicial, LocalDate fechaFinal, Jornada jornada, Programable programable) {
        super(titulo, fechaInicial, fechaFinal, jornada, programable);
    }


    @Override
    public void agregarRepeticion(int repeticiones) {
        if (repeticiones <0){
            System.out.println("Introdujo un número negativo");
        }
    }



    @Override
    public LocalTime horaInicial() {
        return LocalTime.of(19, 30);
    }

    @Override
    public LocalTime horaFinal() {
        return LocalTime.of(20,15);
    }



}


