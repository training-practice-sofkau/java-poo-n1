package co.com.sofka.mycalendar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calendario calendario = new Calendario();

        //Se pide datos de entrada
        System.out.println("Ingresa año ");
        var anio = entrada.nextLine();
        //Proceso
        for(int i =1 ; i<= 12; i++){
            System.out.println("Mes: " + i);
        }

    }
}
