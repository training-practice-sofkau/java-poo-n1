package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;

import java.time.LocalDate;

public class EjercicioFisico extends Actividad implements Programable {
    public EjercicioFisico(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
    }


    @Override
    public void agregarRepeticion(int repeticiones) {
        if (repeticiones <0){
            System.out.println("Introdujo un número negativo");
        }
    }
}
