package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.calendario.Calendario;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Calendario calendario = new Calendario();
        calendario.agregarActividadLectura("Leer novelas", LocalDate.of(2023,1,23), LocalDate.of(2023,3,24));
        calendario.agregarActividadLectura("Leer periodico", LocalDate.of(2023,1,23), LocalDate.of(2023,3,24));


        calendario.agregarActividadEjercicioFisico("Trotar", LocalDate.of(2023,1,23), LocalDate.of(2023,3,24));
        calendario.agregarActividadEjercicioFisico("Yoga", LocalDate.of(2023,1,23), LocalDate.of(2023,3,24));

        calendario.agregarActividadTareas("Programar actividades", LocalDate.of(2023,1,23), LocalDate.of(2023,3,24));
        calendario.agregarActividadTareas("Pasear a los perros", LocalDate.of(2023,1,23), LocalDate.of(2023,3,24));

        calendario.agregarActividadTrabajo("Desarrollar app", LocalDate.of(2023,1,23), LocalDate.of(2023,3,24));
        calendario.agregarActividadTrabajo("Atender requerimientos", LocalDate.of(2023,1,23), LocalDate.of(2023,3,24));

    }
}
