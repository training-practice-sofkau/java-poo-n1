package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Lectura;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        LocalDate date1 = LocalDate.parse("2023-02-22");
        Lectura prueba = new Lectura("100 años de soledad", date1);
        Calendario calendario = new Calendario();
        calendario.agregarActividad(prueba);
        System.out.println(calendario);
    }

}
