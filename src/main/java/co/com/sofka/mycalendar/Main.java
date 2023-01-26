package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Actividad;
import co.com.sofka.mycalendar.actividades.EjercicioFisico;
import co.com.sofka.mycalendar.actividades.Lectura;
import co.com.sofka.mycalendar.jornada.Jornada;
import co.com.sofka.mycalendar.jornada.Noche;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;


public class Main {

    public static void main(String[] args) {


        Calendario calendario = new Calendario();





        calendario.agregarActividad(new Lectura("Leer Juego de tronos", LocalDate.of(2023, 05, 05), LocalDate.of(2023,11,15)));



    }
}
