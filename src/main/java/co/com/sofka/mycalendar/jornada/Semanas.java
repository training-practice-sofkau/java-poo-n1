package co.com.sofka.mycalendar.jornada;
import java.util.Scanner;

public class Semanas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese número del día de la semana, empezando por 1 que es Lunes: ");
        if (teclado.hasNextInt()) {
            numero = teclado.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Ningún día corresponde al número " + numero);
            }
        } else
            System.err.println("Ingrese solo números");
    }

}