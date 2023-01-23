package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.actividades.Ejercicio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Calendario calendario = new Calendario();

        calendario.agregarSemana(Semana.I);
        /* Inicio de la lógica que seguiría
         *
         * calendario.agregarActividad(new Ejercicio("Pecho", "2023-01-23", "2032-01-24","TrenInferior"));
         * calendario.actividadList[0].setTipo("TrenSuperior");*/
    }
}
