package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Lectura;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Calendario calendario = new Calendario();
        LocalDate fecha1=LocalDate.parse("2020-01-05");
        LocalDate fecha2=LocalDate.parse("2020-01-06");
        Lectura l1=new Lectura("Simsomp",fecha1,fecha2);
        calendario.agregarActividad(l1);

    }
}
