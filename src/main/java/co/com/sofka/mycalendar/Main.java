package co.com.sofka.mycalendar;

import co.com.sofka.mycalendar.Enums.Journeys;
import co.com.sofka.mycalendar.Enums.Weekdays;
import co.com.sofka.mycalendar.actividades.Actividad;
import co.com.sofka.mycalendar.actividades.Lectura;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("Correr");
        myList.add("Saltar");
        myList.add("Viajar");

        for (String currentElement : myList) {
            int contador = 1 ;
            int contador2 =++contador ;
            LocalDate horaInicioParse = LocalDate.of(2022,0+contador2,03);
            LocalDate horaFinalParse = LocalDate.of(2022,03,0+contador2);
            Actividad lectura = new Lectura(currentElement,horaInicioParse,horaFinalParse);
            lectura.setJornada(Journeys.MORNING);
            System.out.println(lectura.toString());
            Calendario calendario = new Calendario();
        }



    }


}
