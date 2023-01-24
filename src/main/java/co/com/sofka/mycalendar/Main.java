package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Lectura;
import co.com.sofka.mycalendar.jornada.Tarde;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Calendario calendario = new Calendario();
        LocalDate fechaFinal = LocalDate.of(2023,7,15);
        Tarde tarde= new Tarde();
        Lectura libro = new Lectura("hola mundo",fechaFinal,tarde);
        Lectura libro1 = new Lectura("REVISTA",fechaFinal,tarde);
    }


}
