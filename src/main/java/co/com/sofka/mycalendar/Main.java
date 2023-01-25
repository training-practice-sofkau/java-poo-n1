package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Deporte;
import co.com.sofka.mycalendar.actividades.Lectura;
import co.com.sofka.mycalendar.actividades.Trabajo;
import co.com.sofka.mycalendar.diassemana.DiasSemana;
import co.com.sofka.mycalendar.jornada.Jornada;
import co.com.sofka.mycalendar.jornada.Manana;
import co.com.sofka.mycalendar.jornada.Noche;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        Calendario calendario = new Calendario();

        Deporte trotar = new Deporte("trotar", LocalDate.of(2023,2,5),LocalDate.of(2023,2,25));
        trotar.setJornada(new Manana());
        trotar.setDiaProgramado(DiasSemana.Lunes);
        trotar.agregarRepeticion(); //Implementación polimorfica del metodo para deporte

        calendario.agregarActividad(trotar);

        System.out.println("----------------------------------");
        System.out.println("\n");

        Lectura leer = new Lectura("leer", LocalDate.of(2023,2,6),LocalDate.of(2023,2,27));
        leer.setJornada(new Noche());
        leer.setDiaProgramado(DiasSemana.Domingo);
        leer.agregarRepeticion(); //Implementación polimorfica del metodo para leer

        calendario.agregarActividad(leer);

        System.out.println("----------------------------------");
        System.out.println("\n");

        Trabajo trabajo = new Trabajo("trabajo", LocalDate.of(2023,2,6),LocalDate.of(2023,2,27));
        trabajo.setJornada(new Noche()); //Jornada noche NO asignable a actividad laborable
        trabajo.setJornada(new Manana()); //Jornada mañana SI es asignable a actividad laborable
        trabajo.setDiaProgramado(DiasSemana.Martes);

        calendario.agregarActividad(trabajo);

        System.out.println("Haz agregado exitosamente una actividad: ");

    }
}
