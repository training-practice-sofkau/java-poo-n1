package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Lectura;

import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("12-02-2020");
        LocalDate date2 = LocalDate.parse("15-02-2020");
        Lectura prueba = new Lectura("100 años de soledad", date, date2);
        Calendario calendario = new Calendario();
        calendario.agregarActividad(prueba);
        System.out.println(calendario);
    }

}
