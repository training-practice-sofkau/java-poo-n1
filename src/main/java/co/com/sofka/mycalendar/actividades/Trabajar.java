package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.DiasDeLaSemana;
import co.com.sofka.mycalendar.Laborable;

import java.time.LocalDate;
import java.util.Scanner;

public class Trabajar extends Actividad implements Laborable {
    public Trabajar(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
    }


    @Override
    public boolean esValido() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Que día de la semana quieres programar esta actividad");
        String dia = sn.next();

        DiasDeLaSemana dias = DiasDeLaSemana.valueOf(dia.toUpperCase());

        switch (dias){
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El día "+ dia + "es laborable");
                return true;
            case SABADO:
            case DOMINGO:
                System.out.println("El día "+ dia + "no es laborable");
                return false;
        }
        return false;
    }
}
