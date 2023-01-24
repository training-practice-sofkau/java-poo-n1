package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Calendario;
import co.com.sofka.mycalendar.Dia;
import co.com.sofka.mycalendar.Laborable;
import co.com.sofka.mycalendar.jornada.Jornada;
import co.com.sofka.mycalendar.jornada.Manana;
import co.com.sofka.mycalendar.jornada.Noche;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import static co.com.sofka.mycalendar.Dia.*;

public class Trabajo extends Actividad implements Laborable, Jornada {



    public Trabajo(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
    }
    



    @Override
    public boolean esValido() {
        Dia d = Dia;
        if (d == Dia.SABADO || d == Dia.DOMINGO) {
            return false;
        } else {
            return true;
        }
    }


    @Override
    public LocalTime horaInicial() {
      
        return null;
    }

    @Override
    public LocalTime horaFinal() {
        return null;
    }
}