package co.com.sofka.mycalendar;
import co.com.sofka.mycalendar.calendario.Semana;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    static Scanner sc=new Scanner(System.in);
    static Semana calendar=new Semana();
    public static void main(String[] args) {
        do{
        }while(menu()!=6);
    }
    public static int menu(){
        int op;
        System.out.println("\nMenu:"+
                "\n1) Crear actividad"+
                "\n2) Ver calendario"+
                "\n3) Ver semana"+
                "\n4) Crear semana de actividades"+
                "\n5) Cancelar actividad"+
                "\n6) Salir"+
                "\n\nSelecciona una opcion: ");
        op=sc.nextInt();
        seleccionMenu(op);
        return op;
    }
    public static void seleccionMenu(int op){
        String [] actividad=new String[5];
        String [] fechaInicial=new String[3];
        String [] fechaFinal=new String[3];
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/yyyy");
        LocalDate date = LocalDate.of(2023,3,28);
        switch (op){
            case 1: System.out.print("Ingrese el nombre de la actividad: ");
                    sc.nextLine();
                    actividad[0]=sc.nextLine();
                    System.out.println("Ingrese la fecha inicial de la actividad: ");
                    try{
                        // Validar que el valor ingresado sea una fecha
                        actividad[1]=sc.nextLine();
                        formatoFecha.parse(actividad[1]);
                    }catch(Exception e){
                        System.out.println("Fecha de lanzamiento tiene un formato incorrecto, utilice (dd/MM/yyyy)");
                    }
                    fechaInicial=actividad[1].split("/");

                    calendar.getDiasDeLaSemanaList().get(1).setFecha(LocalDate.of(Integer.parseInt(fechaInicial[2]),Integer.parseInt(fechaInicial[1]),Integer.parseInt(fechaInicial[0]));


        }

    }
    public int dia de
}
