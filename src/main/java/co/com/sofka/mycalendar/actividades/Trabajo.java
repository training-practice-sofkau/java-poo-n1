package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Laborable;
import co.com.sofka.mycalendar.Programable;

import java.time.LocalDate;
import java.util.Scanner;

public class Trabajo extends Actividad implements Laborable, Programable {
    public Trabajo(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
    }

    @Override
    public boolean esValido() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Que día de la semana quieres programar esta actividad");
        String dia = sn.next();

        DiasDeLaSemana dias = DiasDeLaSemana.valueOf(dia.toUpperCase());

        switch (dias) {
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El día " + dia + "es laborable");
            case SABADO:
            case DOMINGO:
                System.out.println("El día " + dia + "no es laborable");
                return true;
        }
        return false;
    }

    @Override
    public void agregarRepeticion(int repeticiones) {

    }
}
