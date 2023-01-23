package co.com.sofka.mycalendar;

import java.util.Scanner;

public class Semana {

    public static void main (String[]args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un numero");
        if (teclado.hasNextInt()){
            numero = teclado.nextInt();

            switch (numero){
                case 1: System.out.println("Domingo"); break;
                case 2: System.out.println("Lunes"); break;
                case 3: System.out.println("Martes"); break;
                case 4: System.out.println("Miercoles"); break;
                case 5: System.out.println("Jueves"); break;
                case 6: System.out.println("Viernes"); break;
                case 7: System.out.println("Sabado"); break;
                default: System.out.println("Ningun dia corresponde al" + numero);
            }
        }else
            System.err.println("Ingrese solo numeros");
    }


}
