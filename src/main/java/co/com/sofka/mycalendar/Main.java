package co.com.sofka.mycalendar;



import co.com.sofka.mycalendar.actividades.Actividad;
import co.com.sofka.mycalendar.jornada.Jornada;
import co.com.sofka.mycalendar.jornada.Mañana;
import co.com.sofka.mycalendar.jornada.Noche;


import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

        Calendario calendario = new Calendario();
        Jornada jornadaMañana = new Mañana();
        Jornada jornadaNoche = new Noche();

        LocalDate fechaInicial = LocalDate.of(2022, 1, 1);
        LocalDate fechaFinal = LocalDate.of(2022, 12, 31);

        calendario.addActividadLectura("Libro de programación", fechaInicial, fechaFinal, jornadaMañana);
        calendario.addActividadLectura("Libro de matemáticas", fechaInicial, fechaFinal, jornadaNoche);

        for (Actividad actividad : calendario.getActividades()) {
            System.out.println("-----------------------");
            System.out.println("Título de la actividad: " + actividad.titulo());
            System.out.println("Fecha inicial: " + actividad.fechaInicial());
            System.out.println("Fecha final: " + actividad.fechaFinal());
            System.out.println("Jornada: " + actividad.jornada());
            System.out.println("-----------------------");
        }
    }
}
