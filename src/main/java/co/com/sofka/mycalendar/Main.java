package co.com.sofka.mycalendar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        do{

        }while(menu()!=6);
    }
    public static int menu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nMenu:"+
                "\n1) Crear actividad"+
                "\n2) Ver calendario"+
                "\n3) Ver semana"+
                "\n4) Crear semana de actividades"+
                "\n5) Cancelar actividad"+
                "\n6) Salir"+
                "\n\nSelecciona una opcion: ");
        return sc.nextInt();
    }
}
